package com.boa.customerapi.repositories;

import com.boa.customerapi.models.Corporate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CorporateRepo extends JpaRepository<Corporate,Long> {
}
