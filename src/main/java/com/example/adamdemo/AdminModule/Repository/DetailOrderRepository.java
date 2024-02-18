package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.DetailOrder.DetailOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailOrderRepository extends JpaRepository<DetailOrderEntity, Integer> {
}
