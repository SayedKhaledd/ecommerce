package com.example.ecommerce.tests;

import com.example.ecommerce.DTOs.ProductDTO;
import com.example.ecommerce.mappers.ProductMapper;
import com.example.ecommerce.models.Category;
import com.example.ecommerce.models.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ProductMapperTest {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductId(1);
        product.setProductName("my product");
        Category category = new Category();
        category.setCategoryId(2);
        category.setCategoryName("my category");
        product.setCategory(category);
        product.setPrice(222);
        product.setDescription("my dis");
        product.setImage("url");
        ArrayList<Product> arr=new ArrayList<>();
        arr.add(product);
        category.setProducts(arr);

        ProductDTO dto= ProductMapper.INSTANCE.toDTO(product);
        System.out.println("hello");
        System.out.println(dto.toString());



    }
}
