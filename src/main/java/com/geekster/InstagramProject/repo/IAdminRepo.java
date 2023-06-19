package com.geekster.InstagramProject.repo;

import com.geekster.InstagramProject.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin, Long> {
    Admin findFirstByEmail(String email);
}
