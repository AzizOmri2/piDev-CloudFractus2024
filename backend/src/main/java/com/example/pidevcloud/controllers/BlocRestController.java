package com.example.pidevcloud.controllers;

import com.example.pidevcloud.entities.Bloc;
import com.example.pidevcloud.services.ServiceBloc;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocRestController {
    ServiceBloc serviceBloc ;


    @GetMapping("/all")
    public List<Bloc> getBloc(){
        List<Bloc>  listBloc = serviceBloc.afficherBloc();
        return listBloc;

    }
    @GetMapping("/show/{id}")
    public Bloc showBloc(@PathVariable("id") Long blocId ){

        Bloc bloc = serviceBloc.afficherBlocById(blocId);
        return bloc ;

    }
    @PostMapping("/ajout")
    public Bloc addBloc (@RequestBody Bloc b){
        Bloc bloc = serviceBloc.ajouterBloc(b);
        return bloc ;
    }
    @DeleteMapping ("/delete/{id}")
    public void deleteBloc (@PathVariable("id") Long blocId){
        serviceBloc.supprimerBloc(blocId);
    }


    @PutMapping("/update")
    public Bloc updateBloc (@RequestBody Bloc b){
        Bloc bloc = serviceBloc.modifierBloc(b);
        return bloc;
    }


}
