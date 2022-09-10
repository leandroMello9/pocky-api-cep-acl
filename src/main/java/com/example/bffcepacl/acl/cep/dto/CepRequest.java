package com.example.bffcepacl.acl.cep.dto;

public class CepRequest {
    public String cep;


    public CepRequest() {
    }

    public static CepRequest of(String cep) {
        return new CepRequest(cep);
    }

    public CepRequest(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }



}
