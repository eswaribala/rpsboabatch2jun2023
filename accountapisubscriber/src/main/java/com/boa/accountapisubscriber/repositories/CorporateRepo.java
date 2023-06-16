package com.boa.accountapisubscriber.repositories;

import com.boa.accountapisubscriber.models.Corporate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateRepo extends JpaRepository<Corporate,Long> {
}
