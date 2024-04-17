package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Bloc;
import com.example.pidevcloud.entities.RendezVous;

import java.util.List;

public interface RendezVousCrud  {
    public List<RendezVous> afficherRendezVous();
    public RendezVous afficherRendezVousById(Long idRdv);
    public RendezVous ajouterBloc(RendezVous r);
    public void supprimerRendezVous(Long idRdv);
    public RendezVous modifierRendezVous(RendezVous r);
}
