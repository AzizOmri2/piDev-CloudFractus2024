package tn.esprit.pidevcloud.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.pidevcloud.entities.Bloc;
import tn.esprit.pidevcloud.services.ServiceBloc;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
@CrossOrigin("*")
public class BlocRestController {
    ServiceBloc serviceBloc;

    @GetMapping("/all")
    public List<Bloc> getBloc(){
        List<Bloc> listBloc = serviceBloc.afficherBloc();
        return listBloc;
    }

    @GetMapping("/show/{id}")
    public Bloc showBloc(@PathVariable("id") Long blocId){
        Bloc bloc = serviceBloc.afficherBlocById(blocId);
        return bloc;
    }

    @PostMapping("/add")
    public Bloc addBloc(@RequestBody Bloc b){
        Bloc bloc = serviceBloc.ajouterBloc(b);
        return bloc;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBloc(@PathVariable("id") Long blocId){
        serviceBloc.supprimerBloc(blocId);
    }


    @PutMapping("/update/{id}")
    public Bloc updateBloc(@PathVariable Long id, @RequestBody Bloc b){
        Bloc existingBloc = serviceBloc.afficherBlocById(id);
        Bloc updatedBloc = null;

        if(existingBloc != null){
            existingBloc.setStatut(b.getStatut());
            existingBloc.setTitre(b.getTitre());
            updatedBloc = serviceBloc.modifierBloc(b);
        }
        return updatedBloc;
    }

}
