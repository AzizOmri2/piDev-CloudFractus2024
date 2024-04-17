package com.example.pidevcloud.services;

import com.example.pidevcloud.entities.Bloc;

import java.util.List;

public interface BlocCrud {
    public List<Bloc> afficherBloc();
    public Bloc afficherBlocById(Long idBloc);
    public Bloc ajouterBloc(Bloc b);
    public void supprimerBloc(Long idBloc);
    public Bloc modifierBloc(Bloc b);
}
