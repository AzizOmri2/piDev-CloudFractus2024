package tn.esprit.pidevcloud.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Date date;
    private String raison;
    private int nbParticipant;

    @JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Salle> salles;

}
