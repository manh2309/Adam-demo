package com.example.adamdemo.AdminModule.Entity.Product;

import com.example.adamdemo.AdminModule.Entity.Category.CategoryEntity;
import com.example.adamdemo.AdminModule.Entity.MaterialProduct.MaterialProductEntity;
import com.example.adamdemo.AdminModule.Entity.TagProduct.TagProductEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sizes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    private String image;
    private String description;
    @Column(name = "is_deleted")
    private Boolean isDelete;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
    @Column(name = "vote_average")
    private Double voteAverage;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_completed")
    private Boolean isComplete;
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<TagProductEntity> tagProducts = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<MaterialProductEntity> materialProducts = new ArrayList<>();
}
