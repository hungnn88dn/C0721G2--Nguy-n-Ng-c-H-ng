package com.codegym.demo_c0721g2_spring_boot.repository;

import com.codegym.demo_c0721g2_spring_boot.bean.AppUser;
import com.codegym.demo_c0721g2_spring_boot.bean.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    List<UserRole> findByAppUser(AppUser appUser);

    //Nếu sử dụng  manytomany thì cần phải thay dổi repository này thành ROLE và
    //sử dụng @Query để có thể lấu list<Role> dựa vào AppUser (người đang đăng nhập)
}
