package com.example.adamdemo.AdminModule.Entity.Comment;

import com.example.adamdemo.AdminModule.Entity.Account.AccountsEntity;
import com.example.adamdemo.AdminModule.Entity.Product.ProductEntity;
import com.example.adamdemo.AdminModule.Enums.CommentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    @Column(name = "create_date ")
    private LocalDateTime timeCreated;
    private Integer vote;
    @Column(name = "status")
    private CommentStatus commentStatus;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "comment_parent_id")
    private Integer commentParentId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountsEntity account;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
}
