package com.example.adamdemo.AdminModule.Repository;

import com.example.adamdemo.AdminModule.Entity.UserInfo.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Integer> {
}
