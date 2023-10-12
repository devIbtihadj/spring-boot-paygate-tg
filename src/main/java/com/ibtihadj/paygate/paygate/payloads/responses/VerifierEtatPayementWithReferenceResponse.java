package com.ibtihadj.paygate.paygate.payloads.responses;

import com.ibtihadj.paygate.paygate.enums.PayementMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VerifierEtatPayementWithReferenceResponse {
    private String tx_reference;
    private int identifier;
    private String payment_reference;
    private int status;
    private Date dateTime;
    private PayementMethod payement_method;

}
