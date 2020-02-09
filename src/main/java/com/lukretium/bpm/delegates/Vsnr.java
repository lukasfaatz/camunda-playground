package com.lukretium.bpm.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Vsnr implements JavaDelegate {


    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        // call service

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(BASE_URL + "/users/1", String.class);

        // safe response in variables



        System.out.println("VSNR = '2398237803223'");
    }
}
