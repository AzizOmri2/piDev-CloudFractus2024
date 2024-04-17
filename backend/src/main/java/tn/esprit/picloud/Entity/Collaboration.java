package tn.esprit.picloud.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Collaboration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcollab;
    @ManyToOne
    Projet projet;

}
