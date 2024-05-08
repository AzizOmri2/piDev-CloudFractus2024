package tn.esprit.monqt.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Reclamation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_reclamation;


    private String mail;

    private String proprietaire;

    private String objet;

    private String contenu;

    @Enumerated(EnumType.STRING)
    private Titre_Reclamation titre;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="reclamation")
    private Set<Reponse> Reponses;


}
