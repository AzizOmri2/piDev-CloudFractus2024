package tn.esprit.monqt.services;

import tn.esprit.monqt.Entities.Reponse;

import java.util.List;


public interface IReponseService {

    public Reponse addreponse(Reponse reponse, Long idRec);

    public Reponse updateReponse(Reponse rep);

    public void deleteReponse(Long idRep);

    public List<Reponse> viewReponse();

    public Reponse getById(Long idRep);




}
