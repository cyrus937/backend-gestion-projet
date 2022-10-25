package service;

import model.Projet;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProjetRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjetServiceImpl implements ProjetService {

    @Autowired(required = true)
    ProjetRepository projetRepository;

    @Override
    public Projet saveProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public Projet updateProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public void deleteProjet(Projet p) {
        projetRepository.delete(p);
    }

    @Override
    public void deleteProjetById(String id) {
        Projet p = projetRepository.findById(id);
        projetRepository.delete(p);
    }

    @Override
    public Projet getProduit(String id) {
        return projetRepository.findById(id);
    }

    @Override
    public List<Projet> findAll() {
        return projetRepository.findAll();
    }

    @Override
    public List<Projet> findByDateCreationDesc() {
        System.out.println("Bonjour");
        return projetRepository.findAll().stream()
                .sorted(Comparator.comparing(Projet::getDateCreation).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<Projet> findByState(String state) {
        return projetRepository.findByState(state);
    }

    @Override
    public List<Projet> findByAuteur(User auteur) {
        return projetRepository.findByAuteur(auteur);
    }

    @Override
    public List<Projet> findByAuteurId(String id) {
        return projetRepository.findByAuteurId(id);
    }

    @Override
    public Projet findByNom(String nom) {
        return projetRepository.findByNom(nom);
    }
}
