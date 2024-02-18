package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.Category.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}
