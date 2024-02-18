package com.example.adamdemo.AdminModule.Entity.CartItems;

import com.example.adamdemo.AdminModule.Entity.Account.AccountsEntity;
import com.example.adamdemo.AdminModule.Entity.DetailProduct.DetailProductEntity;
import com.example.adamdemo.AdminModule.Entity.Order.OrderEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cart_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    @Column(name = "total_price")
    private Double totalPrice;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountsEntity account;
    @ManyToOne
    @JoinColumn(name = "detail_product_id")
    private DetailProductEntity detailProduct;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;
}
