package com.example.ecommerce.respositories;

import com.example.ecommerce.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Customer, Integer> {


}
