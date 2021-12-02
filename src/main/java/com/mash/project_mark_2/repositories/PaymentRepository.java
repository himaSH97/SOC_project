package com.mash.project_mark_2.repositories;

import com.mash.project_mark_2.models.Payment;
import com.mash.project_mark_2.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment,String> {
    Payment findByCardNo(String cardNo);
}
