package com.melof10.challengevaregos.service;

import com.melof10.challengevaregos.response.RecipientWrapperResponse;

/**
 * Interfaz del servicio
 */
public interface AgendaCbuService {

    /**
     * Función para conectarse al SoapClient, dicha implementación se hará en AgendaCbuServiceImpl
     * @param customerDocumentNumber
     * @param customerDocumentType
     * @return RecipientWrapperResponse
     */
    RecipientWrapperResponse getAgendaCBU(String customerDocumentNumber, String customerDocumentType);
}
