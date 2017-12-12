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
public class Realisateur extends Personne{
    private ArrayList<Dvd> listDvds;
    
    
    public Realisateur(String nom, String prenom, LocalDate dteNaissance) {
        super(nom, prenom, dteNaissance);
        listDvds = new ArrayList<>();
    }

    public ArrayList<Dvd> getListDvds() {
        return listDvds;
    }

    public void setListDvds(ArrayList<Dvd> listDvds) {
        this.listDvds = listDvds;
    }

    
    
    
}
