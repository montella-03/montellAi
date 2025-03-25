package com.montella.ai.runner;

import com.montella.ai.service.AnagramService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.ByteArrayOutputStream;

@Component
@Slf4j
public class ClaimAnalysisRunner implements CommandLineRunner {
    private final AnagramService anagramService;

    public ClaimAnalysisRunner(AnagramService anagramService) {
        this.anagramService = anagramService;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Claim Analysis Runner");

        String claimNumber = "DC-9876543210";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        anagramService.getClaimAnalysis(claimNumber).writeTo(outputStream);

        log.info("Claim Analysis: {}", outputStream);
    }
}
