package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.Size.SizeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<SizeEntity, Integer> {
}
