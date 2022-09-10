package com.example.bffcepacl.acl.cep;

import org.springframework.stereotype.Component;

import com.example.bffcepacl.acl.cep.dto.CepDto;
import com.example.bffcepacl.acl.cep.dto.CepRequest;
import com.example.bffcepacl.acl.cep.dto.CepResponse;
import com.example.bffcepacl.model.Cep;

@Component
public class CepAdpter {
    public CepRequest toRequest() {
        return CepRequest.of("43810170");
    }
    public Cep fromResponse(CepResponse response) {
        CepDto dtoData = response.getData();
        Cep formatedValues =  Cep.of(dtoData.getCep(), dtoData.getLogradouro(), dtoData.getComplemento(), dtoData.getBairro(), dtoData.getLocalidade());
        return formatedValues;
    }
}
