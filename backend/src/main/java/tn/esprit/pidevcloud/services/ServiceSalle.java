package tn.esprit.pidevcloud.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.pidevcloud.entities.Bloc;
import tn.esprit.pidevcloud.entities.Salle;
import tn.esprit.pidevcloud.repository.BlocRepository;
import tn.esprit.pidevcloud.repository.SalleRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class ServiceSalle implements SalleCrud{

    SalleRepository sr;
    BlocRepository br;

    @Override
    public List<Salle> afficherSalle() {
        return sr.findAll();
    }

    @Override
    public Salle afficherSalleById(Long idSalle) {
        return sr.findById(idSalle).get();
    }

    @Override
    public Salle ajouterSalle(Salle s) {
        return sr.save(s);
    }

    @Override
    public void supprimerSalle(Long idSalle) {
        sr.deleteById(idSalle);
    }

    @Override
    public Salle modifierSalle(Salle s) {
        return sr.save(s);
    }

    @Override
    public void affecterSalleAuBloc(long idSalle, long idBloc) {
        Salle salle = sr.findById(idSalle).get();
        Bloc bloc = br.findById(idBloc).get();
        salle.setBloc(bloc);
        sr.save(salle);
    }
}
