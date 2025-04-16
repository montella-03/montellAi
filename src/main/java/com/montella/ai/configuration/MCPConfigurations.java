package com.montella.ai.configuration;

import com.montella.ai.service.ClaimService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MCPConfigurations {


    @Bean
    public ClaimService claimService() {
        return new ClaimService();
    }

    @Bean
    public ToolCallbackProvider claimDataTools(ClaimService claimService) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(claimService)
                .build();
    }


}
