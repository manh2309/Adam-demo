package com.example.adamdemo.AdminModule.Entity.Color;

import com.example.adamdemo.AdminModule.Entity.DetailProduct.DetailProductEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "colors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "color_name")
    private String colorName;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @JsonIgnore
    @OneToMany(mappedBy = "color", cascade = CascadeType.ALL)
    private List<DetailProductEntity> detailProducts = new ArrayList<>();
}
