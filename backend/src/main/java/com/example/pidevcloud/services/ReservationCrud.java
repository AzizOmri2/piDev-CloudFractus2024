package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Bloc;
import com.example.pidevcloud.entities.Reservation;

import java.util.List;

public interface ReservationCrud {
    public List<Reservation> afficherReservation();
    public Reservation afficherReservationById(Long idRes);
    public Reservation ajouterReservation(Reservation r);
    public void supprimerReservation(Long idRes);
    public Reservation modifierReservation(Reservation r);
}