package com.melof10.challengevaregos.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enums para mantener las cadenas de texto definidas en un solo lugar
 */
@Getter
@AllArgsConstructor
public enum AgendaCbuEnums {

    SUCCESS_MESSAGE("Integración realizada con éxito"),
    ERROR_MESSAGE("Error al conectarse con el cliente SOAP"),
    EXCEPTION_MESSAGE("Excepción al consumir cliente SOAP: {}"),
    MANDATORY_PARAMETERS("El número y tipo de documento son obligatorios"),
    WSDL_PACKAGE("com.melof10.challengevaregos.wsdl");

    private final String value;
}
