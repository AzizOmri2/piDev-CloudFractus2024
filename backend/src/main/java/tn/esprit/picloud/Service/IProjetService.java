package tn.esprit.picloud.Service;

import tn.esprit.picloud.Entity.Projet;

import java.util.List;

public interface IProjetService {
    public Projet addprojet(Projet p);
    public Projet update(Projet p);
    public List<Projet> getallprojet();
    public Projet getbyid( long idprojet);
    void delete(long idprojet);
}
