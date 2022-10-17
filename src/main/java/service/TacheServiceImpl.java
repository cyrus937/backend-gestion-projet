package service;

import model.Projet;
import model.Tache;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TacheRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TacheServiceImpl implements TacheService {

    @Autowired(required = true)
    TacheRepository tacheRepository;

    @Override
    public Tache saveTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    @Override
    public Tache updateTache(Tache tache) {
        return tacheRepository.save(tache);
    }

    @Override
    public void deleteTache(Tache tache) {
        tacheRepository.delete(tache);
    }

    @Override
    public void deleteTacheById(String id) {
        Tache t = tacheRepository.findById(id);
        tacheRepository.delete(t);
    }

    @Override
    public Tache getTache(String id) {
        return tacheRepository.findById(id);
    }

    @Override
    public List<Tache> findAll() {
        return tacheRepository.findAll();
    }

    @Override
    public List<Tache> findByDateCreationDesc(String idProjet) {
        return tacheRepository.findByProjetId(idProjet).stream()
                .sorted(Comparator.comparing(Tache::getDateCreation).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Tache> findByState(String state) {
        return tacheRepository.findByState(state);
    }

    @Override
    public List<Tache> findByAuteur(User auteur) {
        return tacheRepository.findByAuteur(auteur);
    }

    @Override
    public List<Tache> findByAuteurId(String id) {
        return tacheRepository.findByAuteurId(id);
    }

    @Override
    public Tache findByNom(String nom) {
        return tacheRepository.findByNom(nom);
    }
}
