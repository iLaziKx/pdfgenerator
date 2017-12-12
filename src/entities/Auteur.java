/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Auteur extends Personne{
    private ArrayList<Livre> listLivres;
    
    public Auteur(String nom, String prenom, LocalDate dteNaissance) {
        super(nom, prenom, dteNaissance);
        listLivres = new ArrayList<>();
    }

    public ArrayList<Livre> getListLivres() {
        return listLivres;
    }

    public void setListLivres(ArrayList<Livre> listLivres) {
        this.listLivres = listLivres;
    }

    
}
