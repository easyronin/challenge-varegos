package com.melof10.challengevaregos.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración de la app para obtener la url del properties para conectarme al cliente SOAP
 */
@Getter
@Configuration
@NoArgsConstructor
public class AppConfig {

    @Value("${url.soap}")
    private String urlSoap;

}
