package entities;

public class Dvd extends Article{
    private int duree;

    public Dvd(String ref, String designation, Double prix,int duree) {
        super(ref, designation, prix);
        this.duree = duree;
    }
    
    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "\n"+this.getRef()+"\n"+this.getDesignation()+"\n"+this.getDuree();
    }
    
    
}
