package com.montella.ai.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
/**
 * ClaimData class represents the data structure for a claim.
 * It contains various fields related to the claim, patient, and member information.
 */
public class ClaimData {
    private String claimId;
    private String claimReferenceNumber;
    private String claimNumber;
    private UUID patientPublicId;
    private String patientFullName;
    private String patientGender;
    private String patientPhoneNumber;
    private String patientMembershipNumber;
    private Date patientDateJoined;
    private String patientMemberCardNumber;
    private String patientSchemeName;
    private String patientMemberCoverCombinationName;
    private String memberPublicId;
    private String memberFullName;
    private String memberGender;
    private String memberPhoneNumber;
    private String membershipNumber;
    private Date memberDateJoined;
    private String memberCardNumber;
    private String schemePublicId;
    private String schemeName;
    private String memberCoverCombinationName;
    private String providerName;
    private BigDecimal requestedAmount;
    private BigDecimal approvedAmount;
    private BigDecimal paidAmount;
    private List<String> diagnosis;
}
