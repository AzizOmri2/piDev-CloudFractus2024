package tn.esprit.monqt.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.monqt.Entities.Reclamation;
import tn.esprit.monqt.Entities.Reponse;
import tn.esprit.monqt.repository.ReclamationRepository;
import tn.esprit.monqt.repository.ReponseRepository;
import java.util.List;


@Service
@AllArgsConstructor
public class ReponseServiceImpl implements IReponseService {

    @Autowired
    ReclamationRepository reclamationRepository;
    @Autowired
    ReponseRepository reponseRepository;

    @Override
    public Reponse addreponse(Reponse reponse, Long idRec) {
        Reclamation rec = reclamationRepository.findById(idRec).get();
        reponse.setReclamation(rec);
        return reponseRepository.save(reponse);
    }

    @Override
    public Reponse updateReponse(Reponse rep) {
        return reponseRepository.save(rep);
    }

    @Override
    public void deleteReponse(Long idRep) {
        reponseRepository.deleteById(idRep);
    }

    @Override
    public List<Reponse> viewReponse() {
        return reponseRepository.findAll();
    }

    @Override
    public Reponse getById(Long idRep) {
        return reponseRepository.findById(idRep).get();
    }


}
