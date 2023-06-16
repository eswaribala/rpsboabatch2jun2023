package com.boa.accountapisubscriber.repositories;

import com.boa.accountapisubscriber.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AddressRepo  extends JpaRepository<Address,Long> {

    @Query("Select a from Address a where a.customer.accountNo=:accountNo")
    public List<Address> findByAccountNo(@Param("accountNo") long accountNo);
}
