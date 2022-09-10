package com.example.bffcepacl.acl.cep;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.bffcepacl.acl.cep.dto.CepDto;
import com.example.bffcepacl.acl.cep.dto.CepRequest;
import com.example.bffcepacl.acl.cep.dto.CepResponse;
import com.example.bffcepacl.helpers.RestTemplateHelper;


@Component
@Primary
public class CepProxyImplement implements CepProxy {

    public RestTemplateHelper apiCep;


    @Autowired
    public CepProxyImplement(RestTemplateHelper apiCep) {
        this.apiCep = apiCep;
    }
    public CepResponse consultarCep(CepRequest request) {
        CepDto response = doRequestWith(request);
        System.out.println(response);
        return CepResponse.of(response);

    }
    
    public CepDto doRequestWith(CepRequest request) {
        String uri = "https://viacep.com.br/ws/" + request.getCep() +"/json/";
        CepDto result = apiCep.callApi().getForObject(uri, CepDto.class);
        return result;

    }
}
