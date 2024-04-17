package com.example.pidevcloud.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Salle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSalle;

    private String nom ;
    private int capacite ;
    private String disponibilite;
    @ManyToOne
    Bloc bloc ;
    @ManyToMany(mappedBy = "salles",cascade = CascadeType.ALL)
    private Set<Reservation> reservations;
}
