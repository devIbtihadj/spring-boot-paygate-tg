package com.ibtihadj.paygate.paygate.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class IdentifiantAlreadyExistException extends RuntimeException{
    public IdentifiantAlreadyExistException(String message) {
        super(message);
    }

}
