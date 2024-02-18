package com.example.adamdemo.AdminModule.Entity.Province;

import com.example.adamdemo.AdminModule.Entity.Address.AddressEntity;
import com.example.adamdemo.AdminModule.Entity.District.DistrictEntity;
import com.example.adamdemo.AdminModule.Entity.Ward.WardEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "provinces")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @JsonIgnore
    @OneToMany(mappedBy = "province")
    private List<DistrictEntity> districts = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "province")
    private List<WardEntity> wards = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "province")
    private List<AddressEntity> addresses = new ArrayList<>();
}
