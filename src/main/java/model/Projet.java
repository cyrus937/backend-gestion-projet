package model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString

@Document(collection = "Projet")
public class Projet {

    @Id
    private String id;
    @Indexed(unique = true)
    private String nom;
    private String description;
    private String state;
    private List<User> collaborateur;
    private User auteur;
    private Date dateCreation;

    public Projet(){
        super();
    }
    public Projet(String nom, String description, String state, List<User> collaborateur, User auteur) {
        super();
        this.nom = nom;
        this.description = description;
        this.state = state;
        this.collaborateur = collaborateur;
        this.auteur = auteur;
        this.dateCreation = new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<User> getCollaborateur() {
        return collaborateur;
    }

    public void setCollaborateur(List<User> collaborateur) {
        this.collaborateur = collaborateur;
    }

    public User getAuteur() {
        return auteur;
    }

    public void setAuteur(User auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Projet{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", state='" + state + '\'' +
                ", collaborateur=" + collaborateur +
                ", auteur=" + auteur +
                '}';
    }
}
