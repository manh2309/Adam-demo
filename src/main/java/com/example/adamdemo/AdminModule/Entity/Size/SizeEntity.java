package com.example.adamdemo.AdminModule.Entity.Size;

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
@Table(name = "sizes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SizeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "size_name")
    private String sizeName;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @JsonIgnore
    @OneToMany(mappedBy = "size")
    private List<DetailProductEntity> detailProducts = new ArrayList<>();

}
