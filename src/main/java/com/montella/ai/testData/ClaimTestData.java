package com.montella.ai.testData;

public class ClaimTestData {
    public static String getClaimTestData(String claimNumber,String memberShipNumber,String patientName,String principalMemberNumber,
                                          String principalName,String claimStatus) {
        return String.format("{\n" +
                "  \"deleted\": false,\n" +
                "  \"creationTime\": \"2025-03-25 10:37\",\n" +
                "  \"createdBy\": {\n" +
                "    \"publicId\": \"17e0f41e-f0c1-4c43-981e-46095d44780d\",\n" +
                "    \"fullName\": \"Demo Account\"\n" +
                "  },\n" +
                "  \"tenant\": \"48f23ef1-93cf-4f7f-a421-538a4024de94\",\n" +
                "  \"id\": \"67e2875eead23e18480bf8a9\",\n" +
                "  \"claimNumber\": \"%s\",\n" +
                "  \"claimBatch\": null,\n" +
                "  \"patient\": {\n" +
                "    \"publicId\": \"e74784e7-fce8-47e8-986b-540dbb09d5bd\",\n" +
                "    \"membershipNumber\": \"%s\",\n" +
                "    \"person\": {\n" +
                "      \"fullName\": \"%s\",\n" +
                "      \"gender\": \"MALE\",\n" +
                "      \"phoneNumber\": \"254788377466463\",\n" +
                "      \"physicalAddress\": null,\n" +
                "      \"child\": false,\n" +
                "      \"age\": 15\n" +
                "    },\n" +
                "    \"memberType\": \"Principal\",\n" +
                "    \"vip\": true,\n" +
                "    \"staffId\": \"GH-091\"\n" +
                "  },\n" +
                "  \"principalMember\": {\n" +
                "    \"publicId\": \"e74784e7-fce8-47e8-986b-540dbb09d5bd\",\n" +
                "    \"membershipNumber\": \"%s\",\n" +
                "    \"person\": {\n" +
                "      \"fullName\": \"%s\",\n" +
                "      \"gender\": \"MALE\",\n" +
                "      \"phoneNumber\": \"254788377466463\",\n" +
                "      \"physicalAddress\": null,\n" +
                "      \"child\": false,\n" +
                "      \"age\": 15\n" +
                "    },\n" +
                "    \"memberType\": \"Principal\",\n" +
                "    \"vip\": true,\n" +
                "    \"staffId\": \"GH-091\"\n" +
                "  },\n" +
                "  \"comments\": [\n" +
                "\n" +
                "  ],\n" +
                "  \"providerDto\": {\n" +
                "    \"publicId\": \"258124c8-4f14-4426-b505-2f03399012f5\",\n" +
                "    \"providerName\": \"The Nairobi Hospital (Hospital Level 6)\",\n" +
                "    \"status\": \"ACTIVE\",\n" +
                "    \"providerDepartments\": [\n" +
                "      {\n" +
                "        \"publicId\": \"4d5b810b-e02d-4ca5-b3c5-2e56bbe2945a\",\n" +
                "        \"departmentName\": \"Pharmacy\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"publicId\": \"8e2c07bd-1601-4211-ba20-58ea377d2181\",\n" +
                "        \"departmentName\": \"Radiology\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"publicId\": \"ffbda94d-2379-4e3d-ae46-92105aae12a0\",\n" +
                "        \"departmentName\": \"Maternity\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"publicId\": \"e8f48c87-e477-4a32-96fb-18941837d674\",\n" +
                "        \"departmentName\": \"DENTAL DEPARTMENTS\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"publicId\": \"447386d7-9abe-45dc-83ff-bc186d5386f7\",\n" +
                "        \"departmentName\": \"Laboratory\"\n" +
                "      }\n" +
                "    ],\n" +
                "    \"tenant\": \"176c01d9-4034-49ce-ba03-8d6f1907caf5\",\n" +
                "    \"currency\": {\n" +
                "      \"publicId\": \"dbec709d-df0e-4b5a-bb29-96bdf940980e\",\n" +
                "      \"code\": \"KES\",\n" +
                "      \"name\": \"Kenyan Shilling\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"events\": [\n" +
                "    {\n" +
                "      \"eventDate\": \"2025-03-25 10:37\",\n" +
                "      \"event\": \"Open\",\n" +
                "      \"by\": {\n" +
                "        \"publicId\": \"17e0f41e-f0c1-4c43-981e-46095d44780d\",\n" +
                "        \"fullName\": \"Demo Account\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"eventDate\": \"2025-03-25 10:37\",\n" +
                "      \"event\": \"Require_Authorization\",\n" +
                "      \"by\": {\n" +
                "        \"publicId\": \"17e0f41e-f0c1-4c43-981e-46095d44780d\",\n" +
                "        \"fullName\": \"Demo Account\"\n" +
                "      }\n" +
                "    },\n" +
                "    {\n" +
                "      \"eventDate\": \"2025-03-25 10:37\",\n" +
                "      \"event\": \"Locked\",\n" +
                "      \"by\": {\n" +
                "        \"publicId\": null,\n" +
                "        \"fullName\": \"SYSTEM\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"rejectionReasons\": [\n" +
                "\n" +
                "  ],\n" +
                "  \"invoices\": [\n" +
                "    {\n" +
                "      \"deleted\": false,\n" +
                "      \"creationTime\": \"2025-03-25 10:37\",\n" +
                "      \"createdBy\": null,\n" +
                "      \"tenant\": null,\n" +
                "      \"id\": \"67e2875eead23e18480bf8a8\",\n" +
                "      \"type\": \"Products\",\n" +
                "      \"invoiceDate\": \"2025-03-25T10:37:18.623+00:00\",\n" +
                "      \"deductionType\": null,\n" +
                "      \"payerType\": null,\n" +
                "      \"payerInfo\": null,\n" +
                "      \"invoiceNumber\": \"1009488\",\n" +
                "      \"payee\": {\n" +
                "        \"publicId\": \"258124c8-4f14-4426-b505-2f03399012f5\",\n" +
                "        \"description\": \"Enock Simiyu Wangila\",\n" +
                "        \"payeeType\": \"Customer\"\n" +
                "      },\n" +
                "      \"payees\": null,\n" +
                "      \"invoiceType\": \"Single\",\n" +
                "      \"invoiceStatus\": \"Pending\",\n" +
                "      \"invoiceSetupType\": null,\n" +
                "      \"invoiceItems\": [\n" +
                "        {\n" +
                "          \"deleted\": false,\n" +
                "          \"creationTime\": \"2025-03-25 10:37\",\n" +
                "          \"createdBy\": null,\n" +
                "          \"tenant\": null,\n" +
                "          \"id\": \"de1ada1e-4cee-4580-9447-36b1a518a2f8\",\n" +
                "          \"invoiceDepartment\": {\n" +
                "            \"publicId\": \"e8f48c87-e477-4a32-96fb-18941837d674\",\n" +
                "            \"departmentName\": \"DENTAL DEPARTMENTS (Accredited)\",\n" +
                "            \"planDepartmentPublicId\": null\n" +
                "          },\n" +
                "          \"products\": [\n" +
                "            {\n" +
                "              \"deleted\": false,\n" +
                "              \"creationTime\": \"2025-03-25 10:37\",\n" +
                "              \"createdBy\": null,\n" +
                "              \"tenant\": null,\n" +
                "              \"copayAmount\": 0,\n" +
                "              \"id\": \"06d84ed2-53f2-4092-96b8-00343eadf2a0\",\n" +
                "              \"description\": \"Dental\",\n" +
                "              \"productId\": null,\n" +
                "              \"quantity\": 1,\n" +
                "              \"pricePerUnit\": 1000,\n" +
                "              \"lineTotal\": 1000,\n" +
                "              \"copay\": null,\n" +
                "              \"payableTotal\": 1000,\n" +
                "              \"totalDeductionsAmount\": 0,\n" +
                "              \"amountApproved\": 0,\n" +
                "              \"discount\": 0,\n" +
                "              \"clientToPayAmount\": null,\n" +
                "              \"comments\": [\n" +
                "\n" +
                "              ],\n" +
                "              \"acceptanceComment\": null,\n" +
                "              \"approvalComment\": null,\n" +
                "              \"accepted\": false,\n" +
                "              \"approved\": false,\n" +
                "              \"paid\": false,\n" +
                "              \"rejected\": false,\n" +
                "              \"verified\": false,\n" +
                "              \"clientToPay\": false,\n" +
                "              \"isBillable\": true,\n" +
                "              \"deductions\": [\n" +
                "\n" +
                "              ],\n" +
                "              \"rejectionReasons\": [\n" +
                "\n" +
                "              ],\n" +
                "              \"department\": {\n" +
                "                \"publicId\": \"e8f48c87-e477-4a32-96fb-18941837d674\",\n" +
                "                \"departmentName\": \"DENTAL LAB DEPARTMENTS (Accredited)\",\n" +
                "                \"planDepartmentPublicId\": null\n" +
                "              },\n" +
                "              \"planName\": null,\n" +
                "              \"subscriptionItemPublicId\": null,\n" +
                "              \"billable\": true\n" +
                "            }\n" +
                "          ],\n" +
                "          \"invoiceItemTotalAmount\": 1000,\n" +
                "          \"invoiceItemTotalApprovedAmount\": 0,\n" +
                "          \"invoiceItemPayableTotalAmount\": 0,\n" +
                "          \"initialAmount\": null,\n" +
                "          \"invoiceTotalDeductionAmount\": 0\n" +
                "        },\n" +
                "        {\n" +
                "          \"deleted\": false,\n" +
                "          \"creationTime\": \"2025-03-25 10:37\",\n" +
                "          \"createdBy\": null,\n" +
                "          \"tenant\": null,\n" +
                "          \"id\": \"90735618-f691-4c77-8a90-d934772b35d4\",\n" +
                "          \"invoiceDepartment\": {\n" +
                "            \"publicId\": \"447386d7-9abe-45dc-83ff-bc186d5386f7\",\n" +
                "            \"departmentName\": \"Laboratory (Accredited)\",\n" +
                "            \"planDepartmentPublicId\": null\n" +
                "          },\n" +
                "          \"products\": [\n" +
                "            {\n" +
                "              \"deleted\": false,\n" +
                "              \"creationTime\": \"2025-03-25 10:37\",\n" +
                "              \"createdBy\": null,\n" +
                "              \"tenant\": null,\n" +
                "              \"copayAmount\": 0,\n" +
                "              \"id\": \"7ce10bc8-763d-46a9-95e7-e3155bf1d0d8\",\n" +
                "              \"description\": \"Lab\",\n" +
                "              \"productId\": null,\n" +
                "              \"quantity\": 1,\n" +
                "              \"pricePerUnit\": 9000,\n" +
                "              \"lineTotal\": 9000,\n" +
                "              \"copay\": null,\n" +
                "              \"payableTotal\": 9000,\n" +
                "              \"totalDeductionsAmount\": 0,\n" +
                "              \"amountApproved\": 0,\n" +
                "              \"discount\": 0,\n" +
                "              \"clientToPayAmount\": null,\n" +
                "              \"comments\": [\n" +
                "\n" +
                "              ],\n" +
                "              \"acceptanceComment\": null,\n" +
                "              \"approvalComment\": null,\n" +
                "              \"accepted\": false,\n" +
                "              \"approved\": false,\n" +
                "              \"paid\": false,\n" +
                "              \"rejected\": false,\n" +
                "              \"verified\": false,\n" +
                "              \"clientToPay\": false,\n" +
                "              \"isBillable\": true,\n" +
                "              \"deductions\": [\n" +
                "\n" +
                "              ],\n" +
                "              \"rejectionReasons\": [\n" +
                "\n" +
                "              ],\n" +
                "              \"department\": {\n" +
                "                \"publicId\": \"447386d7-9abe-45dc-83ff-bc186d5386f7\",\n" +
                "                \"departmentName\": \"Laboratory (Accredited)\",\n" +
                "                \"planDepartmentPublicId\": null\n" +
                "              },\n" +
                "              \"planName\": null,\n" +
                "              \"subscriptionItemPublicId\": null,\n" +
                "              \"billable\": true\n" +
                "            }\n" +
                "          ],\n" +
                "          \"invoiceItemTotalAmount\": 9000,\n" +
                "          \"invoiceItemTotalApprovedAmount\": 0,\n" +
                "          \"invoiceItemPayableTotalAmount\": 0,\n" +
                "          \"initialAmount\": null,\n" +
                "          \"invoiceTotalDeductionAmount\": 0\n" +
                "        }\n" +
                "      ],\n" +
                "      \"isNHIFCardAvailable\": false,\n" +
                "      \"isNHIFCardValid\": false,\n" +
                "      \"invoiceTotalAmount\": 10000,\n" +
                "      \"invoiceTotalApprovedAmount\": 0,\n" +
                "      \"invoicePayableTotalAmount\": 10000.00,\n" +
                "      \"invoicePaidAmount\": 0,\n" +
                "      \"invoiceBalanceAmount\": 10000.00,\n" +
                "      \"departments\": null,\n" +
                "      \"initialInvoiceAmount\": null,\n" +
                "      \"provider\": null,\n" +
                "      \"approvalComment\": null,\n" +
                "      \"approvalDate\": null,\n" +
                "      \"payments\": [\n" +
                "\n" +
                "      ],\n" +
                "      \"invoiceTotalDeductionAmount\": 0,\n" +
                "      \"withHoldingTax\": 0.00,\n" +
                "      \"creditAmount\": 0.00,\n" +
                "      \"debitAmount\": 0.00,\n" +
                "      \"claimType\": null\n" +
                "    }\n" +
                "  ],\n" +
                "  \"claimStatus\": \"%s\",\n" +
                "  \"provider\": {\n" +
                "    \"institutionName\": \"Faru Health Limited\",\n" +
                "    \"publicId\": \"48f23ef1-93cf-4f7f-a421-538a4024de94\"\n" +
                "  },\n" +
                "  \"insurance\": {\n" +
                "    \"institutionName\": \"Insurer Limited\",\n" +
                "    \"publicId\": \"89f90054-a615-11ed-afa1-0242ac120002\"\n" +
                "  },\n" +
                "  \"payee\": {\n" +
                "    \"publicId\": \"258124c8-4f14-4426-b505-2f03399012f5\",\n" +
                "    \"description\": \"The Nairobi Hospital (Hospital Level 6)\",\n" +
                "    \"payeeType\": \"Provider\"\n" +
                "  },\n" +
                "  \"payeeAccount\": null,\n" +
                "  \"diagnoses\": [\n" +
                "    {\n" +
                "      \"deleted\": false,\n" +
                "      \"creationTime\": \"2025-03-25 10:37\",\n" +
                "      \"createdBy\": null,\n" +
                "      \"tenant\": null,\n" +
                "      \"id\": \"839\",\n" +
                "      \"code\": \"B500\",\n" +
                "      \"description\": \"Plasmodium falciparum malaria with cerebral complications\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"preAuthorization\": null,\n" +
                "  \"claimValue\": 10000.00,\n" +
                "  \"claimApprovedAmount\": 0.00,\n" +
                "  \"claimCopaymentAmount\": 0.00,\n" +
                "  \"claimPayableTotal\": 9700.00,\n" +
                "  \"claimPaidAmount\": 0.00,\n" +
                "  \"claimBalanceAmount\": 9700.00,\n" +
                "  \"claimDate\": \"2025-03-25 10:37\",\n" +
                "  \"claimType\": \"Normal\",\n" +
                "  \"subscription\": {\n" +
                "    \"publicId\": \"f0ca5fdd-ffc3-4f5c-b4dd-6363574c73b6\",\n" +
                "    \"benefit\": {\n" +
                "      \"publicId\": \"839ff3f5-2b47-4757-bfc5-a67a8f079333\",\n" +
                "      \"benefitName\": \"Blue\"\n" +
                "    },\n" +
                "    \"cover\": null,\n" +
                "    \"schemePolicyPeriod\": {\n" +
                "      \"publicId\": \"71d9313f-5e6d-4425-95e7-04e18c8d01d0\",\n" +
                "      \"startDate\": \"2024-02-01\",\n" +
                "      \"endDate\": \"2025-01-31\",\n" +
                "      \"type\": \"INSURED\",\n" +
                "      \"namePeriodType\": \"Test Scheme 1PgMj Oct 07 2023 - Oct 06 2024 INSURED\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"parentSubscriptionItem\": {\n" +
                "    \"publicId\": \"2c3babf1-78a1-44e4-b5aa-c1ae082bb526\",\n" +
                "    \"planDetails\": {\n" +
                "      \"publicId\": null,\n" +
                "      \"plan\": {\n" +
                "        \"id\": 589,\n" +
                "        \"publicId\": \"b2491e12-53ca-4359-af07-d4c66ab98992\",\n" +
                "        \"planName\": \"INPATIENT\",\n" +
                "        \"schemeName\": \"Test Scheme eGg2Z\",\n" +
                "        \"schemePublicId\": \"bdeaa232-2d42-11ee-be56-0242ac120002\",\n" +
                "        \"schemeType\": \"INSURED\",\n" +
                "        \"schemeDivisionType\": null,\n" +
                "        \"customerName\": \"Clarkson Company\",\n" +
                "        \"customerPublicId\": \"21517cb1-0f7d-4f64-9de3-8d7314d737cc\",\n" +
                "        \"planItemPublicId\": null\n" +
                "      },\n" +
                "      \"planLimit\": 50000.00,\n" +
                "      \"allowMultipleProducts\": false,\n" +
                "      \"insurers\": [\n" +
                "        {\n" +
                "          \"institutionName\": \"Insurer Limited\",\n" +
                "          \"publicId\": \"89f90054-a615-11ed-afa1-0242ac120002\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"policyPeriodEndDate\": \"2024-10-08\",\n" +
                "      \"hasLimit\": false\n" +
                "    },\n" +
                "    \"utilizationType\": \"INDIVIDUAL\",\n" +
                "    \"schemeDivisionType\": \"HEALTHCARE\"\n" +
                "  },\n" +
                "  \"visitDate\": \"18-03-2024\",\n" +
                "  \"stampDate\": \"18-05-2024\",\n" +
                "  \"dischargeDate\": null,\n" +
                "  \"submissionDate\": null,\n" +
                "  \"endOfBillingDate\": null,\n" +
                "  \"rejectedDate\": null,\n" +
                "  \"approvedDate\": null,\n" +
                "  \"deathDate\": null,\n" +
                "  \"insurers\": [\n" +
                "    {\n" +
                "      \"institutionName\": \"Insurer Limited\",\n" +
                "      \"publicId\": \"89f90054-a615-11ed-afa1-0242ac120002\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"deductions\": [\n" +
                "    {\n" +
                "      \"deductionId\": \"d935867a-49d7-4ee9-91ab-4572d2cbf698\",\n" +
                "      \"deductionType\": \"Deduction\",\n" +
                "      \"deductionDescription\": \"This is the copay set for this provider\",\n" +
                "      \"deductionCategory\": \"Copayment\",\n" +
                "      \"providerInitialized\": true,\n" +
                "      \"deductionValue\": 300.00,\n" +
                "      \"deductionValueType\": \"AMOUNT\",\n" +
                "      \"copayRecoverableFrom\": null\n" +
                "    }\n" +
                "  ],\n" +
                "  \"providerPublicId\": \"258124c8-4f14-4426-b505-2f03399012f5\",\n" +
                "  \"locked\": true,\n" +
                "  \"lockReason\": \"PARENT_PLAN_DEACTIVATED\",\n" +
                "  \"binder\": true,\n" +
                "  \"binderType\": \"Binder\",\n" +
                "  \"interimBillAmount\": 0.00,\n" +
                "  \"batched\": false,\n" +
                "  \"multiPayees\": false,\n" +
                "  \"previousStatus\": null,\n" +
                "  \"reverseStatus\": null,\n" +
                "  \"visitType\": \"Inpatient\",\n" +
                "  \"remainingAppealDays\": 0,\n" +
                "  \"appealCount\": 0,\n" +
                "  \"isFlagged\": false,\n" +
                "  \"fraudCase\": null,\n" +
                "  \"dischargeType\": null,\n" +
                "  \"approverComment\": null,\n" +
                "  \"rejectorComment\": null,\n" +
                "  \"claimDeductionsAmount\": 300.00,\n" +
                "  \"claimDischargeAmount\": 0.00,\n" +
                "  \"hasOptical\": true,\n" +
                "  \"reversed\": null,\n" +
                "  \"hasCapitation\": true,\n" +
                "  \"hasCopay\": true,\n" +
                "  \"capitationAmount\": 900.00,\n" +
                "  \"schemeHasFund\": null,\n" +
                "  \"currency\": \"KES\",\n" +
                "  \"allowExgratia\": true,\n" +
                "  \"specialClaim\": false,\n" +
                "  \"allowClaimProcessingWithBenefitExhausted\": false,\n" +
                "  \"tatDuration\": \"0 days, 0 hrs, 0 mins, 0 secs\",\n" +
                "  \"baseCurrencyAmount\": 0.00,\n" +
                "  \"providerCurrency\": {\n" +
                "    \"publicId\": \"dbec709d-df0e-4b5a-bb29-96bdf940980e\",\n" +
                "    \"code\": \"KES\",\n" +
                "    \"name\": \"Kenyan Shilling\"\n" +
                "  },\n" +
                "  \"paymentDate\": null,\n" +
                "  \"funded\": false,\n" +
                "  \"totalWithholdingTax\": 0.00,\n" +
                "  \"preliminaryWithholdingTax\": 0.00\n" +
                "}",claimNumber,memberShipNumber,patientName,principalMemberNumber,principalName,claimStatus);
    }
}
