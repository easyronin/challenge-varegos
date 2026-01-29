package com.melof10.challengevaregos.controller;

import com.melof10.challengevaregos.response.RecipientWrapperResponse;
import com.melof10.challengevaregos.service.AgendaCbuService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador AgendaCbuController para exponer mi servicio
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/v1/transfers")
public class AgendaCbuController {

    private final AgendaCbuService agendaCbuService;

    /**
     * Función para exponer mi servicio de mi API REST
     * @param customerDocumentNumber
     * @param customerDocumentType
     * @return
     */
    @Operation(
            summary = "Agenda de destinatarios de transferencias de un cliente",
            description = "Con este servicio se informarar la agenda de transferencias de un cliente"
    )
    @ApiResponse(
            responseCode = "200",
            description = "Respuesta exitosa",
            content = @Content(mediaType = "application/json", schema = @Schema(implementation = RecipientWrapperResponse.class))
    )
    @GetMapping("/customers-document/{customer-document-number}/recipients")
    public ResponseEntity<?> getRecipients(@Parameter(name = "customer-document-number",
                                                      description = "Numero de documento del cliente",
                                                      required = true,
                                                      examples = {
                                                              @ExampleObject(name = "200", value = "39327180")
                                                      },
                                                      in = ParameterIn.PATH)
                                           @PathVariable("customer-document-number") final String customerDocumentNumber,
                                           @Parameter(name = "customer-document-type",
                                                      description = "Tipo de documento del cliente",
                                                      required = true,
                                                      schema = @Schema(
                                                              type = "string",
                                                              allowableValues = {"01", "02", "03", "11", "101", "125"},
                                                              example = "01"
                                                      ),
                                                      in = ParameterIn.QUERY)
                                           @RequestParam("customer-document-type") final String customerDocumentType) {

        final RecipientWrapperResponse response = agendaCbuService.getAgendaCBU(customerDocumentNumber, customerDocumentType);
        return ResponseEntity.ok(response);
    }
}
