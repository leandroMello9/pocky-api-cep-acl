package com.example.bffcepacl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bffcepacl.acl.cep.dto.CepResponse;
import com.example.bffcepacl.facade.DefaultResponse;
import com.example.bffcepacl.model.Cep;
import com.example.bffcepacl.service.CepService;

@RestController
public class CepController {
    //
    public CepService cepService;

    @Autowired
    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @GetMapping("/cep")
    public DefaultResponse<Cep> getCep() {
        return DefaultResponse.of(cepService.consultarCep());
    }
}
