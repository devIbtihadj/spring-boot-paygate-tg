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
public class PayementV2Request {
    private String token;
    private Double amount;
    private String description;
    private  int identifier;
    private String url;
    private String phone;
    private PayementMethod network;
}
