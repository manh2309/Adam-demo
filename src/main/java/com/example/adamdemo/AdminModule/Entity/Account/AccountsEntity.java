package com.example.adamdemo.AdminModule.Entity.Account;

import com.example.adamdemo.AdminModule.Entity.Address.AddressEntity;
import com.example.adamdemo.AdminModule.Entity.CartItems.CartItemEntity;
import com.example.adamdemo.AdminModule.Entity.Comment.CommentEntity;
import com.example.adamdemo.AdminModule.Entity.Favorite.FavoriteEntity;
import com.example.adamdemo.AdminModule.Entity.Order.OrderEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountsEntity {
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<AddressEntity> addresses = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<CommentEntity> commentList = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<FavoriteEntity> favoriteList;
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<CartItemEntity> cartItemsList = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "account")
    List<OrderEntity> orderList = new ArrayList<>();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "phone_number", unique = true)
    private String phoneNumber;
    @Column(name = "full_name")
    private String fullName;
    @Column(unique = true)
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    private String photo;
    private String role;
    @Column(name = "verification_code")
    private Integer verificationCode;
    @Column(name = "time_valid")
    private LocalDateTime timeValid;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_deleted")
    private Boolean isDelete;
    private Double priority;
    @Column(name = "create_date")
    private LocalDateTime createDate;
}
