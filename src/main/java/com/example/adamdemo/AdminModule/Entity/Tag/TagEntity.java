package com.example.adamdemo.AdminModule.Entity.Tag;

import com.example.adamdemo.AdminModule.Entity.TagProduct.TagProductEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tags")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "tag_name")
    private String tagName;
    @Column(name = "is_deleted")
    private Boolean isDelete;
    @Column(name = "is_active")
    private Boolean isActive;
    @JsonIgnore
    @OneToMany(mappedBy = "tag")
    private List<TagProductEntity> tagProducts = new ArrayList<>();
    @Column(name = "create_date")
    private LocalDateTime createDate;
}
