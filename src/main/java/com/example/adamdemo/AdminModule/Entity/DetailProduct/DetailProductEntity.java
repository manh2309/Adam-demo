package com.example.adamdemo.AdminModule.Entity.DetailProduct;

import com.example.adamdemo.AdminModule.Entity.CartItems.CartItemEntity;
import com.example.adamdemo.AdminModule.Entity.Color.ColorEntity;
import com.example.adamdemo.AdminModule.Entity.Product.ProductEntity;
import com.example.adamdemo.AdminModule.Entity.Size.SizeEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "detail_products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetailProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer quantity;
    @Column(name = "price_import")
    private Double priceImport;
    @Column(name = "price_export")
    private Double priceExport;
    @Column(name = "is_deleted")
    private Boolean isDelete;
    @Column(name = "image_product")
    private String productImage;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity product;
    @ManyToOne
    @JoinColumn(name = "color_id")
    private ColorEntity color;
    @ManyToOne
    @JoinColumn(name = "size_id")
    private SizeEntity size;
    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "create_date")
    private LocalDateTime createDate;
    @JsonIgnore
    @OneToMany(mappedBy = "detailProduct")
    List<CartItemEntity> cartItems = new ArrayList<>();
}
