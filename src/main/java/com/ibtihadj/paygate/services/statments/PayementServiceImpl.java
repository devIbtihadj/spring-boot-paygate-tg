package com.ibtihadj.paygate.services.statments;

import com.ibtihadj.paygate.entities.Payement;
import com.ibtihadj.paygate.paygate.enums.PayementMethod;
import com.ibtihadj.paygate.paygate.payloads.requests.PayementV1Request;
import com.ibtihadj.paygate.paygate.payloads.responses.PayementV1Response;
import com.ibtihadj.paygate.paygate.services.statments.PaygateService;
import com.ibtihadj.paygate.repository.PayementRepository;
import com.ibtihadj.paygate.services.implementations.PayementService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PayementServiceImpl implements PayementService {

    private final PayementRepository payementRepository;
    private final PaygateService paygateService;

    @Autowired
    public PayementServiceImpl(PayementRepository payementRepository, PaygateService paygateService) {
        this.payementRepository = payementRepository;
        this.paygateService = paygateService;
    }

    @Transactional
    @Override
    public Payement creerPayement(Payement payement) {
        Payement payement1 = payementRepository.save(payement);
        PayementV1Request request = new PayementV1Request(null, payement.getTelephone(), payement.getMontant(), "Test", payement1.getId().intValue(), PayementMethod.TMONEY);
        PayementV1Response response =  paygateService.payerATraversNotreApplication(request);
        payement1.setEtat(response.getStatus());
        System.out.println("response-------------");
        System.out.println(response.getStatus());
        System.out.println(response.getTx_reference());
        return payementRepository.save(payement1);
    }
}
