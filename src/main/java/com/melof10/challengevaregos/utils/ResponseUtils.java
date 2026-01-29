package com.melof10.challengevaregos.utils;

import com.melof10.challengevaregos.response.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * Clase para devolver Respuestas personalizadas en caso de errores o excepciones
 */
@Component
public class ResponseUtils {

    /**
     * Función para devolver in InternalServerError
     * @param message
     * @return ResponseEntity<ApiErrorResponse>
     */
    public static ResponseEntity<ApiErrorResponse> createInternalServerErrorResponse(final String message) {
        final ApiErrorResponse apiError = new ApiErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
        final ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
        return bodyBuilder.body(apiError);
    }

    /**
     * Función para devolver un BadRequest
     * @param message
     * @return ResponseEntity<ApiErrorResponse>
     */
    public static ResponseEntity<ApiErrorResponse> createBadRequestResponse(final String message) {
        final ApiErrorResponse apiError = new ApiErrorResponse(HttpStatus.BAD_REQUEST.value(), message);
        final ResponseEntity.BodyBuilder bodyBuilder = ResponseEntity.status(HttpStatus.BAD_REQUEST);
        return bodyBuilder.body(apiError);
    }
}
