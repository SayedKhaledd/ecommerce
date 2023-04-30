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
    @Mapping(source = "productName", target = "name")
    ProductDTO toDTO(Product entity);

    @Mapping(source = "categoryId", target = "category.categoryId")
    @Mapping(source = "name", target = "productName")
    Product toEntity(ProductDTO dto);

    List<ProductDTO> toDTOList(List<Product> entities);

    List<Product> toEntityList(List<ProductDTO> dto);
}
