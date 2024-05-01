package tn.esprit.pidevcloud.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidevcloud.entities.Reservation;
import tn.esprit.pidevcloud.services.ServiceReservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
@CrossOrigin("*")
public class ReservationRestController {
    ServiceReservation serviceReservation;

    @GetMapping("/all")
    public List<Reservation> getReservation(){
        List<Reservation> listReservation = serviceReservation.afficherReservation();
        return listReservation;
    }

    @GetMapping("/show/{id}")
    public Reservation showReservation(@PathVariable("id") Long reservationId){
        Reservation reservation = serviceReservation.afficherReservationById(reservationId);
        return reservation;
    }

    @PostMapping("/add/{idSalle}")
    public Reservation addReservation(@RequestBody Reservation r,@PathVariable("idSalle") Long idSalle){
        return serviceReservation.ajouterReservation(r,idSalle);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteReservation(@PathVariable("id") Long reservationId){
        serviceReservation.supprimerReservation(reservationId);
    }

    @PutMapping("/update")
    public Reservation updateReservation(@RequestBody Reservation r){
        Reservation reservation = serviceReservation.modifierReservation(r);
        return reservation;
    }
}
