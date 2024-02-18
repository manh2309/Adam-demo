package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.MaterialProduct.MaterialProductEntity;
import com.example.adamdemo.AdminModule.Entity.MaterialProduct.MaterialProductPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialProductRepository extends JpaRepository<MaterialProductEntity, MaterialProductPK> {
}
