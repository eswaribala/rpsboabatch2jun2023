package com.boa.jwtsecurity.repositories;


import com.boa.jwtsecurity.models.User;
import org.springframework.data.jpa.repository.JpaRepository;





public interface UserRepository extends JpaRepository<User,String>{

}
