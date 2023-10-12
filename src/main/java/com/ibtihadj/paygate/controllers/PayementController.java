package com.ibtihadj.paygate.controllers;

import com.ibtihadj.paygate.entities.Payement;
import com.ibtihadj.paygate.paygate.payloads.responses.PayementV1Response;
import com.ibtihadj.paygate.services.implementations.PayementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin("*")
public class PayementController {

    private static final String CONTROLLER_NAME = "payement";


    private final PayementService payementService;

    @Autowired
    public PayementController(PayementService payementService) {
        this.payementService = payementService;
    }


//    @PostMapping(value = CONTROLLER_NAME+"/create", consumes = {APPLICATION_JSON_VALUE}, produces = {APPLICATION_JSON_VALUE})
    @GetMapping(value = CONTROLLER_NAME+"/create", produces = {APPLICATION_JSON_VALUE})
    public ResponseEntity<Payement> creerAnnee() {
        Payement payement = new Payement();
        payement.setNom("KPEKPASSI");
        payement.setPrenom("Ibtihadj");
        payement.setMontant(-10.0);
        payement.setTelephone("93899766");
        Payement response = payementService.creerPayement(payement);
        return ResponseEntity.status(CREATED).body(response);
    }

}
