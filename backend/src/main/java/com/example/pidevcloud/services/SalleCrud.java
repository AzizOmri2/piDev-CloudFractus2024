package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Bloc;
import com.example.pidevcloud.entities.Salle;

import java.util.List;

public interface SalleCrud {
    public List<Salle> afficherSalle();
    public Salle afficherSalleById(Long idSalle);
    public Salle ajouterBloc(Salle s);
    public void supprimerSalle(Long idSalle);
    public Salle modifierBloc(Salle s);
}
