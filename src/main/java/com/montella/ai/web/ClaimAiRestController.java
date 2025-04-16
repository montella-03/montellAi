package com.montella.ai.web;

import com.montella.ai.service.AzureOpenAIService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping("/api/claim")
public class ClaimAiRestController {
    private final AzureOpenAIService AzureOpenAIService;

    public ClaimAiRestController(AzureOpenAIService AzureOpenAIService) {
        this.AzureOpenAIService = AzureOpenAIService;
    }

    @GetMapping(value = "/")
    public String getClaimSummary() {
        log.info("Getting claim summary");
        return AzureOpenAIService.getClaimSummary();
    }

    @GetMapping("/claimData/{claimNumber}")
    public String getClaimComment(@PathVariable(name = "claimNumber") String claimNumber) {
        log.info("Getting claim data");
        return AzureOpenAIService.getClaimComment(claimNumber);
    }

    @GetMapping("/claimDataPerPatient/{patientId}")
    public String getClaimDataPerPatient(@PathVariable(name = "patientId") String patientId) {
        log.info("Getting claim data per patient");
        return AzureOpenAIService.getPatientClaimAnalysis(patientId);
    }

}
