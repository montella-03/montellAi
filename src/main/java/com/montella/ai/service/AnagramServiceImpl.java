package com.montella.ai.service;

import com.montella.ai.tools.ClaimTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.util.Objects;

@Service
public class AnagramServiceImpl implements AnagramService {
    private final ChatClient chatClient;

    public AnagramServiceImpl(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();}

    @Override
    public StreamingResponseBody getClaimAnalysis(String claimNumber) {
        return outputStream -> {
            ChatClient.CallResponseSpec analysisResponse = chatClient
                    .prompt(String.format("Based on the information associated with this claim number %s , as claimNumber: %s" +
                            " provide an analysis of the claim and  the patient  diagnosis and projected approvals", claimNumber, claimNumber))
                    .tools(new ClaimTools())
                    .call();

            outputStream.write(Objects.requireNonNull(analysisResponse.content()).getBytes());
            outputStream.flush();
        };
    }
}
