package com.melof10.challengevaregos.service.impl;

import com.melof10.challengevaregos.client.SoapClient;
import com.melof10.challengevaregos.response.RecipientWrapperResponse;
import com.melof10.challengevaregos.wsdl.GetAgendaCBU;
import com.melof10.challengevaregos.wsdl.GetAgendaCBUResponse;
import com.melof10.challengevaregos.wsdl.UsuarioDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Test de la clase AgendaCbuServiceImpl
 */
public class AgendaCbuServiceImplTest {

    @Mock
    private SoapClient soapClient;

    @InjectMocks
    private AgendaCbuServiceImpl agendaCbuService;

    private UsuarioDTO usuarioDTO;
    private GetAgendaCBU getAgendaCBU;
    private GetAgendaCBUResponse response;
    private String customerDocumentNumber;
    private String customerDocumentType;

    /**
     * Setup de los métodos para los test
     */
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        initializeObjects();
    }

    /**
     * Test para el caso de éxito
     */
    @Test
    void testGetAgendaCBU_SuccessfulResponse() {
        when(soapClient.integrationSoapClient(any(GetAgendaCBU.class)))
                .thenReturn(Optional.of(response));

        RecipientWrapperResponse result = agendaCbuService.getAgendaCBU(customerDocumentNumber, customerDocumentType);

        assertNotNull(result);
        verify(soapClient, times(1)).integrationSoapClient(any(GetAgendaCBU.class));
    }

    /**
     * Test para el caso que haya alguna excepción
     */
    @Test
    void testGetAgendaCBU_ThrowsExceptionWhenEmptyResponse() {
        when(soapClient.integrationSoapClient(any(GetAgendaCBU.class)))
                .thenReturn(Optional.empty());

        ResponseStatusException exception = assertThrows(ResponseStatusException.class, () ->
                agendaCbuService.getAgendaCBU(customerDocumentNumber, customerDocumentType)
        );

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, exception.getStatusCode());
        verify(soapClient, times(1)).integrationSoapClient(any(GetAgendaCBU.class));
    }

    /**
     * Función para setear las variables para poder utilizarlas en los tests
     */
    private void initializeObjects() {
        usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNroDocumento(customerDocumentNumber);
        usuarioDTO.setTipoDocumento(customerDocumentType);
        getAgendaCBU = new GetAgendaCBU();
        getAgendaCBU.setUsuario(usuarioDTO);
        response = new GetAgendaCBUResponse();
        customerDocumentNumber = "12345678";
        customerDocumentType = "DNI";
    }
}
