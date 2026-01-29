package com.melof10.challengevaregos.mapper;

import com.melof10.challengevaregos.response.AccountResponse;
import com.melof10.challengevaregos.response.RecipientResponse;
import com.melof10.challengevaregos.response.RecipientWrapperResponse;
import com.melof10.challengevaregos.wsdl.AgendaCBUDTO;
import com.melof10.challengevaregos.wsdl.GetAgendaCBUResponse;
import com.melof10.challengevaregos.wsdl.PropiedadDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Clase que sirve para mappear los datos que devuelve el cliente SOAP con lo que devuelve la API REST
 */
@Component
public class AgendaMapper {

    public static RecipientWrapperResponse mapToRecipientResponse(final GetAgendaCBUResponse getAgendaCBUResponse) {
        final List<RecipientResponse> recipientResponses = getAgendaCBUResponse.getAgendaCBU().stream()
                .map(AgendaMapper::mapToRecipient)
                .collect(Collectors.toList());

        return RecipientWrapperResponse.builder()
                .recipientResponse(recipientResponses)
                .build();
    }

    private static RecipientResponse mapToRecipient(final AgendaCBUDTO agendaCBUDTO) {
        return RecipientResponse.builder()
                .cuit(!agendaCBUDTO.getCuitCuil().isBlank() ? agendaCBUDTO.getCuitCuil().trim() : null)
                .description(!agendaCBUDTO.getDescripcion().isBlank() ? agendaCBUDTO.getDescripcion().trim() : null)
                .accountResponse(mapAccount(agendaCBUDTO.getNroCBU(), agendaCBUDTO.getPropiedadDTO()))
                .build();
    }

    private static AccountResponse mapAccount(final String nroCBU, final PropiedadDTO propiedadDTO) {
        return AccountResponse.builder()
                .cbu(!nroCBU.isBlank() ? nroCBU.trim() : null)
                .code(!propiedadDTO.getCodigo().isBlank() ? propiedadDTO.getCodigo().trim() : null)
                .description(!propiedadDTO.getDescripcion().isBlank() ? propiedadDTO.getDescripcion().trim() : null)
                .current(propiedadDTO.isCtaCorriente())
                .own(propiedadDTO.isPropia())
                .build();
    }
}
