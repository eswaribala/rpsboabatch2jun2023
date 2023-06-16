package com.boa.accountapisubscriber.services;

import com.boa.accountapisubscriber.models.Address;
import com.boa.accountapisubscriber.models.Customer;
import com.boa.accountapisubscriber.repositories.AddressRepo;
import com.boa.accountapisubscriber.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private CustomerRepo customerRepo;

    //insert
    public Address addAddress(Address address, long accountNo){

        Customer customer = this.customerRepo.findById(accountNo).orElse(null);
        if(customer!=null){
            address.setCustomer(customer);
            this.addressRepo.save(address);
            return address;
        }
        else
            return null;

    }

    //select
    public List<Address> findAllAddresss(){
        return this.addressRepo.findAll();
    }


    //where Address by id

    public List<Address> findAddressById(long accountNo){


        return this.addressRepo.findByAccountNo(accountNo);
    }


    //update

    public Address updateAddress(Address address){

        Customer customer = this.customerRepo.findById(address.getCustomer().getAccountNo()).orElse(null);
        if(customer!=null){
            address.setCustomer(customer);
            this.addressRepo.save(address);
            return address;
        }
        else
            return null;

    }


    //delete

    public boolean deleteAddressById(long accountNo,long addressId){
        boolean status=false;
        List<Address> addresses = this.addressRepo.findByAccountNo(accountNo);

        Address address= addresses.stream().filter(a->a.getAddressId()==addressId).findFirst().orElse(null);
        if(address!=null){
            this.addressRepo.deleteById(address.getAddressId());
            status=true;
        }
      return status;
    }
}
