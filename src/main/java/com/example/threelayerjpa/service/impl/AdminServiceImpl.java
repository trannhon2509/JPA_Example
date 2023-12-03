package com.example.threelayerjpa.service.impl;

import com.example.threelayerjpa.model.Admin;
import com.example.threelayerjpa.repository.AdminRepository;
import com.example.threelayerjpa.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;


    @Override
    public List<Admin> finAdmin() {
        return adminRepository.findAll();
    }
}
