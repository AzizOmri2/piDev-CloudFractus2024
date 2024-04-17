package com.example.pidevcloud.repository;

import com.example.pidevcloud.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository <Reservation,Long> {
}
