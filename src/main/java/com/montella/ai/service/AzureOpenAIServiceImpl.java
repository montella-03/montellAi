package com.montella.ai.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.messages.Message;
import org.springframework.ai.chat.messages.UserMessage;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.SystemPromptTemplate;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Service class to interact with Azure OpenAI for healthcare claim analysis.
 * This class provides methods to analyze patient claims, generate comments, and check for fraudulent claims.
 * It uses the Azure OpenAI chat model to process requests and return responses.
 */

@Slf4j
@Service
public class AzureOpenAIServiceImpl implements AzureOpenAIService {
    private final ChatClient chatClient;
    private final ToolCallbackProvider claimDataTools;

    public AzureOpenAIServiceImpl(ChatClient.Builder chatClientBuilder, List<ToolCallback> toolCallbacks, ToolCallbackProvider claimDataTools) {
        this.chatClient = chatClientBuilder.build();
        this.claimDataTools = claimDataTools;
    }


    @Override
    public String getPatientClaimAnalysis(String patientId) {
        String systemMessage = """
                You are a helpful assistant that specializes in analyzing healthcare claim data.
                When asked about claims for a specific patient, use the 'claimData per patient' tool.
                Provide a detailed analysis of the claims including patterns, totals, and any notable observations.
                """;

        String userMessage = String.format("""
                Analyze the claim data for patient with ID: %s.
                Provide a detailed summary including:
                1. Total number of claims
                2. Breakdown by claim type
                3. Total claim amounts
                4. Any patterns or anomalies
                """, patientId);

        SystemPromptTemplate systemPromptTemplate = new SystemPromptTemplate(systemMessage);
        Message systemMessageObj = systemPromptTemplate.createMessage();


        Prompt prompt = new Prompt(
                List.of(
                        systemMessageObj,
                        new UserMessage(userMessage)
                )

        );

        log.info("claim tools: {}", claimDataTools);


        return chatClient.prompt(prompt)
                .tools(claimDataTools)
                .call()
                .content();
    }

    // give a comment about this claim, brief not more than 50 words

    @Override
    public String getClaimComment(String claimNumber) {
        String systemMessage = """
                You are a helpful assistant that specializes in analyzing healthcare claim data.
                When asked about claims for a specific claim number, provide a brief comment about the claim.
                """;

        String userMessage = String.format("Provide a brief comment about the claim with number: %s", claimNumber);

        SystemPromptTemplate systemPromptTemplate = new SystemPromptTemplate(systemMessage);
        Message systemMessageObj = systemPromptTemplate.createMessage();


        Prompt prompt = new Prompt(
                List.of(
                        systemMessageObj,
                        new UserMessage(userMessage)
                )
        );


        return chatClient.prompt(prompt)
                .tools(claimDataTools)
                .call()
                .content();
    }


    // with the claim data, give a summary of requested amount , approval amounts and paid amounts for all paid claims

    @Override
    public String getClaimSummary() {

        String systemMessage = """
                You are a helpful assistant that specializes in analyzing healthcare claim data.
                When asked about claims, provide a summary of the claims, diagnosis and projections of approval rates.
                 As readable as possible. Keeping in mind all currencies are in Ksh.
                """;

        String userMessage = "From the claim data provided as a tool,give a summary of all claims.";

        SystemPromptTemplate systemPromptTemplate = new SystemPromptTemplate(systemMessage);
        Message systemMessageObj = systemPromptTemplate.createMessage();

        Prompt prompt = new Prompt(
                List.of(
                        systemMessageObj,
                        new UserMessage(userMessage)
                )
        );


        return chatClient.prompt(prompt)
                .tools(claimDataTools)
                .call()
                .content();
    }


    public String getClaimFraudWarning(String claimNumber) {

        /**
         *  We can set Fraudulent parameters in the system settings,
         */
        String systemMessage = """
                You are a helpful assistant that specializes in analyzing healthcare claim data.
                When asked about claims, provide a warning if a claim is fraudulent.
                Following are the fraudulent parameters:
                
                1. Claim amount exceeds the average claim amount for similar claims.
                2. Claim submitted multiple times for the same service.
                3. Claim raise for a service not covered by the patient's insurance.
                4. Claim submitted by a provider with a history of fraudulent claims.
                5. Claim submitted for a service not received by the patient.
                6. Claim submitted for a service not performed by the provider.
                7.Patient attended multiple providers for the same service for a short period of time.
                
                """;

        String userMessage = String.format("Check if the claim with number: %s is fraudulent.", claimNumber);

        SystemPromptTemplate systemPromptTemplate = new SystemPromptTemplate(systemMessage);
        Message systemMessageObj = systemPromptTemplate.createMessage();


        Prompt prompt = new Prompt(
                List.of(
                        systemMessageObj,
                        new UserMessage(userMessage)
                )
        );

        return chatClient.prompt(prompt)
                .tools(claimDataTools)
                .call()
                .content();
    }

}