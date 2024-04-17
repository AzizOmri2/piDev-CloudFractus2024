package tn.esprit.picloud.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.picloud.Entity.Projet;
import tn.esprit.picloud.Repository.ProjetRepo;

import java.util.List;
@Service
@AllArgsConstructor
public class ProjetService implements IProjetService {
    ProjetRepo projetRepo;


    @Override
    public Projet addprojet(Projet p) {
        return (projetRepo.save(p));
    }

    @Override
    public Projet update(Projet p) {
        return (projetRepo.save(p));
    }

    @Override
    public List<Projet> getallprojet() {
        return projetRepo.findAll();
    }

    @Override
    public Projet getbyid(long idprojet) {
        return projetRepo.findById(idprojet).get();
    }

    @Override
    public void delete(long idprojet) {
    projetRepo.deleteById(idprojet);
    }
}
