package com.example.adamdemo.AdminModule.Entity.Address;

import com.example.adamdemo.AdminModule.Entity.Account.AccountsEntity;
import com.example.adamdemo.AdminModule.Entity.District.DistrictEntity;
import com.example.adamdemo.AdminModule.Entity.Order.OrderEntity;
import com.example.adamdemo.AdminModule.Entity.Province.ProvinceEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "address_detail")
    private String addressDetail;
    @Column(name = "is_deleted")
    private Boolean isDelete;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @Column(name = "is_default")
    private Boolean isDefault;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "full_name")
    private String fullName;

    @JsonIgnore
    @OneToMany(mappedBy = "address")
    private List<OrderEntity> orders = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "province_id")
    private ProvinceEntity province;
    @ManyToOne
    @JoinColumn(name = "district_id")
    private DistrictEntity district;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountsEntity account;
}
