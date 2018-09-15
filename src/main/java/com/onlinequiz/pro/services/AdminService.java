package com.onlinequiz.pro.services;

import com.onlinequiz.pro.models.Admin;
import com.onlinequiz.pro.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository adminRepository;


    public Admin validateAdmin(Admin admin){

        return adminRepository.getAdminLoginDetails(admin);
    }
}
