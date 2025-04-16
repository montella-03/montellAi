package com.montella.ai.service;

import com.github.javafaker.Faker;
import com.montella.ai.dataTypes.ClaimStatus;
import com.montella.ai.testData.ClaimTestData;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ClaimService {
    private static final Logger logger = LoggerFactory.getLogger(ClaimService.class);
    private final List<String> claimDataList = new ArrayList<>();
    private static final Faker faker = new Faker();

    @Tool(name = "claimData", description = "Claim data for analysis")
    public List<String> getClaimData() {
        return claimDataList;
    }

    @Tool(name = "claimDataPerPatient", description = "Claim data  per patient for analysis")
    public List<String> getClaimDataPerPatient(String patientId) {
        List<String> filteredClaims = new ArrayList<>();

        for (String claim : claimDataList) {
            if (claim.contains(patientId)) {
                filteredClaims.add(claim);
            }
        }

        return filteredClaims;
    }

    @Tool(name = "claimNumber", description = "Claim number for analysis")
    public List<String> getClaimNumber(String claimNumber) {
        List<String> filteredClaims = new ArrayList<>();

        for (String claim : claimDataList) {
            if (claim.contains(claimNumber)) {
                filteredClaims.add(claim);
            }
        }
        return filteredClaims;
    }


    @PostConstruct
    public void init() {

        for (int i = 0; i < 3; i++) {
            String claim = ClaimTestData.getClaimTestData(i == 0 ? "123456789" : UUID.randomUUID().toString(),
                    faker.idNumber().valid(),
                    faker.name().fullName(),
                    faker.idNumber().valid(),
                    faker.name().fullName(),
                    String.valueOf(faker.options().option(ClaimStatus.class)));
            claimDataList.add(claim);
        }


    }


}
