package com.example.adamdemo.AdminModule.Entity.Order;

import com.example.adamdemo.AdminModule.Entity.Account.AccountsEntity;
import com.example.adamdemo.AdminModule.Entity.Address.AddressEntity;
import com.example.adamdemo.AdminModule.Entity.CartItems.CartItemEntity;
import com.example.adamdemo.AdminModule.Entity.DetailOrder.DetailOrderEntity;
import com.example.adamdemo.AdminModule.Entity.HistoryOrder.HistoryOrderEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer status;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private AccountsEntity account;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "amount_price")
    private Double amountPrice;
    @Column(name = "sale_price")
    private Double salePrice;
    @Column(name = "total_price")
    private Double totalPrice;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity address;
    @Column(name = "address_detail")
    private String addressDetail;
    @Column(name = "order_code")
    private String orderCode;
    @Column(name = "return_order_price")
    private Double returnOrderPrice = 0.0;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<HistoryOrderEntity> historyOrders = new ArrayList<>();

    @OneToMany(mappedBy = "order")
    private List<CartItemEntity> cartItems = new ArrayList<>();
    @JsonIgnore
    @OneToMany(mappedBy = "order")
    private List<DetailOrderEntity> detailOrders = new ArrayList<>();
}
