package com.example.adamdemo.AdminModule.Entity.District;

import com.example.adamdemo.AdminModule.Entity.Address.AddressEntity;
import com.example.adamdemo.AdminModule.Entity.Province.ProvinceEntity;
import com.example.adamdemo.AdminModule.Entity.Ward.WardEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "districts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String prefix;
    @ManyToOne
    @JoinColumn(name = "province_id")
    private ProvinceEntity province;
    @JsonIgnore
    @OneToMany(mappedBy = "district")
    private List<WardEntity> wards = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "district")
    private List<AddressEntity> addresses = new ArrayList<>();
}
