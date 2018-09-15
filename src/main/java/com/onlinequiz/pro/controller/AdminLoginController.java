package com.onlinequiz.pro.controller;

import com.onlinequiz.pro.models.Admin;
import com.onlinequiz.pro.repositories.AdminRepository;
import com.onlinequiz.pro.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AdminLoginController {
    @Autowired
    AdminService adminService;
    @RequestMapping(value = "/admin")
    public ModelAndView Admin(){
        return new ModelAndView("adminLogin");
    }

    @RequestMapping(value = "/admins",method = RequestMethod.POST)
    public void validateAdmin(@RequestBody Admin admin)
    {
        adminService.validateAdmin(admin);
    }
}
