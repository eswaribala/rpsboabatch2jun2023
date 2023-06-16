package com.boa.accountapisubscriber.mutations;

import com.boa.accountapisubscriber.dtos.CorporateInput;
import com.boa.accountapisubscriber.models.Corporate;
import com.boa.accountapisubscriber.models.FullName;
import com.boa.accountapisubscriber.services.CorporateService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CorporateMutation implements GraphQLMutationResolver {
    @Autowired
    private CorporateService corporateService;

    public Corporate addCorporate(CorporateInput corporateInput){

        Corporate corporate=Corporate.builder()
                .accountNo(corporateInput.getAccountNo())
                .email(corporateInput.getEmail())
                .companyType(corporateInput.getCompanyType())
                .password(corporateInput.getPassword())
                .name(FullName.builder()
                        .firstName(corporateInput.getName().getFirstName())
                        .middleName(corporateInput.getName().getMiddleName())
                        .lastName(corporateInput.getName().getLastName()).build()).build();
        return this.corporateService.addCorporate(corporate);


    }

    public Corporate  updateCorporate(long accountNo, String email){
        return this.corporateService.updateCorporateEmail(accountNo,email);
    }

    public Boolean deleteCorporate(long accountNo){
        return this.corporateService.deleteCorporateById(accountNo);
    }

}
