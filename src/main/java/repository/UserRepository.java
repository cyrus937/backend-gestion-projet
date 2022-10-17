package repository;

import model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    User findByUsername(String username);

    List<User> findAll();

    List<User> findByPoste(String poste);

    User findById(String id);

}
