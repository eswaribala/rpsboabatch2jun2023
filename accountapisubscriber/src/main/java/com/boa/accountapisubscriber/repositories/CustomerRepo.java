package com.boa.accountapisubscriber.repositories;

import com.boa.accountapisubscriber.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
