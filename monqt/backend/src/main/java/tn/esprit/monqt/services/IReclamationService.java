package tn.esprit.monqt.services;

import tn.esprit.monqt.Entities.Reclamation;
import tn.esprit.monqt.Entities.Reponse;

import java.util.List;


public interface IReclamationService {

    Reclamation addReclamation(Reclamation reclamation);

    List<Reclamation> getAllReclamations();

    public Reclamation updateReclamation(Reclamation rec);

    public  void supprimerReclamation(Long id);

    public Reclamation getrecById(Long idrec);



}
