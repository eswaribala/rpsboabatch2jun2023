package com.boa.accountapisubscriber.dtos;

import com.boa.accountapisubscriber.models.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class IndividualInput {


        private long accountNo;

        private FullNameInput name;

        private String email;

        private long contactNo;

        private String password;

        private LocalDate dob;
        private Gender gender;

}
