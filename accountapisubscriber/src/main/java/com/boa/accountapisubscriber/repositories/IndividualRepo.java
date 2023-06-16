package com.boa.accountapisubscriber.repositories;

import com.boa.accountapisubscriber.dtos.Individual;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IndividualRepo extends MongoRepository<Individual, Long> {
}
