import java.util.ArrayList;
import java.util.List;

void main(){
    Produit p1 = new Produit("Latop" , 3000.0 , 5);
    Commande co = new Commande(102 , p1);
    co.ajouterProduit(p1);
    co.calculerTotal();
}
public class Produit {
    private String nom;
    private double prixUnitaire;
    private int quantite;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Produit(String nom, double prixUnitaire, int quantite) {
        this.nom = nom;
        this.prixUnitaire = prixUnitaire;
        this.quantite = quantite;
    }
}
public class Commande{
    private int id;

    public Commande(int id, Produit p1) {
        this.id = id;
        this.produits = new ArrayList<>();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    private List<Produit> produits ;

    void ajouterProduit(Produit p){
        produits.add(p);
    }
    void calculerTotal(){
        for (Produit i : produits){
            double totalCommande = i.prixUnitaire * i.quantite;
            System.out.println("Le total de les commandes : " + totalCommande);
        }
    }
}