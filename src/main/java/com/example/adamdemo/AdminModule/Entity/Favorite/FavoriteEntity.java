package com.example.adamdemo.AdminModule.Entity.Favorite;

import com.example.adamdemo.AdminModule.Entity.Account.AccountsEntity;
import com.example.adamdemo.AdminModule.Entity.Product.ProductEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "favorites")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteEntity {
    @EmbeddedId
    private FavoriteId favoriteId;
    @Column(name = "time_create")
    private LocalDateTime time_create;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
    @ManyToOne
    @MapsId("accountId")
    @JsonBackReference
    @JoinColumn(name = "account_id", insertable = false, updatable = false)
    private AccountsEntity account = new AccountsEntity();
    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne
    @MapsId("productId")
    @JsonBackReference
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private ProductEntity product = new ProductEntity();
}
