package com.ibtihadj.paygate.paygate.payloads.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VerifierEtatPayementWithReferenceRequest {
    private String auth_token;
    private String tx_reference;
}
