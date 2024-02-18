package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.TagProduct.TagProductEntity;
import com.example.adamdemo.AdminModule.Entity.TagProduct.TagProductPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagProductRepository extends JpaRepository<TagProductEntity, TagProductPK> {
}
