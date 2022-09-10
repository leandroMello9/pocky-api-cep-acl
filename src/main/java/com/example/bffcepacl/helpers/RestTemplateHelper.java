package com.example.bffcepacl.helpers;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component

public class RestTemplateHelper {
    public RestTemplate callApi() {

        return new RestTemplate();
    }
}
