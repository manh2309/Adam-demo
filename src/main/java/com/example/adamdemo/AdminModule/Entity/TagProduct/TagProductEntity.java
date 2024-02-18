package com.example.adamdemo.AdminModule.Entity.TagProduct;

import com.example.adamdemo.AdminModule.Entity.Product.ProductEntity;
import com.example.adamdemo.AdminModule.Entity.Tag.TagEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tag_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagProductEntity {
    @EmbeddedId
    private TagProductPK tagProductPK;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @ManyToOne
    @MapsId("tagId")
    @JoinColumn(name = "tag_id")
    private TagEntity tag = new TagEntity();
    @Column(name = "is_active")
    private Boolean isActive;
    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    private ProductEntity product = new ProductEntity();
    @Column(name = "create_date")
    private LocalDateTime createDate;
}
