package com.boa.customerapi.facades;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(CustomerFacade.class)
public class StreamConfig {
}
