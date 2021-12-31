package com.jwt.main.service;

import com.jwt.main.dao.RoleDao;
import com.jwt.main.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleDao dao;
    public Role createRole(Role role){
        return dao.save(role);
    }
}
