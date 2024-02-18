package com.example.adamdemo.AdminModule.Entity.Material;

import com.example.adamdemo.AdminModule.Entity.MaterialProduct.MaterialProductEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "materials")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "material_name")
    private String materialName;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @JsonIgnore
    @OneToMany(mappedBy = "material")
    private List<MaterialProductEntity> materialProducts = new ArrayList<>();
}
