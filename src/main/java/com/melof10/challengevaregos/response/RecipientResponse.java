package com.melof10.challengevaregos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase para mapear CUIT, Descripcion y Account
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RecipientResponse {

    @Schema(description = "CUIT de la persona dueña de la agenda", example = "23393271809")
    private String cuit;

    @Schema(description = "Descripción de la agenda", example = "test")
    private String description;

    @JsonProperty("account")
    private AccountResponse accountResponse;
}
