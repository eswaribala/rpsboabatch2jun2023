package com.boa.accountapisubscriber.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Individual extends  Customer{

    private LocalDate dob;

    private Gender gender;

}
