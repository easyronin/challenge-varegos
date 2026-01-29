package com.melof10.challengevaregos.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Record para mapear datos en caso de errores o excepciones
 * @param statusCode
 * @param errorMessage
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ApiErrorResponse(
    @JsonProperty("code") Integer statusCode,
    @JsonProperty("error") String errorMessage) {}
