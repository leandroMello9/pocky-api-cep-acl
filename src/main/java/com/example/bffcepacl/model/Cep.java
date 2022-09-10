package com.example.bffcepacl.model;

public class Cep {
      public String cep;
      public String logradouro;
      public String complemento;
      public String bairro;
      public String localidade;
      


    public Cep() {
    }
 

    public Cep(String cep, String logradouro, String complemento, String bairro, String localidade) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.localidade = localidade;
    }
    public static Cep of(String cep, String logradouro, String complemento, String bairro, String localidade) {
        return new Cep(cep, logradouro, complemento, bairro, localidade);
    }


    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return this.logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return this.complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return this.localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }


    
}
