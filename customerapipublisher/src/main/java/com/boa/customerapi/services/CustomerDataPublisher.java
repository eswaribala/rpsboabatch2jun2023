package com.boa.customerapi.services;

import com.boa.customerapi.facades.CustomerFacade;
import com.boa.customerapi.models.Customer;
import com.boa.customerapi.models.Individual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;

@Service
public class CustomerDataPublisher {
    @Autowired
    private CustomerFacade customerFacade;

    public boolean publishMessage(Individual individual){

        MessageChannel messageChannel= customerFacade.outChannel();

        if(individual!=null) {
            return  messageChannel.send(MessageBuilder
                    .withPayload(individual)
                    .setHeader(MessageHeaders.CONTENT_TYPE,
                            MimeTypeUtils.APPLICATION_JSON)
                    .build());
        }
        else
        {
            return false;
        }



    }

}



