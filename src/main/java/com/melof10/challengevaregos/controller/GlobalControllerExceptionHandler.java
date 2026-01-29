package com.melof10.challengevaregos.controller;

import com.melof10.challengevaregos.response.ApiErrorResponse;
import com.melof10.challengevaregos.utils.ResponseUtils;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import static com.melof10.challengevaregos.enumeration.AgendaCbuEnums.ERROR_MESSAGE;
import static com.melof10.challengevaregos.enumeration.AgendaCbuEnums.MANDATORY_PARAMETERS;

/**
 * Manejo de excepciones globales
 */
@RestControllerAdvice
@NoArgsConstructor
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ApiErrorResponse> handleMissingParameterException() {
        return ResponseUtils.createInternalServerErrorResponse(ERROR_MESSAGE.getValue());
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ApiErrorResponse> handleMissingServletRequestParameterException() {
        return ResponseUtils.createBadRequestResponse(MANDATORY_PARAMETERS.getValue());
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ApiErrorResponse> handleNoResourceFoundException() {
        return ResponseUtils.createBadRequestResponse(MANDATORY_PARAMETERS.getValue());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiErrorResponse> handleIllegalArgumentException() {
        return ResponseUtils.createBadRequestResponse(MANDATORY_PARAMETERS.getValue());
    }

}
