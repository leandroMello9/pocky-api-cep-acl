package com.example.bffcepacl.acl.cep;

import com.example.bffcepacl.acl.cep.dto.CepRequest;
import com.example.bffcepacl.acl.cep.dto.CepResponse;

public interface CepProxy {
    CepResponse consultarCep(CepRequest request);
}
