package com.boa.customerapi.mutations;

import com.boa.customerapi.dtos.IndividualInput;
import com.boa.customerapi.models.FullName;
import com.boa.customerapi.models.Individual;
import com.boa.customerapi.services.IndividualService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndividualMutation implements GraphQLMutationResolver {
    @Autowired
    private IndividualService individualService;

    public Individual addIndividual(IndividualInput individualInput){

        Individual individual=Individual.builder()
                .accountNo(individualInput.getAccountNo())
                .email(individualInput.getEmail())
                .dob(individualInput.getDob())
                .gender(individualInput.getGender())
                .password(individualInput.getPassword())
                .name(FullName.builder()
                        .firstName(individualInput.getName().getFirstName())
                        .middleName(individualInput.getName().getMiddleName())
                        .lastName(individualInput.getName().getLastName()).build()).build();
        return this.individualService.addIndividual(individual);


    }

    public Individual  updateIndividual(long accountNo, String email){
        return this.individualService.updateIndividualEmail(accountNo,email);
    }

    public Boolean deleteIndividual(long accountNo){
        return this.individualService.deleteIndividualById(accountNo);
    }


}
