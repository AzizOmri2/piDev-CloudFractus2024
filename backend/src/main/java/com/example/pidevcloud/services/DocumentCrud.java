package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Document;
import com.example.pidevcloud.entities.RendezVous;

import java.util.List;

public interface DocumentCrud {
    public List<Document> afficherDocument();
    public Document afficherDocumentById(Long idDoc);
    public Document ajouterDocument(Document d);
    public void supprimerDocument(Long idDoc);
    public Document modifierDocument(Document d);
}
