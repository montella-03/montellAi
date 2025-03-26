package com.montella.ai.tools;

import org.springframework.ai.tool.annotation.Tool;

public class ClaimTools {
    @Tool(description = "The claim file to be analyzed")
    public  String getClaimFile() {
        return "resources/claimResponse.json";
    }
}
