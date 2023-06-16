package com.boa.customerapi.services;

import com.boa.customerapi.models.Corporate;
import com.boa.customerapi.models.Individual;
import com.boa.customerapi.repositories.CorporateRepo;
import com.boa.customerapi.repositories.IndividualRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorporateService {
    @Autowired
    private CorporateRepo corporateRepo;

    //insert
    public Corporate addCorporate(Corporate corporate){

        return this.corporateRepo.save(corporate);
    }

    //select
    public List<Corporate> findAllCorporates(){
        return this.corporateRepo.findAll();
    }


    //where Corporate by id

    public Corporate findCorporateById(long accountNo){
        return this.corporateRepo.findById(accountNo).orElse(null);
    }


    //update

    public Corporate updateCorporateEmail(long accountNo, String email){

        Corporate Corporate=this.findCorporateById(accountNo);
        if(Corporate!=null){
            Corporate.setEmail(email);
            this.corporateRepo.save(Corporate);
            return Corporate;
        }
        else
            return null;

    }


    //delete

    public boolean deleteCorporateById(long accountNo){
        boolean status=false;
        Corporate Corporate=this.findCorporateById(accountNo);
        if(Corporate!=null){
            this.corporateRepo.deleteById(accountNo);
            status=true;
        }
        return status;

    }
}
