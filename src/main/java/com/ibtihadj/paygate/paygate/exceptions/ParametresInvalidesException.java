package com.ibtihadj.paygate.paygate.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ParametresInvalidesException extends RuntimeException{
    public ParametresInvalidesException(String message) {
        super(message);
    }
}
