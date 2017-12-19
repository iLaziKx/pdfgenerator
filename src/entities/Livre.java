package entities;

public class Livre extends Article{
    private String isbn;
    private int nbPages;

    public Livre(String ref, String designation, Double prix, String isbn, int nbPages) {
        super(ref, designation, prix);
        this.isbn = isbn;
        this.nbPages = nbPages;
    }
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return super.toString()+"\n ISBN = "+isbn+"\n nombre de pages = "+nbPages;
    }
    
    
}
