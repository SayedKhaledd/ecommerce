package com.example.ecommerce.controllers;

import com.example.ecommerce.DTOs.CustomerDTO;
import com.example.ecommerce.models.Customer;
import com.example.ecommerce.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {
    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/all-customers")
    public @ResponseBody
    List<CustomerDTO> getAllCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping(path = "/customer/{id}")
    public @ResponseBody
    CustomerDTO getCustomerById(@PathVariable("id") int id) {
        return customerService.findCustomerById(id);
    }

    @DeleteMapping(value = "/delete-customer/{id}")
    public @ResponseBody
    ResponseEntity<Integer> deleteCustomerById(@PathVariable("id") int id) {
        int result = customerService.deleteCustomerById(id);
        if (result == 0)
            return new ResponseEntity<>(id, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(path = "/delete-customer-by-email", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity<String> deleteCustomerByEmail(@RequestParam(value = "email") String email) {
        int result = customerService.deleteCustomerByEmail(email);
        if (result == 0)
            return new ResponseEntity<>(email, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(path = "/customer-by-email/{email}")
    public @ResponseBody
    ResponseEntity<CustomerDTO> getCustomerByEmail(@PathVariable("email") String email) {
        CustomerDTO customerDTO = customerService.findCustomerByEmail(email);
        if (customerDTO != null) {
            return new ResponseEntity<>(customerDTO, HttpStatus.OK);

        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(path = "/add-customer")
    public @ResponseBody
    ResponseEntity<CustomerDTO> addCustomer(@RequestBody CustomerDTO customerDTO) {
        CustomerDTO dto = customerService.insertCustomer(customerDTO);
         return new ResponseEntity<>(dto, HttpStatus.OK);
    }


}
