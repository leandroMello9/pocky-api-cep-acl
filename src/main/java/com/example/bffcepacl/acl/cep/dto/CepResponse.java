
package com.example.bffcepacl.acl.cep.dto;

import com.example.bffcepacl.stereotypes.AbstractResponse;

public class CepResponse extends AbstractResponse<CepDto> {


    public CepResponse() {
    }
    public CepResponse(CepDto dto) {
        this.setData(dto);
    }
    public static CepResponse of(CepDto dto) {
        return new CepResponse(dto);
    }

}
