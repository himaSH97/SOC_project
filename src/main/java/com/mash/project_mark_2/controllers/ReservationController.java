package com.mash.project_mark_2.controllers;

import com.mash.project_mark_2.models.Reservation;
import com.mash.project_mark_2.models.User;
import com.mash.project_mark_2.repositories.ReservationRepository;
import com.mash.project_mark_2.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {
    @Autowired
    private ReservationRepository reservationRepository;
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/new_reservation")
    public String addReservation(Model model) {
        model.addAttribute("res", new Reservation());  // passing the model to new html page.
        return "reservation"; //return index page name should be matched.
    }


    @PostMapping("/save_reservation")
         String saveReservation(@ModelAttribute("reservation") Reservation reservation)
        {
            reservationRepository.save(reservation);

            return "thank";

       }

    @GetMapping("/delete_reservation/{id}")
    public String deleteReservation(@PathVariable("id") String id) {
        reservationRepository.deleteByName(id);
        return "redirect:/admin";
    }

}
