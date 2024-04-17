package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Salle;
import com.example.pidevcloud.repository.SalleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceSalle implements SalleCrud {
    SalleRepository sr ;
    @Override
    public List<Salle> afficherSalle() {
        return sr.findAll();
    }

    @Override
    public Salle afficherSalleById(Long idSalle) {
        return sr.findById(idSalle).get();
    }

    @Override
    public Salle ajouterBloc(Salle s) {
        return sr.save(s);
    }

    @Override
    public void supprimerSalle(Long idSalle) {
        sr.deleteById(idSalle);

    }

    @Override
    public Salle modifierBloc(Salle s) {
        return sr.save(s);
    }
}
