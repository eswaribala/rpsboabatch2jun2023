package com.boa.customerapi.queries;

import com.boa.customerapi.models.Individual;
import com.boa.customerapi.services.IndividualService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IndividualQuery implements GraphQLQueryResolver {
    @Autowired
    private IndividualService individualService;


    public List<Individual> findAllIndividuals(){
        return this.individualService.findAllIndividuals();
    }

    public Individual  findIndividualById(long accountNo){
        return this.individualService.findIndividualById(accountNo);
    }

    public List<Individual> findIndividualByContactNo(long contactNo){
        return this.individualService.findIndividualByContactNo(contactNo);
    }

}
