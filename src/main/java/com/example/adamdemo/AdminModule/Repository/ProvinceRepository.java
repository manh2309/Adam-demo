package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.Province.ProvinceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceEntity, Integer> {
}
