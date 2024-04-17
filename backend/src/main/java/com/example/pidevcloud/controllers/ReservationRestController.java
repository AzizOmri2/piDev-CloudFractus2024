package com.example.pidevcloud.controllers;


import com.example.pidevcloud.entities.RendezVous;
import com.example.pidevcloud.entities.Reservation;
import com.example.pidevcloud.services.ServiceRendezVous;
import com.example.pidevcloud.services.ServiceReservation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {

    ServiceReservation serviceReservation;


    @GetMapping("/all")
    public List<Reservation> getReservation(){
        List<Reservation>  listReservation = serviceReservation.afficherReservation();
        return listReservation;

    }
    @GetMapping("/show/{id}")
    public Reservation showReservation(@PathVariable("id") Long ReservationId ){

        Reservation reservation = serviceReservation.afficherReservationById(ReservationId);
        return reservation ;

    }
    @PostMapping("/ajout")
    public Reservation addreservation (@RequestBody Reservation rr){
        Reservation reservation = serviceReservation.ajouterReservation(rr);
        return reservation ;
    }
    @DeleteMapping ("/delete/{id}")
    public void deletereservation(@PathVariable("id") Long ReservationId){
        serviceReservation.supprimerReservation(ReservationId);
    }


    @PutMapping("/update")
    public Reservation updatereservation (@RequestBody Reservation rr ){
        Reservation reservation =serviceReservation.modifierReservation(rr);
        return reservation ;
    }

}
