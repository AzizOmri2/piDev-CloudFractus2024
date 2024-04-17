package tn.esprit.pidevcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidevcloud.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
