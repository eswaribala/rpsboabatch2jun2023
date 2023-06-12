package com.boa.customerapi.repositories;

import com.boa.customerapi.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo  extends JpaRepository<Address,Long> {
}
