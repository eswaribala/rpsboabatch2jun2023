package com.boa.customerapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
@Builder
public class FullName {
    @Column(name="First_Name",nullable = false,length = 150)
    private String firstName;
    @Column(name="Middle_Name",nullable = true,length = 150)
    private String middleName;
    @Column(name="Last_Name",nullable = false,length = 150)
    private String lastName;
}
