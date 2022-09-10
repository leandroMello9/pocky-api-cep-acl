package com.example.bffcepacl.stereotypes;

public class AbstractResponse<T> {
    public T data;

    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}
