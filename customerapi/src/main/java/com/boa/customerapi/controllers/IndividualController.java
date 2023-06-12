package com.boa.customerapi.controllers;

import com.boa.customerapi.dtos.ResponseWrapper;
import com.boa.customerapi.models.Individual;
import com.boa.customerapi.services.IndividualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/individuals")
public class IndividualController {
    @Autowired
    private IndividualService individualService;

   @PostMapping("/v1.0/")
   public ResponseEntity<ResponseWrapper> addIndividual(@RequestBody Individual individual){

      Individual indobj= this.individualService.addIndividual(individual);

      if(indobj!=null){
          return ResponseEntity.status(HttpStatus.ACCEPTED).body(new ResponseWrapper(indobj));
      }
      else
          return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseWrapper("Individual not created"));

   }

   @GetMapping("/v1.0/")
   public List<Individual> getAllIndividuals(){
       return this.individualService.findAllIndividuals();
   }


}
