package com.boa.accountapisubscriber.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

@Document("customers")
public class Customer {


@Id
   private FullName name;

   private String email;

   private long contactNo;

   private String password;
}
