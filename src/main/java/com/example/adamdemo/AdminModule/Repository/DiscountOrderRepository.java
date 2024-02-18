package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.DiscountOrder.DiscountOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountOrderRepository extends JpaRepository<DiscountOrderEntity, Integer> {
}
