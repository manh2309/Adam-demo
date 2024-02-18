package com.example.adamdemo.AdminModule.Entity.UserInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String token;
    @Column(name = "time_valid")
    private LocalDateTime timeValid;
    @Column(name = "is_deleted")
    private Boolean isDeleted;
}
