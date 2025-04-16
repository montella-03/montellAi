package com.montella.ai.service;

import reactor.core.publisher.Flux;

public interface AzureOpenAIService {
    String getClaimSummary();

    String getClaimComment(String claimNumber);

    String getPatientClaimAnalysis(String patientId);
}
