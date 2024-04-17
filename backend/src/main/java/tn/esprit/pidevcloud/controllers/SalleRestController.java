package tn.esprit.pidevcloud.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidevcloud.entities.Salle;
import tn.esprit.pidevcloud.services.ServiceSalle;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/salle")
@CrossOrigin("*")
public class SalleRestController {
    ServiceSalle serviceSalle;

    @GetMapping("/all")
    public List<Salle> getSalle(){
        List<Salle> listSalle = serviceSalle.afficherSalle();
        return listSalle;
    }

    @GetMapping("/show/{id}")
    public Salle showSalle(@PathVariable("id") Long salleId){
        Salle salle = serviceSalle.afficherSalleById(salleId);
        return salle;
    }

    @PostMapping("/add")
    public Salle addSalle(@RequestBody Salle s){
        Salle salle = serviceSalle.ajouterSalle(s);
        return salle;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSalle(@PathVariable("id") Long salleId){
        serviceSalle.supprimerSalle(salleId);
    }

    @PutMapping("/update/{id}")
    public Salle updateSalle(@PathVariable Long id,@RequestBody Salle s){
        Salle existingSalle = serviceSalle.afficherSalleById(id);
        Salle updatedSalle = null;

        if(existingSalle != null){
            existingSalle.setNom(s.getNom());
            existingSalle.setCapacite(s.getCapacite());
            existingSalle.setDisponibilite(s.getDisponibilite());
            updatedSalle = serviceSalle.modifierSalle(s);
        }
        return updatedSalle;
    }

    @PutMapping("/affecterSalleBloc/{idSalle}/{idBloc}")
    public void affecterSalleBloc(@PathVariable("idSalle") long idS,@PathVariable("idBloc") long idB){
        serviceSalle.affecterSalleAuBloc(idS,idB);
    }

}
