package com.mash.project_mark_2.controllers;

import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.services.EmailService;
import com.mash.project_mark_2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class EmailController {
    @Autowired
    EmailService emailService;
    @Autowired
    private UserService userService;

/*
    @GetMapping("/sendEmail")
    public String sendEmail() {
       return emailService.sendEmail();
    } */
    @GetMapping("/sendEmail/{id}")
    public String sendEmail(@PathVariable("id") String id) {
        emailService.sendEmail(id);
        return "thank";
    }
    @GetMapping("/sendBillEmail/{id}/{price}/{name}")
    public String sendBillEmail(@PathVariable("id") String id ,@PathVariable("price") String price,@PathVariable("name") String name) {
        emailService.sendBillEmail(id,price,name);
        return "thank";
    }

}
