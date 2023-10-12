package com.ibtihadj.paygate.paygate.payloads.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PayementV1Response {
    private String tx_reference;
    private int status;
}
