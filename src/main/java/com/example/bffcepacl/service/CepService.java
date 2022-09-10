package com.example.bffcepacl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bffcepacl.acl.cep.CepServiceAcl;
import com.example.bffcepacl.acl.cep.dto.CepResponse;
import com.example.bffcepacl.model.Cep;

@Service
public class CepService {
    public CepServiceAcl cepServiceAcl;

    @Autowired
    public CepService(CepServiceAcl cepServiceAcl) {
        this.cepServiceAcl = cepServiceAcl;
    }
    
    public Cep consultarCep() {
        return cepServiceAcl.consultarCep();
    } 
}
