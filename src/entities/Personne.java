package entities;

import java.time.LocalDate;


public abstract class Personne {
    private String nom;
    private String prenom;
    private LocalDate dteNaissance;

    public Personne(String nom, String prenom, LocalDate dteNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dteNaissance = dteNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDteNaissance() {
        return dteNaissance;
    }

    public void setDteNaissance(LocalDate dteNaissance) {
        this.dteNaissance = dteNaissance;
    }

    @Override
    public String toString() {
        return this.getPrenom()+" - "+this.getNom()+"\n date de naissance : "+this.getDteNaissance(); //To change body of generated methods, choose Tools | Templates.
    }

}
