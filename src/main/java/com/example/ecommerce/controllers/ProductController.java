package com.example.ecommerce.controllers;

import com.example.ecommerce.DTOs.CustomerDTO;
import com.example.ecommerce.DTOs.ProductDTO;
import com.example.ecommerce.models.Product;
import com.example.ecommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;


    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("all-products")
    public @ResponseBody
    ResponseEntity<List<ProductDTO>> getAllProducts() {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @GetMapping(path = "/product-by-id/{id}")
    public @ResponseBody
    ResponseEntity<ProductDTO> getProductById(@PathVariable("id") int id) {
        ProductDTO productDTO = productService.findProductByProductId(id);
        if (productDTO != null) {
            return new ResponseEntity<>(productDTO, HttpStatus.OK);

        } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(path = "/add-product")
    public @ResponseBody
    ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO dto = productService.insertProduct(productDTO);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
