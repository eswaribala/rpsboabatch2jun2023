package com.boa.accountapisubscriber.services;

import com.boa.accountapisubscriber.dtos.Individual;
import com.boa.accountapisubscriber.facades.CustomerFacade;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumerService {




    @StreamListener(target = CustomerFacade.inChannelName)
    public void handlePayment(@Payload Individual individual) {

        System.out.println("Received Individual details: "+individual);

    }

}
