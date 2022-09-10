package com.example.bffcepacl.facade;

import com.example.bffcepacl.stereotypes.AbstractResponse;

public class DefaultResponse<T> extends AbstractResponse<T> {
    public static<T> DefaultResponse of(T data) {
        DefaultResponse<T> response = new DefaultResponse<>();
        response.setData(data);
        return response;
    }
}
