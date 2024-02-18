package com.example.adamdemo.AdminModule.Entity.Ward;

import com.example.adamdemo.AdminModule.Entity.Address.AddressEntity;
import com.example.adamdemo.AdminModule.Entity.District.DistrictEntity;
import com.example.adamdemo.AdminModule.Entity.Province.ProvinceEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String prefix;
    @ManyToOne
    @JoinColumn(name = "province_id")
    private ProvinceEntity province;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private DistrictEntity district;
    @JsonIgnore
    @OneToMany(mappedBy = "ward")
    private List<AddressEntity> addresses = new ArrayList<>();
}
