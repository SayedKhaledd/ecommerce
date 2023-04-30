package com.example.ecommerce.services;

import com.example.ecommerce.respositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    private final CategoryRepository repo;

    @Autowired
    public CategoryService(CategoryRepository repo) {
        this.repo = repo;
    }


}
