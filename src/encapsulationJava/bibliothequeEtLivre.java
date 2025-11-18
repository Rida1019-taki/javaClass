import java.util.ArrayList;
import java.util.List;

void main(){
    Bibliotheque b = new Bibliotheque("one piece");
    Livre l1 = new Livre("luffy" , "oda" , 123);
    Livre l2 = new Livre("luffy" , "oda" , 123);
    Livre l3 = new Livre("luffy" , "oda" , 123);
    Livre l4 = new Livre("luffy" , "oda" , 123);
    b.ajouterLivre(l1);
    b.ajouterLivre(l2);
    b.ajouterLivre(l3);
    b.ajouterLivre(l4);

    b.supprimerLivre(l1);
    b.supprimerLivre(l2);

    b.afficherLivres();
}

public class Bibliotheque {
    private String nom;
    private List<Livre> livres;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }

    void ajouterLivre(Livre li){
        livres.add(li);
    }

    void supprimerLivre(Livre li){
        if (livres.remove(li)){
            System.out.println("Livre et supprime " + li.titre);
        }
    }

    void afficherLivres(){
        for (Livre li : livres) {
            System.out.println("Titre : " + li.titre + " Auteur : " + li.auteur + " ISBN : " + li.isbn);
        }
    }
}

public class Livre{
    private String titre;
    private String auteur;
    private int isbn;

    public Livre(String titre, String auteur, int isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


}
