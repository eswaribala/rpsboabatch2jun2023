package com.boa.accountapisubscriber.facades;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface CustomerFacade {
    String inChannelName="message-in";
    @Input(inChannelName)
    MessageChannel inChannel();
}
