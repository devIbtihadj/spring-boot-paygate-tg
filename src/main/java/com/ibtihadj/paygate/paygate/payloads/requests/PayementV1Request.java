package com.ibtihadj.paygate.paygate.payloads.requests;


import com.ibtihadj.paygate.paygate.enums.PayementMethod;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PayementV1Request {
    private String auth_token;
    private String phone_number;
    private Double amount;
    private String description;
    private int identifier;
    private PayementMethod network;
}
