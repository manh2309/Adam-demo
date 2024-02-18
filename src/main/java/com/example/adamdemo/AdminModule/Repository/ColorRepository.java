package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.Color.ColorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<ColorEntity, Integer> {
}
