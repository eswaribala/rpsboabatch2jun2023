package com.boa.accountapisubscriber.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Document("customers")
public class Individual {
    @Id
    private FullName name;

    private String email;

    private long contactNo;

    private String password;
    private LocalDate dob;

    private Gender gender;

}
