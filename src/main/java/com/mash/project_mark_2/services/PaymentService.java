package com.mash.project_mark_2.services;

import com.mash.project_mark_2.models.Payment;
import com.mash.project_mark_2.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment getPaymentByCardNo(String cardNo){
        Payment payment=paymentRepository.findByCardNo(cardNo);
        return payment;
    }

}
