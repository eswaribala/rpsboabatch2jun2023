package com.boa.accountapisubscriber.services;

import com.boa.accountapisubscriber.dtos.Individual;
import com.boa.accountapisubscriber.facades.CustomerFacade;
import com.boa.accountapisubscriber.repositories.IndividualRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumerService {

    @Autowired
   private IndividualRepo individualRepo;


    @StreamListener(target = CustomerFacade.inChannelName)
    public void handlePayment(@Payload Individual individual) {

        System.out.println("Received Individual details: "+individual);

        this.individualRepo.save(individual);
    }

}
