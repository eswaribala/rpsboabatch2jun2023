package com.boa.customerapi.services;

import com.boa.customerapi.models.Individual;
import com.boa.customerapi.repositories.IndividualRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividualService {
    @Autowired
    private IndividualRepo individualRepo;

    //insert
    public Individual addIndividual(Individual individual){

        return this.individualRepo.save(individual);
    }

    //select
    public List<Individual> findAllIndividuals(){
        return this.individualRepo.findAll();
    }


    //where individual by id

    public Individual findIndividualById(long accountNo){
        return this.individualRepo.findById(accountNo).orElse(null);
    }

    public List<Individual> findIndividualByContactNo(long contactNo){
        return this.individualRepo.findByContactNo(contactNo);
    }

    //update

    public Individual updateIndividualEmail(long accountNo, String email){

        Individual individual=this.findIndividualById(accountNo);
        if(individual!=null){
            individual.setEmail(email);
            this.individualRepo.save(individual);
            return individual;
        }
        else
            return null;

    }


    //delete

    public boolean deleteIndividualById(long accountNo){
        boolean status=false;
        Individual individual=this.findIndividualById(accountNo);
        if(individual!=null){
            this.individualRepo.deleteById(accountNo);
            status=true;
        }
        return status;

    }



}
