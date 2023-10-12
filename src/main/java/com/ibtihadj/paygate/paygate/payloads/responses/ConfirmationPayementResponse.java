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
public class ConfirmationPayementResponse {
    private String tx_reference;
    private int identifier;
    private String payment_reference;
    private Double amount;
    private Date datetime;
    private PayementMethod payment_method;
    private String phone_number;

}
