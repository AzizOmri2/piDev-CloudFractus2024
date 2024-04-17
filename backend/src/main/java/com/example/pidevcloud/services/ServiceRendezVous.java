package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.RendezVous;
import com.example.pidevcloud.repository.RendezVousRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ServiceRendezVous implements RendezVousCrud{

    RendezVousRepository rvr;
    @Override
    public List<RendezVous> afficherRendezVous() {
        return rvr.findAll() ;
    }

    @Override
    public RendezVous afficherRendezVousById(Long idRdv) {
        return rvr.findById(idRdv).get();
    }

    @Override
    public RendezVous ajouterBloc(RendezVous r) {
        return rvr.save(r);
    }

    @Override
    public void supprimerRendezVous(Long idRdv) {
        rvr.deleteById(idRdv);

    }

    @Override
    public RendezVous modifierRendezVous(RendezVous r) {
        return rvr.save(r);
    }
}
