package com.example.ecommerce.respositories;

import com.example.ecommerce.models.Category;
import com.example.ecommerce.models.Customer;
import com.example.ecommerce.models.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    //read
    List<Product> findAll();

    Product findProductByProductId(int productId);

    List<Product> findAllByCategory_CategoryId(int id);

    //delete
    @Transactional
    int deleteProductByProductId(int productId);

}
