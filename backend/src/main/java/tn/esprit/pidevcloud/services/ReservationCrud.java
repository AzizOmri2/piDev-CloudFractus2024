package tn.esprit.pidevcloud.services;

import tn.esprit.pidevcloud.entities.Reservation;

import java.util.List;

public interface ReservationCrud {
    public List<Reservation> afficherReservation();
    public Reservation afficherReservationById(Long idRes);
    public Reservation ajouterReservation(Reservation r, Long idSalle);
    public void supprimerReservation(Long idRes);
    public Reservation modifierReservation(Reservation r);
}
