package com.melof10.challengevaregos.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración para Swagger con datos personalizados
 */
@Getter
@Configuration
@OpenAPIDefinition(servers = { @Server(url = "/") })
@NoArgsConstructor
public class OpenApiConfig {

    @Value("${api.info.title}")
    private String title;

    @Value("${api.info.description}")
    private String description;

    @Value("${api.info.nameContact}")
    private String contactName;

    @Value("${api.info.mailContact}")
    private String contactEmail;

    @Value("${api.info.version}")
    private String version;

    /**
     * Bean para devolver los datos personalizados de Swagger
     * @return OpenAPI
     */
    @Bean
    public OpenAPI openAPI() {
        final Contact contact = new Contact()
                .name(contactName)
                .email(contactEmail);

        final Info info = new Info()
                .contact(contact)
                .title(title)
                .version(version)
                .description(description);

        return new OpenAPI().info(info);
    }
}
