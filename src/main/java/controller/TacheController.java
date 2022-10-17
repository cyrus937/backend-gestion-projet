package controller;

import model.Projet;
import model.Tache;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TacheService;

import java.util.List;

@RestController
@RequestMapping("/tache")
@CrossOrigin
public class TacheController {

    @Autowired
    TacheService tacheService;

    @RequestMapping(method = RequestMethod.POST)
    public Tache createTache(@RequestBody Tache tache){
        return tacheService.saveTache(tache);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteTache(@RequestBody Tache tache){
        tacheService.deleteTache(tache);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteTacheById(@PathVariable("id") String id){
        tacheService.deleteTacheById(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.POST)
    public Tache updateTache(@PathVariable("id") String id, @RequestBody Tache tache){
        return tacheService.updateTache(tache);
    }

    @RequestMapping(value="/projet/{id}", method = RequestMethod.GET)
    public List<Tache> getAllTache(@PathVariable("id") String id){
        return tacheService.findByDateCreationDesc(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Tache getTache(@PathVariable("id") String id) {
        return tacheService.getTache(id);
    }

    @RequestMapping(value="/{state}", method = RequestMethod.GET)
    public List<Tache> findByState(@PathVariable("state") String state) {
        return tacheService.findByState(state);
    }

    @RequestMapping(path="/auteur", method = RequestMethod.GET)
    public List<Tache> findByAuteur(User auteur) {
        return tacheService.findByAuteur(auteur);
    }

    @RequestMapping(value="/auteur/{id}", method = RequestMethod.GET)
    public List<Tache> findByAuteurId(@PathVariable("id") String id) {
        return tacheService.findByAuteurId(id);
    }

    @RequestMapping(value="/{nom}", method = RequestMethod.GET)
    public Tache findByNom(@PathVariable("nom") String nom) {
        return tacheService.findByNom(nom);
    }
}
