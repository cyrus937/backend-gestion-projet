package service;

import model.Projet;
import model.Tache;
import model.User;

import java.util.List;

public interface TacheService {


    Tache saveTache(Tache tache);

    Tache updateTache(Tache tache);

    void deleteTache(Tache tache);

    void deleteTacheById(String id);

    Tache getTache(String id);

    List<Tache> findAll();

    List<Tache> findByDateCreationDesc(String idProjet);

    List<Tache> findByState(String state);

    List<Tache> findByAuteur(User auteur);

    List<Tache> findByAuteurId(String id);

    Tache findByNom(String nom);
}
