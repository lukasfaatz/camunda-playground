package com.lukretium.bpm.delegates;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

public class VsnrTest {

    public static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    WebClient client = WebClient.create(BASE_URL);

    @Test
    public void should_doRequest_withRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(BASE_URL + "/users/1", String.class);

        System.out.println(result);
    }

    @Test
    public void should_doRequest_withWebFlux() {
        String employeeMono = client.get()
                .uri("/users/{id}", "1")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(employeeMono);
    }

}
