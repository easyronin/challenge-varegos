package com.melof10.challengevaregos.service.impl;

import com.melof10.challengevaregos.client.SoapClient;
import com.melof10.challengevaregos.response.RecipientWrapperResponse;
import com.melof10.challengevaregos.service.AgendaCbuService;
import com.melof10.challengevaregos.wsdl.GetAgendaCBU;
import com.melof10.challengevaregos.wsdl.GetAgendaCBUResponse;
import com.melof10.challengevaregos.wsdl.UsuarioDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

import static com.melof10.challengevaregos.mapper.AgendaMapper.mapToRecipientResponse;

/**
 * Clase del servicio que se conecta con el SoapClient
 */
@Service
@AllArgsConstructor
public class AgendaCbuServiceImpl implements AgendaCbuService {

    private final SoapClient soapClient;

    /**
     * Función para conectarse al SoapClient y devolver los datos que devuelve posteriormente mi endpoint de mi API REST
     * @param customerDocumentNumber
     * @param customerDocumentType
     * @return RecipientWrapperResponse
     */
    @Override
    public RecipientWrapperResponse getAgendaCBU(final String customerDocumentNumber, final String customerDocumentType) {

        final UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNroDocumento(customerDocumentNumber);
        usuarioDTO.setTipoDocumento(customerDocumentType);

        final GetAgendaCBU getAgendaCBU = new GetAgendaCBU();
        getAgendaCBU.setUsuario(usuarioDTO);

        final Optional<GetAgendaCBUResponse> responseSoapClient = soapClient.integrationSoapClient(getAgendaCBU);

        if(responseSoapClient.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return mapToRecipientResponse(responseSoapClient.get());
    }
}