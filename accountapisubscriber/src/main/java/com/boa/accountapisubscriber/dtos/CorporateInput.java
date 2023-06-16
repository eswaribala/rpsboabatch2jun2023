package com.boa.accountapisubscriber.dtos;

import com.boa.accountapisubscriber.models.CompanyType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CorporateInput {
    private long accountNo;

    private FullNameInput name;

    private String email;

    private long contactNo;

    private String password;

    private CompanyType companyType;
}
