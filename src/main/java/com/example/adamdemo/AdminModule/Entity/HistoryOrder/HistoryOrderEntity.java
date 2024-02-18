package com.example.adamdemo.AdminModule.Entity.HistoryOrder;

import com.example.adamdemo.AdminModule.Entity.Order.OrderEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "history_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer status;
    @Column(name = "update_time")
    private LocalDateTime updateTime;
    private String description;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "total_price")
    private Double totalPrice;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "order_id")
    private OrderEntity order;
}
