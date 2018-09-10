package com.onlinequiz.pro.controller;

import com.onlinequiz.pro.models.Register;
import com.onlinequiz.pro.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegisterController {

    @Autowired
    RegisterService registerService;


    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public List<Register> getAccount(Register register){
     return  registerService.getAccount(register);
    }

    @RequestMapping(value = "/register")
    public Register createAccount(@RequestBody Register register){
        return registerService.createAccount(register);
    }

}
