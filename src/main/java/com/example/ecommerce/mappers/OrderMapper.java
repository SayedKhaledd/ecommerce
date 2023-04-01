package com.example.ecommerce.mappers;

import com.example.ecommerce.DTOs.OrderDTO;
import com.example.ecommerce.DTOs.OrderItemDTO;
import com.example.ecommerce.models.Order;
import com.example.ecommerce.models.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(source = "customer.customerId", target = "customerId")
    OrderDTO toDTO(Order entity);

    Order toEntity(OrderDTO dto);

    List<OrderDTO> toDTOList(List<Order> entities);
    List<Order> toEntityList(List<OrderDTO> dto);
}
