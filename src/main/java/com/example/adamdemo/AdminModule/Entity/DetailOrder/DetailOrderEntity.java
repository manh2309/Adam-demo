package com.example.adamdemo.AdminModule.Entity.DetailOrder;

import com.example.adamdemo.AdminModule.Entity.DetailProduct.DetailProductEntity;
import com.example.adamdemo.AdminModule.Entity.Order.OrderEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "detail_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    private Double price;
    @Column(name = "total_price")
    private Double totalPrice;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @Column(name = "reason")
    private String reason;
    @Column(name = "detail_order_code")
    private String detailOrderCode;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "detail_product_id")
    private DetailProductEntity detailProduct;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;
}
