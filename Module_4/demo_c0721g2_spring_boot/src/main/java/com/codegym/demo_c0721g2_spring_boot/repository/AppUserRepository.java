package com.codegym.demo_c0721g2_spring_boot.repository;

import com.codegym.demo_c0721g2_spring_boot.bean.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    AppUser findByUserName(String username);
}
