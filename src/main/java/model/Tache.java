package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "Tache")
public class Tache {

    @Id
    private String id;
    private String nom;
    private String description;
    private Date delai;
    private User auteur;
    private List<User> realisateur;
    private String state;
    private Projet projet;
    private Date dateCreation;

    public Tache(){super();}

    public Tache(String nom, String description, String delai, User auteur, List<User> realisateur, String state, Projet projet) throws ParseException {
        this.nom = nom;
        this.description = description;
        this.delai = new SimpleDateFormat("yyyy-MM-dd").parse(delai);
        this.auteur = auteur;
        this.realisateur = realisateur;
        this.state = state;
        this.projet = projet;
        this.dateCreation = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDelai() {
        return delai;
    }

    public void setDelai(Date delai) {
        this.delai = delai;
    }

    public User getAuteur() {
        return auteur;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setAuteur(User auteur) {
        this.auteur = auteur;
    }

    public List<User> getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(List<User> realisateur) {
        this.realisateur = realisateur;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    @Override
    public String toString() {
        return "Tache{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", delai=" + delai +
                ", auteur=" + auteur +
                ", realisateur=" + realisateur +
                ", state='" + state + '\'' +
                ", projet=" + projet +
                '}';
    }
}
