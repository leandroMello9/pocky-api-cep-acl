package com.example.bffcepacl.acl.cep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.bffcepacl.acl.cep.dto.CepRequest;
import com.example.bffcepacl.acl.cep.dto.CepResponse;
import com.example.bffcepacl.model.Cep;

@Component
public class CepServiceAcl {

    public CepProxy cepProxy;
    public CepAdpter adpter;

    @Autowired
    public CepServiceAcl(CepProxy cepProxy, CepAdpter adpter) {
        this.cepProxy = cepProxy;
        this.adpter = adpter;
    }

    public Cep consultarCep() {
        CepRequest request = adpter.toRequest();
        CepResponse response = cepProxy.consultarCep(request);
        return adpter.fromResponse(response);

    }
    

}
