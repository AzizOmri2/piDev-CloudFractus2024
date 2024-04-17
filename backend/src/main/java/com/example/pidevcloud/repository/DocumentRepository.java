package com.example.pidevcloud.repository;

import com.example.pidevcloud.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document,Long> {
}
