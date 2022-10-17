package repository;

import model.Projet;
import model.Tache;
import model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TacheRepository extends MongoRepository<Tache, Integer> {

    Tache findById(String id);

    List<Tache> findAll();

    List<Tache> findByState(String state);

    List<Tache> findByAuteur(User auteur);

    List<Tache> findByAuteurId(String id);

    List<Tache> findByProjetId(String id);

    Tache findByNom(String nom);

}
