package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.CartItems.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemEntity, Integer> {
}
