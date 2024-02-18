package com.example.adamdemo.AdminModule.Entity.MaterialProduct;

import com.example.adamdemo.AdminModule.Entity.Material.MaterialEntity;
import com.example.adamdemo.AdminModule.Entity.Product.ProductEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "material_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialProductEntity {
    @EmbeddedId
    private MaterialProductPK materialProductPK;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @ManyToOne
    @MapsId("materialId")
    @JoinColumn(name = "material_id")
    private MaterialEntity material = new MaterialEntity();
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private ProductEntity product = new ProductEntity();
}
