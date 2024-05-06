package tn.esprit.pidevcloud.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "salle")
public class Salle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private long id;

    @Column(name = "nom")
    private String nom;
    @Column(name = "capacite")
    private int capacite;
    @Column(name = "disponibilite")
    private String disponibilite;

    @ManyToOne
    Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="salle")
    private Set<Reservation> Reservations;


}
