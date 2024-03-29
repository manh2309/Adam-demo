package com.example.adamdemo.AdminModule.Entity.DiscountOrder;

import com.example.adamdemo.AdminModule.Entity.Event.EventEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "discount_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DiscountOrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "discount_name")
    private String discountName;
    private String description;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @Column(name = "start_time")
    private LocalDateTime startTime;
    @Column(name = "end_time")
    private LocalDateTime endTime;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @Column(name = "sale_price")
    private Double salePrice;
    @Column(name = "order_min_range")
    private Double orderMinRange;
    @Column(name = "order_max_range")
    private Double orderMaxRange;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "event_id")
    private EventEntity event;
}
