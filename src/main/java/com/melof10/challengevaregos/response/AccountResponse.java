package com.melof10.challengevaregos.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase para mappear lo que devuelve Account
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class AccountResponse {

    @Schema(description = "CBU de la cuenta", example = "2850001040094075882478")
    private String cbu;

    @Schema(description = "Código de propiedad de la cuenta", example = "3")
    private String code;

    @Schema(description = "Descripción de propiedad de la cuenta", example = "Es Otra Cuenta Propia")
    private String description;

    @Schema(description = "Si es cuenta corriente o no", example = "true")
    private Boolean current;

    @Schema(description = "Si es propietario o no", example = "true")
    private Boolean own;

}
