package com.ibtihadj.paygate.paygate.services.implementations;

import com.ibtihadj.paygate.paygate.constants.ErrorMessage;
import com.ibtihadj.paygate.paygate.constants.Urls;
import com.ibtihadj.paygate.paygate.exceptions.IdentifiantAlreadyExistException;
import com.ibtihadj.paygate.paygate.exceptions.JetonInvalidException;
import com.ibtihadj.paygate.paygate.exceptions.ParametresInvalidesException;
import com.ibtihadj.paygate.paygate.payloads.requests.ConsulterSoldeRequest;
import com.ibtihadj.paygate.paygate.payloads.requests.PayementV1Request;
import com.ibtihadj.paygate.paygate.payloads.requests.VerifierEtatPayementWithIdentifiantRequest;
import com.ibtihadj.paygate.paygate.payloads.requests.VerifierEtatPayementWithReferenceRequest;
import com.ibtihadj.paygate.paygate.payloads.responses.*;
import com.ibtihadj.paygate.paygate.services.statments.PaygateService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
public class PaygateServiceImpl implements PaygateService {

    @Value("${paygate.apikey}")
    private String apiKey;

    private final RestTemplate restTemplate;

    @Autowired
    public PaygateServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ConfirmationPayementResponse confirmerPayement() {
        return null;
    }

    @Transactional
    @Override
    public PayementV1Response payerATraversNotreApplication(PayementV1Request request) {
        request.setAuth_token(apiKey);
        HttpEntity<PayementV1Request> httpRequest = new HttpEntity<>(request);
        try {
            ResponseEntity<PayementV1Response> response = restTemplate.exchange(
                    Urls.PAYEMENT_V1_URL,
                    HttpMethod.POST,
                    httpRequest,
                    PayementV1Response.class
            );
            return response.getBody();
        }catch (IdentifiantAlreadyExistException identifiantAlreadyExistException){
            throw new IdentifiantAlreadyExistException(ErrorMessage.IDENTIFIANT_ALREADY_EXIST);
        }catch (JetonInvalidException jetonInvalidException){
            throw new JetonInvalidException(ErrorMessage.JETON_D_AUTHENTIFICATION_INVALIDE);
        }catch (ParametresInvalidesException parametresInvalidesException){
            throw new ParametresInvalidesException(ErrorMessage.PARAMETRES_INVALIDES);
        }
    }

    @Override
    public ConsulterSoldeResponse consulterSolde(ConsulterSoldeRequest request) {
        request.setAuth_token(apiKey);
        HttpEntity<ConsulterSoldeRequest> httpRequest = new HttpEntity<>(request);
        try {
            ResponseEntity<ConsulterSoldeResponse> response = restTemplate.exchange(
                    Urls.CONSULTER_SOLDE_URL,
                    HttpMethod.POST,
                    httpRequest,
                    ConsulterSoldeResponse.class
            );
            return response.getBody();
        }catch (IdentifiantAlreadyExistException identifiantAlreadyExistException){
            throw new IdentifiantAlreadyExistException(ErrorMessage.IDENTIFIANT_ALREADY_EXIST);
        }catch (JetonInvalidException jetonInvalidException){
            throw new JetonInvalidException(ErrorMessage.JETON_D_AUTHENTIFICATION_INVALIDE);
        }catch (ParametresInvalidesException parametresInvalidesException){
            throw new ParametresInvalidesException(ErrorMessage.PARAMETRES_INVALIDES);
        }
    }

    @Override
    public VerifierEtatPayementWithIdentifiantResponse verifierEtatPayementWithIdentifiant(VerifierEtatPayementWithIdentifiantRequest request) {
        request.setAuth_token(apiKey);
        HttpEntity<VerifierEtatPayementWithIdentifiantRequest> httpRequest = new HttpEntity<>(request);
        try {
            ResponseEntity<VerifierEtatPayementWithIdentifiantResponse> response = restTemplate.exchange(
                    Urls.VERIFIER_ETAT_PAYEMENT_WITH_IDENTIFIANT_URL,
                    HttpMethod.POST,
                    httpRequest,
                    VerifierEtatPayementWithIdentifiantResponse.class
            );
            return response.getBody();
        }catch (IdentifiantAlreadyExistException identifiantAlreadyExistException){
            throw new IdentifiantAlreadyExistException(ErrorMessage.IDENTIFIANT_ALREADY_EXIST);
        }catch (JetonInvalidException jetonInvalidException){
            throw new JetonInvalidException(ErrorMessage.JETON_D_AUTHENTIFICATION_INVALIDE);
        }catch (ParametresInvalidesException parametresInvalidesException){
            throw new ParametresInvalidesException(ErrorMessage.PARAMETRES_INVALIDES);
        }
    }

    @Override
    public VerifierEtatPayementWithReferenceResponse verifierEtatPayementWithReference(VerifierEtatPayementWithReferenceRequest request) {
        request.setAuth_token(apiKey);
        HttpEntity<VerifierEtatPayementWithReferenceRequest> httpRequest = new HttpEntity<>(request);
        try {
            ResponseEntity<VerifierEtatPayementWithReferenceResponse> response = restTemplate.exchange(
                    Urls.VERIFIER_ETAT_PAYEMENT_WITH_REFERENCE_URL,
                    HttpMethod.POST,
                    httpRequest,
                    VerifierEtatPayementWithReferenceResponse.class
            );
            return response.getBody();
        }catch (IdentifiantAlreadyExistException identifiantAlreadyExistException){
            throw new IdentifiantAlreadyExistException(ErrorMessage.IDENTIFIANT_ALREADY_EXIST);
        }catch (JetonInvalidException jetonInvalidException){
            throw new JetonInvalidException(ErrorMessage.JETON_D_AUTHENTIFICATION_INVALIDE);
        }catch (ParametresInvalidesException parametresInvalidesException){
            throw new ParametresInvalidesException(ErrorMessage.PARAMETRES_INVALIDES);
        }
    }
}
