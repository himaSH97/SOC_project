package com.mash.project_mark_2.controllers;

import com.mash.project_mark_2.models.Payment;
import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.repositories.PaymentRepository;
import com.mash.project_mark_2.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PaymentController {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/save_pay")
    public String saveStudent(@ModelAttribute("payment") Payment payment) {
        paymentRepository.save(payment);
        return "redirect:/";
    }
    @GetMapping("/pay/{id}")
    public String UpdatePage(@PathVariable("id") String id, Model model){
        Payment payment = paymentService.getPaymentByCardNo(id);
        model.addAttribute("payment",payment);
        return "pay";
    }
}
