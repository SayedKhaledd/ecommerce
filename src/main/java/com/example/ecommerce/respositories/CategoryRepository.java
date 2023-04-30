package com.example.ecommerce.respositories;

import com.example.ecommerce.models.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {

    @Override
    List<Category> findAll();

    Category findCategoryByCategoryId(int id);

}
