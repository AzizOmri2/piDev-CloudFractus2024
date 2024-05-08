package tn.esprit.monqt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.monqt.Entities.Reponse;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse, Long> {

}
