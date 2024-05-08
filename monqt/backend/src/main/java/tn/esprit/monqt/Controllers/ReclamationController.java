package tn.esprit.monqt.Controllers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import org.springframework.web.bind.annotation.*;
import tn.esprit.monqt.Entities.Reclamation;
import tn.esprit.monqt.Entities.Reponse;
import tn.esprit.monqt.services.IReclamationService;
import tn.esprit.monqt.services.ReclamationServiceImpl;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/reclamation")
@CrossOrigin("*")
public class ReclamationController {

    private ReclamationServiceImpl reclamationService;


    @PostMapping("/add")
    public Reclamation addReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.addReclamation(reclamation);
    }


    @GetMapping("/all")
    public List<Reclamation> getAllReclamations() {
        return reclamationService.getAllReclamations();
    }

    @PutMapping("/update")
    public Reclamation updateReclamation(@RequestBody Reclamation reclamation) {
        return reclamationService.updateReclamation(reclamation);
    }


    @DeleteMapping("/delete/{idRec}")
    public void deleteReclamation(@PathVariable("idRec") Long idRec) {
        reclamationService.supprimerReclamation(idRec);
    }

    @GetMapping("/show/{idrec}")
    public Reclamation getrecById(@PathVariable("idrec") Long idrec) {
        return reclamationService.getrecById(idrec);
    }
    }
