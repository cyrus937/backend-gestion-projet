package service;

import model.Projet;
import model.User;

import java.util.List;

public interface ProjetService {

    Projet saveProjet(Projet p);

    Projet updateProjet(Projet p);

    void deleteProjet(Projet p);

    void deleteProjetById(String id);

    Projet getProduit(String id);

    List<Projet> findAll();

    List<Projet> findByDateCreationDesc();

    List<Projet> findByState(String state);

    List<Projet> findByAuteur(User auteur);

    List<Projet> findByAuteurId(String id);

    Projet findByNom(String nom);
}
