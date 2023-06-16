package com.boa.accountapisubscriber.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Builder
public class FullName {

    private String firstName;

    private String middleName;

    private String lastName;
}
