package tn.esprit.pidevcloud.services;

import tn.esprit.pidevcloud.entities.Bloc;
import tn.esprit.pidevcloud.entities.Salle;

import java.util.List;

public interface SalleCrud {
    public List<Salle> afficherSalle();
    public Salle afficherSalleById(Long idSalle);
    public Salle ajouterSalle(Salle s);
    public void supprimerSalle(Long idSalle);
    public Salle modifierSalle(Salle s);

    public void affecterSalleAuBloc(long idSalle, long idBloc);
}
