package com.ibtihadj.paygate.paygate.controllers;


import com.ibtihadj.paygate.paygate.payloads.requests.ConsulterSoldeRequest;
import com.ibtihadj.paygate.paygate.payloads.responses.ConsulterSoldeResponse;
import com.ibtihadj.paygate.paygate.services.statments.PaygateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class PaygateController {

    private static final String CONTROLLER_NAME = "paygate";

    private final PaygateService paygateService;

    @Autowired
    public PaygateController(PaygateService paygateService) {
        this.paygateService = paygateService;
    }


    @GetMapping(value = CONTROLLER_NAME+"/solde", produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<ConsulterSoldeResponse> monSolde() {
        ConsulterSoldeResponse response = paygateService.consulterSolde(new ConsulterSoldeRequest());
        return ResponseEntity.status(OK).body(response);
    }
}
