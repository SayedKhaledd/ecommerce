package com.example.ecommerce.mappers;

import com.example.ecommerce.DTOs.CategoryDTO;
import com.example.ecommerce.DTOs.OrderItemDTO;
import com.example.ecommerce.models.Category;
import com.example.ecommerce.models.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")

public interface OrderItemMapper {

    OrderItemMapper INSTANCE = Mappers.getMapper(OrderItemMapper.class);

    @Mapping(source = "product.productId", target = "productId")
    @Mapping(source = "order.orderId", target = "orderId")
    OrderItemDTO toDTO(OrderItem entity);

    OrderItem toEntity(OrderItemDTO dto);

    List<OrderItemDTO> toDTOList(List<OrderItem> entities);
    List<OrderItem> toEntityList(List<OrderItemDTO> dto);
}
