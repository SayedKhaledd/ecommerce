package com.example.ecommerce.mappers;

import com.example.ecommerce.DTOs.CategoryDTO;
import com.example.ecommerce.DTOs.CustomerDTO;
import com.example.ecommerce.models.Category;
import com.example.ecommerce.models.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(target = "products", ignore = true)
    CategoryDTO toDTO(Category entity);

    Category toEntity(CategoryDTO dto);

    List<CategoryDTO> toDTOList(List<Category> entities);
    List<Category> toEntityList(List<CategoryDTO> dto);
}
