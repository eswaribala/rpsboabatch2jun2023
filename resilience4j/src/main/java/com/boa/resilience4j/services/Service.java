package com.boa.resilience4j.services;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@org.springframework.stereotype.Service
@Slf4j
public class Service {

    @Value("${serviceUrl}")
    private String serviceUrl;
    @Value("${alternativeServiceUrl}")
    private String alternativeServiceUrl;
    @Autowired
    private RestTemplate restTemplate;
    

    @CircuitBreaker(name = "gatewayCircuitBreaker", 
    		fallbackMethod = "fallback")
    @Retry(name = "gatewayRetry")
    public String fetchData(String userName,String userPwd) {
        log.info(" Making a request to " + serviceUrl + " at :" 
    + LocalDateTime.now());

       
        return restTemplate.getForObject(serviceUrl+"?userName="+userName+"&userPwd="+userPwd, String.class);
    }

    public String fallback(String userName,String userPwd,Exception e) {
         return restTemplate.getForObject(alternativeServiceUrl, String.class);
    }
}
