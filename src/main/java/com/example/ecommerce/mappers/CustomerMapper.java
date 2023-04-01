package com.example.ecommerce.mappers;

import com.example.ecommerce.DTOs.CustomerDTO;
import com.example.ecommerce.models.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "customer.orders", ignore = true)
    CustomerDTO toDTO(Customer entity);

    Customer toEntity(CustomerDTO dto);


    List<CustomerDTO> toDTOList(List<Customer> entities);

    List<Customer> toEntityList(List<CustomerDTO> dto);

}
