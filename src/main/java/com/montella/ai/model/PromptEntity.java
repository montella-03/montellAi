package com.montella.ai.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PromptEntity {
    private String promptMessage;
    private String promptType; /// claims comment, patient analysis, claim summary,Fraud detection,approval process assistant.
    private String promptResponse;
}
