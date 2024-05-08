package tn.esprit.monqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.monqt.Entities.Reclamation;
import java.util.List;

@Repository
public interface ReclamationRepository extends JpaRepository<Reclamation, Long> {
   public List<Reclamation> findByTitre(String titre);
}