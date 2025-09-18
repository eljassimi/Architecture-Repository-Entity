package entities;

public class Produit {

    private Integer id;
    private String nom;
    private Double prix;
    private Integer stock;

    private static  Integer idCount = 0;

    public Produit(){
        setId();
    }

    public  Produit(String nom, Double prix, Integer stock){
        setId();
        this.setNom(nom);
        this.setPrix(prix);
        this.setStock(stock);
    }

    public Integer getId(){
        return this.id;
    }

    public void setId() {
        this.id = ++idCount;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String toString( ){
        return "Id du Produit "+this.id+
                "\nNom du Produit : "+this.nom+
                "\nPrix du Produit : "+this.prix+
                "\nQnt du Produit : "+this.stock+
                "\n ------------------- \n";
    }

}
