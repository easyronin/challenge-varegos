package com.melof10.challengevaregos.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;

import static com.melof10.challengevaregos.enumeration.AgendaCbuEnums.WSDL_PACKAGE;

/**
 * Configuración para SoapClient
 */
@Configuration
@AllArgsConstructor
public class SoapConfig {

    private final AppConfig appConfig;

    /**
     * Es una implementación de JAXB (Java Architecture for XML Binding) para la serialización y deserialización de XML
     * @return Jaxb2Marshaller
     */
    @Bean
    public Jaxb2Marshaller marshaller() {
        final Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan(WSDL_PACKAGE.getValue());

        return marshaller;
    }

    /**
     * Es una plantilla que facilita el envío y recepción de mensajes SOAP
     * @param marshaller
     * @return WebServiceTemplate
     */
    @Bean
    public WebServiceTemplate webServiceTemplate(final Jaxb2Marshaller marshaller) {
        final WebServiceTemplate template = new WebServiceTemplate();
        template.setMarshaller(marshaller);
        template.setUnmarshaller(marshaller);
        template.setDefaultUri(appConfig.getUrlSoap());

        return template;
    }
}