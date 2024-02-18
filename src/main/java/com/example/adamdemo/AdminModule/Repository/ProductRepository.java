package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.Product.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
