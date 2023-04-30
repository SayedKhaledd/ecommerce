package com.example.ecommerce.services;

import com.example.ecommerce.DTOs.CategoryDTO;
import com.example.ecommerce.DTOs.ProductDTO;
import com.example.ecommerce.mappers.ProductMapper;
import com.example.ecommerce.models.Product;
import com.example.ecommerce.respositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;
    ProductMapper instance = ProductMapper.INSTANCE;

    @Autowired
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<ProductDTO> getProducts() {
        return instance.toDTOList(repo.findAll());
    }

    public ProductDTO insertProduct(ProductDTO productDTO) {

        return instance.toDTO(repo.save(instance.toEntity(productDTO)));
    }

    public int deleteProductById(int id) {
        return repo.deleteProductByProductId(id);
    }

    public ProductDTO findProductByProductId(int id) {
        return instance.toDTO(repo.findProductByProductId(id));
    }

    public List<ProductDTO> getProductByCategory(int categoryId) {
        return instance.toDTOList(repo.findAllByCategory_CategoryId(categoryId));
    }
}
