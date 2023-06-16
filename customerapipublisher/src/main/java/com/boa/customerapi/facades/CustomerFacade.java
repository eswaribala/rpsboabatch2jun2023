package com.boa.customerapi.facades;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerFacade {
    String outChannelName="message-out";

    @Output(outChannelName)
    MessageChannel outChannel();
}
