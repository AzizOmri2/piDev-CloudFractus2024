package tn.esprit.picloud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.picloud.Entity.Projet;
@Repository
public interface ProjetRepo extends JpaRepository<Projet,Long> {

}
