package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Reservation;
import com.example.pidevcloud.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceReservation implements ReservationCrud{
    ReservationRepository rr ;
    @Override
    public List<Reservation> afficherReservation() {
        return rr.findAll();
    }

    @Override
    public Reservation afficherReservationById(Long idRes) {
        return rr.findById(idRes).get();
    }

    @Override
    public Reservation ajouterReservation(Reservation r) {
        return rr.save(r);
    }

    @Override
    public void supprimerReservation(Long idRes) {
        rr.deleteById(idRes);

    }

    @Override
    public Reservation modifierReservation(Reservation r) {
        return rr.save(r);
    }
}
