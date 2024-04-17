package tn.esprit.picloud.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprojet;
    private String nom;
    private String description;
    private int nombre;
    private String specialite;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "projet")
    private Set<Collaboration> collaborations;

}
