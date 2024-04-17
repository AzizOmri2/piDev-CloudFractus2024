package com.example.pidevcloud.controllers;

import com.example.pidevcloud.entities.RendezVous;
import com.example.pidevcloud.services.ServiceRendezVous;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/rendezVous")
@CrossOrigin("*")
public class RendezVousRestController {
    ServiceRendezVous serviceRendezVous ;


    @GetMapping("/all")
    public List<RendezVous> getRendezVous(){
        List<RendezVous>  listRendezVous = serviceRendezVous.afficherRendezVous();
        return listRendezVous;

    }
    @GetMapping("/show/{id}")
    public RendezVous showRendezVous(@PathVariable("id") Long RendezVousId ){

        RendezVous rendezVous = serviceRendezVous.afficherRendezVousById(RendezVousId);
        return rendezVous ;

    }
    @PostMapping("/ajout")
    public RendezVous addrendezVous (@RequestBody RendezVous r){
        RendezVous rendezVous = serviceRendezVous.ajouterBloc(r);
        return rendezVous ;
    }
    @DeleteMapping ("/delete/{id}")
    public void deleterendezVous (@PathVariable("id") Long RendezVousId){
        serviceRendezVous.supprimerRendezVous(RendezVousId);
    }


    @PutMapping("/update/{id}")
    public RendezVous updaterendezVous (@PathVariable Long id,@RequestBody RendezVous r ){
        RendezVous rdvExisting = serviceRendezVous.afficherRendezVousById(id);
        RendezVous rendezVous = null;
        if(rdvExisting != null){
            rdvExisting.setDateRdv(r.getDateRdv());
            rdvExisting.setDescription(r.getDescription());
            rdvExisting.setTitre(r.getTitre());
            rdvExisting.setContact(r.getContact());
            rdvExisting.setHeure(r.getHeure());
            rdvExisting.setRemarques(r.getRemarques());
            rdvExisting.setStatus(r.getStatus());
        }
        rendezVous = serviceRendezVous.modifierRendezVous(r);
        return rendezVous;
    }

}
