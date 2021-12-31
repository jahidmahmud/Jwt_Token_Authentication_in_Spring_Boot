package com.jwt.main.dao;

import com.jwt.main.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,String> {
}
