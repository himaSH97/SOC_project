package com.mash.project_mark_2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@Service
public class EmailService {
    @Autowired
    JavaMailSender javaMailSender;


    public String sendEmail(String  mail) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("himash946@gmail.com");
        message.setTo(mail);
        message.setSubject("Test Subject");
        message.setText("Test Body");

        javaMailSender.send(message);

        return "Mail sent successfully";
    }

    public String sendBillEmail(String  mail,String price,String name) {
        SimpleMailMessage massage = new SimpleMailMessage();

        massage.setFrom("himash946@gmail.com");
        massage.setTo(mail);
        massage.setSubject("Order Details");
        massage.setText("You Have Ordered:  "+name+"\nYour Order Price Rs. "+ price);

        javaMailSender.send(massage);

        return "Mail sent successfully";
    }
}
