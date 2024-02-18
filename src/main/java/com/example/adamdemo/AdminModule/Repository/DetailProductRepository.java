package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.DetailProduct.DetailProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailProductRepository extends JpaRepository<DetailProductEntity, Integer> {
}
