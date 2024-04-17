package tn.esprit.pidevcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.pidevcloud.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
