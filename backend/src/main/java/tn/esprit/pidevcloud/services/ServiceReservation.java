package tn.esprit.pidevcloud.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidevcloud.entities.Reservation;
import tn.esprit.pidevcloud.entities.Salle;
import tn.esprit.pidevcloud.repository.ReservationRepository;
import tn.esprit.pidevcloud.repository.SalleRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
public class ServiceReservation implements ReservationCrud{

    ReservationRepository rr;
    SalleRepository sr;

    @Override
    public List<Reservation> afficherReservation() {
        return rr.findAll();
    }

    @Override
    public Reservation afficherReservationById(Long idRes) {
        return rr.findById(idRes).get();
    }

    @Override
    public Reservation ajouterReservation(Reservation r, Long idSalle) {
        Set<Salle> salleSet = new HashSet<>();
        Salle s = sr.findById(idSalle).get();
        if(r.getSalles() == null){
            salleSet.add(s);
            r.setSalles(salleSet);
        }else{
            r.getSalles().add(s);
        }
        s.setDisponibilite("Réservée");
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
