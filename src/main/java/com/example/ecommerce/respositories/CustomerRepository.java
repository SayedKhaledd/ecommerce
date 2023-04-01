package com.example.ecommerce.respositories;

import com.example.ecommerce.models.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //create

    //read
    List<Customer> findAll();

    Customer findCustomerByCustomerId(Integer id);

    Customer findCustomerByEmail(String email);

    @Transactional
    int deleteCustomerByCustomerId(int id);

    @Transactional
    int removeCustomerByEmail(String email);

}
