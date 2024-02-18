package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.HistoryOrder.HistoryOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryOrderRepository extends JpaRepository<HistoryOrderEntity, Integer> {
}
