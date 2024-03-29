package com.example.adamdemo.AdminModule.Entity.Event;

import com.example.adamdemo.AdminModule.Entity.DiscountOrder.DiscountOrderEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "events")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventEntity {
    @OneToMany(mappedBy = "event")
    List<DiscountOrderEntity> discountOrders;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "event_name")
    private String eventName;
    @Column(name = "start_time")
    private LocalDateTime startTime;
    @Column(name = "end_time")
    private LocalDateTime endTime;
    private String description;
    @Column(name = "is_deleted")
    private Boolean isDelete;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    private Boolean type;
    private String image;
}
