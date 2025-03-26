package com.montella.ai.service;

import com.montella.ai.tools.ClaimTools;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

@Service
public class AnagramServiceImpl implements AnagramService {
    private final ChatClient chatClient;

    public AnagramServiceImpl(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();}

    @Override
    public String getClaimAnalysis(String claimNumber) throws IOException {
            ChatClient.CallResponseSpec analysisResponse = chatClient
                    .prompt(String.format("Based on the information associated with this claim number %s , as claimNumber: %s" +
                                    " provide an analysis of the claim and the patient diagnosis and projected approvals.",
                            claimNumber, claimNumber))
                    .tools(new ClaimTools())
                    .call();

            return analysisResponse.content();
    }
}
