package tn.esprit.pidevcloud.controllers;


import lombok.AllArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidevcloud.entities.Reservation;
import tn.esprit.pidevcloud.repository.ReservationRepository;
import tn.esprit.pidevcloud.services.ServiceReservation;

import java.io.IOException;
import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
@CrossOrigin("*")
public class ReservationRestController {
    ServiceReservation serviceReservation;
    ReservationRepository rr;

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
    public Reservation addReservation(@RequestBody Reservation r,@PathVariable("idSalle") Long idSalle) throws IOException {
        serviceReservation.generateQRCode(idSalle);
        Reservation res = serviceReservation.ajouterReservation(r,idSalle);
        return res;
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

    @GetMapping("/download/{idSalle}")
    public ResponseEntity<InputStreamResource> downloadQrCode(@PathVariable("idSalle") Long idSalle) throws IOException {
        return serviceReservation.downloadQrCode(idSalle);
    }

}
