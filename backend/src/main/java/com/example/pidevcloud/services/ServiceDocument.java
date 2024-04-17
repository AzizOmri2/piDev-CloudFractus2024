package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Document;
import com.example.pidevcloud.repository.DocumentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceDocument  implements DocumentCrud{
    DocumentRepository dr ;
    @Override
    public List<Document> afficherDocument() {
        return dr.findAll() ;
    }

    @Override
    public Document afficherDocumentById(Long idDoc) {
        return dr.findById(idDoc).get();
    }

    @Override
    public Document ajouterDocument(Document d) {
        return dr.save(d);
    }

    @Override
    public void supprimerDocument(Long idDoc) {
        dr.deleteById(idDoc);

    }

    @Override
    public Document modifierDocument(Document d) {
        return dr.save(d);
    }
}
