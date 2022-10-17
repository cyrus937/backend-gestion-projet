package service;

import model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    User getUser(String username);
    List<User> getAllSimpleUsers();
    List<User> getAllAdmin();
    List<User> findByPoste(String poste);
    User getUserById(String id);
    List<User> getAllUser();
    /*Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);


    List<Produit> findByNomProduit(String nom);
    List<Produit> findByNomProduitContains(String nom);
    List<Produit> findByNomPrix (String nom, Double prix);
    List<Produit> findByCategorie (Categorie categorie);
    List<Produit> findByCategorieIdCat(Long id);
    List<Produit> findByOrderByNomProduitAsc();
    List<Produit> trierProduitsNomsPrix();*/
}
