package com.montella.ai.service;

import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

public interface AnagramService {

    StreamingResponseBody getClaimAnalysis(String claim);
}
