package repository;

import model.Projet;
import model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends MongoRepository<Projet, Integer> {

    Projet findById(String id);

    List<Projet> findAll();

    List<Projet> findByState(String state);

    List<Projet> findByAuteur(User auteur);

    List<Projet> findByAuteurId(String id);

    Projet findByNom(String nom);
}
