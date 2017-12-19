package s03.poojse;

import entities.Auteur;
import entities.Dvd;
import entities.Livre;
import entities.Realisateur;
import java.time.LocalDate;

public class S03PooJSE {

    public static void main(String[] args){
        Dvd dvd = new Dvd("refDVD1", "Star Wars", 19.99, 120);
        Livre livre = new Livre("refLivre1", "Le petit prince", 4.99, "isbnDuLivre",50);
        Realisateur rea = new Realisateur("Lucas", "Georges", LocalDate.of(1944,04,14));
        Auteur aut = new Auteur("Antoine","De Saint Exupery", LocalDate.of(1932,10,01));
        
        rea.getListDvds().add(dvd);
        aut.getListLivres().add(livre);
        
        System.out.println(rea);
        System.out.println(aut);
    }
    
}
