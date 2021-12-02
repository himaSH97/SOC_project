package com.mash.project_mark_2.repositories;


import com.mash.project_mark_2.models.Product;
import com.mash.project_mark_2.models.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation,String> {
    Reservation findByName(String name);
    Reservation deleteByName(String name);
}
