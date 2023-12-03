package com.example.threelayerjpa.controller;

import com.example.threelayerjpa.model.Admin;
import com.example.threelayerjpa.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private AdminService adminService;
    @GetMapping("/")
    public List<Admin> index() {
        List<Admin> admin = adminService.finAdmin();
        return admin;
    }
}
