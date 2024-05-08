package tn.esprit.monqt.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.monqt.Entities.Reclamation;
import tn.esprit.monqt.Entities.Reponse;
import tn.esprit.monqt.repository.ReclamationRepository;

import java.util.Arrays;
import java.util.List;

@Service
public class ReclamationServiceImpl implements IReclamationService {

    @Autowired
    private ReclamationRepository reclamationRepository;

    @Override
    public Reclamation addReclamation(Reclamation reclamation) {
        if (contientMotsInterdits(reclamation.getContenu())) {
            throw new RuntimeException("Vous avez utilisé un gros mot !");
        }
        // Logique pour ajouter la réclamation
        return reclamationRepository.save(reclamation);
    }

    private boolean contientMotsInterdits(String contenu) {
        // Liste de mots interdits
        List<String> motsInterdits = Arrays.asList("nique", "ntm", "fuck", "faggot", "merde", "salope", "pute", "race");
        // Vérifier si le contenu contient des mots interdits
        for (String mot : motsInterdits) {
            if (contenu.toLowerCase().contains(mot)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Reclamation> getAllReclamations() {
        return reclamationRepository.findAll();
    }

    @Override
    public Reclamation updateReclamation(Reclamation rec) {
        return reclamationRepository.save(rec);
    }


    public void supprimerReclamation(Long id) {
        reclamationRepository.deleteById(id);
    }

    @Override
    public Reclamation getrecById(Long idrec) {
        return reclamationRepository.findById(idrec).get();
    }

}
