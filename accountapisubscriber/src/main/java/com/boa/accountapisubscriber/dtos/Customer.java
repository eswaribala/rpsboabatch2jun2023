package com.boa.accountapisubscriber.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;




@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class Customer {



   private FullName name;

   private String email;

   private long contactNo;

   private String password;
}
