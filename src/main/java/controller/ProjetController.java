package controller;

import model.Projet;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.ProjetService;

import java.util.List;

@RestController
@RequestMapping("/projet")
@CrossOrigin
public class ProjetController {

    @Autowired
    ProjetService projetService;

    @RequestMapping(method = RequestMethod.POST)
    public Projet createProjet(@RequestBody Projet projet){
        return projetService.saveProjet(projet);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteProjet(@RequestBody Projet projet){
        projetService.deleteProjet(projet);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteProjetById(@PathVariable("id") String id){
        projetService.deleteProjetById(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    public Projet updateProjet(@PathVariable("id") String id, @RequestBody Projet projet){
        return projetService.updateProjet(projet);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Projet> getAllProjet(){
        return projetService.findByDateCreationDesc();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Projet getProjet(@PathVariable("id") String id) {
        return projetService.getProduit(id);
    }

    @RequestMapping(value="/{state}", method = RequestMethod.GET)
    public List<Projet> findByState(@PathVariable("state") String state) {
        return projetService.findByState(state);
    }

    @RequestMapping(path="/auteur", method = RequestMethod.GET)
    public List<Projet> findByAuteur(User auteur) {
        return projetService.findByAuteur(auteur);
    }

    @RequestMapping(value="/auteur/{id}", method = RequestMethod.GET)
    public List<Projet> findByAuteurId(@PathVariable("id") String id) {
        return projetService.findByAuteurId(id);
    }

    @RequestMapping(value="/{nom}", method = RequestMethod.GET)
    public Projet findByNom(@PathVariable("nom") String nom) {
        return projetService.findByNom(nom);
    }
}
