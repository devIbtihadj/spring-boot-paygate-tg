package com.ibtihadj.paygate.paygate.services.statments;

import com.ibtihadj.paygate.paygate.payloads.requests.ConsulterSoldeRequest;
import com.ibtihadj.paygate.paygate.payloads.requests.PayementV1Request;
import com.ibtihadj.paygate.paygate.payloads.requests.VerifierEtatPayementWithIdentifiantRequest;
import com.ibtihadj.paygate.paygate.payloads.requests.VerifierEtatPayementWithReferenceRequest;
import com.ibtihadj.paygate.paygate.payloads.responses.*;

public interface PaygateService {
    public ConfirmationPayementResponse confirmerPayement();

    public PayementV1Response payerATraversNotreApplication(PayementV1Request request);

    public ConsulterSoldeResponse consulterSolde(ConsulterSoldeRequest request);

    public VerifierEtatPayementWithIdentifiantResponse verifierEtatPayementWithIdentifiant(VerifierEtatPayementWithIdentifiantRequest request);

    public VerifierEtatPayementWithReferenceResponse verifierEtatPayementWithReference(VerifierEtatPayementWithReferenceRequest request);

}
