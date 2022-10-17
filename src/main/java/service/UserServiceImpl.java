package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = true)
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> getAllSimpleUsers() {
        return (List<User>) userRepository.findAll().stream()
                .filter(user -> user.isAdmin() == false)
                .sorted(Comparator.comparing(User::getDateCreation).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<User> getAllAdmin() {
        return (List<User>) userRepository.findAll().stream().
                filter(user -> user.isAdmin() == true)
                .sorted(Comparator.comparing(User::getDateCreation).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public List<User> findByPoste(String poste) {
        return userRepository.findByPoste(poste);
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
