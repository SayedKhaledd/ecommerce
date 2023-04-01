package com.example.ecommerce.mappers;

import com.example.ecommerce.DTOs.OrderDTO;
import com.example.ecommerce.DTOs.ProductDTO;
import com.example.ecommerce.models.Order;
import com.example.ecommerce.models.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(source = "category.categoryId", target = "categoryId")
    ProductDTO toDTO(Product entity);

    Product toEntity(ProductDTO dto);

    List<ProductDTO> toDTOList(List<Product> entities);

    List<Product> toEntityList(List<ProductDTO> dto);
}
