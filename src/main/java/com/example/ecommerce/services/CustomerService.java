package com.example.ecommerce.services;

import com.example.ecommerce.DTOs.CustomerDTO;
import com.example.ecommerce.mappers.CustomerMapper;
import com.example.ecommerce.models.Customer;
import com.example.ecommerce.respositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository repo;
    CustomerMapper instance = CustomerMapper.INSTANCE;

    @Autowired
    public CustomerService(CustomerRepository repo) {
        this.repo = repo;
    }

    public List<CustomerDTO> getCustomers() {
        return instance.toDTOList(repo.findAll());

    }

    public void updateCustomer(CustomerDTO dto) {
        insertCustomer(dto);
    }

    public void insertCustomer(CustomerDTO dto) {
        repo.save(instance.toEntity(dto));

    }

    public CustomerDTO findCustomerById(int id) {
        return instance.toDTO(repo.findCustomerByCustomerId(id));
    }

    public int deleteCustomerById(int id) {
        return repo.deleteCustomerByCustomerId(id);
    }

    public CustomerDTO findCustomerByEmail(String email) {
        return instance.toDTO(repo.findCustomerByEmail(email));
    }

    public int deleteCustomerByEmail(String email) {
        return repo.removeCustomerByEmail(email);
    }
}
