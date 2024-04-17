package tn.esprit.picloud.Controller;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.picloud.Entity.Projet;
import tn.esprit.picloud.Service.ProjetService;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/projet")
@CrossOrigin("*")



public class ControllerProjet {
ProjetService   projetService;
    @PostMapping("/addprojet")
 public Projet addprojet(@RequestBody Projet p ){return projetService.addprojet(p);}
 @PutMapping("/update/{Projet_id}")
 public Projet updateprojet(@PathVariable("Projet_id") Long id,@RequestBody Projet p){
        Projet existingprojet = projetService.getbyid(id);
        Projet updateprojet=null;
        if(existingprojet!=null){
            existingprojet.setNom(p.getNom());
            existingprojet.setNombre(p.getNombre());
            existingprojet.setSpecialite(p.getSpecialite());
            existingprojet.setDescription(p.getDescription());
        updateprojet=projetService.update(p);}

    return updateprojet;
    }
 @GetMapping("/getall")
 public List<Projet> getall(){return projetService.getallprojet();}
    @GetMapping("/getProjet/{idProjet}")
    public Projet getbyId(@PathVariable("idProjet") long idprojet){return projetService.getbyid(idprojet);}
    @DeleteMapping("/delete/{idProjet}")
    public void deletePiste(@PathVariable("idProjet") long numP)
    {projetService.delete(numP);}

}
