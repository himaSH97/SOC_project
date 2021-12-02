package com.mash.project_mark_2.services;

import com.mash.project_mark_2.models.Reservation;
import com.mash.project_mark_2.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRepository reservationRepository;

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
    public Reservation getReservationByName(String name)  {
        Reservation reservation = reservationRepository.findByName(name);
        return reservation;
    }
}
