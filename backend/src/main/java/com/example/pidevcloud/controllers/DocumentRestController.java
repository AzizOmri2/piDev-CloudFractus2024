package com.example.pidevcloud.controllers;

import com.example.pidevcloud.entities.Bloc;
import com.example.pidevcloud.entities.Document;
import com.example.pidevcloud.entities.RendezVous;
import com.example.pidevcloud.services.ServiceDocument;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/document")
@CrossOrigin("*")
public class DocumentRestController {
    ServiceDocument serviceDocument ;

    @GetMapping("/all")
    public List<Document> getdocument(){
        List<Document>  listDocument = serviceDocument.afficherDocument();
        return listDocument;

    }
    @GetMapping("/show/{id}")
    public Document showDocument(@PathVariable("id") Long DocumentId ){

        Document  document = serviceDocument.afficherDocumentById(DocumentId);
        return document ;

    }
    @PostMapping("/ajout")
    public Document addDocument (@RequestBody Document d){
        Document document= serviceDocument.ajouterDocument(d);
        return document ;
    }
    @DeleteMapping ("/delete/{id}")
    public void deleteDocument (@PathVariable("id") Long DocumentId){

        serviceDocument.supprimerDocument(DocumentId);
    }


    @PutMapping("/update/{id}")
    public Document updateDocument (@PathVariable Long id,@RequestBody Document d){
        Document docExisting = serviceDocument.afficherDocumentById(id);
        Document document = null;
        if(docExisting != null){
            docExisting.setTitre(d.getTitre());
            docExisting.setDateCreation(d.getDateCreation());
            docExisting.setDescription(d.getDescription());
            docExisting.setTaille(d.getTaille());
        }
        document = serviceDocument.modifierDocument(d);
        return document;
    }
}

