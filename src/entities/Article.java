package entities;

public abstract class Article {
    private String ref;
    private String designation;
    private Double prix;

    public Article(){
    }
    
    public Article(String ref, String designation, Double prix) {
        this.ref = ref;
        this.designation = designation;
        this.prix = prix;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "\n référence = " + ref + ", \n designation = " + designation + ", \n prix = " + prix;
    }

}
