package com.melof10.challengevaregos.client;

import com.melof10.challengevaregos.wsdl.GetAgendaCBU;
import com.melof10.challengevaregos.wsdl.GetAgendaCBUResponse;
import jakarta.xml.bind.JAXBElement;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;

import java.util.Optional;

import static com.melof10.challengevaregos.enumeration.AgendaCbuEnums.EXCEPTION_MESSAGE;

/**
 * Cliente SOAP que me provee la conexión al servicio
 */
@Slf4j
@Component
@AllArgsConstructor
public class SoapClient {

    private final WebServiceTemplate webServiceTemplate;

    /**
     * Función que se conecta al cliente SOAP
     * @param agendaCBU
     * @return Optional<GetAgendaCBUResponse>
     */
    @SuppressWarnings("unchecked")
    public Optional<GetAgendaCBUResponse> integrationSoapClient(final GetAgendaCBU agendaCBU) {

        try {
            final JAXBElement<GetAgendaCBUResponse> response =
                    (JAXBElement<GetAgendaCBUResponse>) webServiceTemplate.marshalSendAndReceive(agendaCBU);

            return Optional.of(response.getValue());
        } catch (Exception exception) {
            log.error(EXCEPTION_MESSAGE.getValue(), exception.getMessage());
            return Optional.empty();
        }
    }
}