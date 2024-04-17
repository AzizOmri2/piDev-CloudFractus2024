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
public class Bloc implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String titre;

    private String statut;


    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc")
    private Set<Salle> salles;

}
