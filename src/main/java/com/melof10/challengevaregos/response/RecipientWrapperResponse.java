package com.melof10.challengevaregos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Clase que engloba la respuesta generica que devuelve mi API REST
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class RecipientWrapperResponse {

    @JsonProperty("recipient")
    private List<RecipientResponse> recipientResponse;

}
