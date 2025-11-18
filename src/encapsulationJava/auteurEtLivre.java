import java.util.ArrayList;
import java.util.List;

void main(){
    Auteur a = new Auteur("rida");
    Livre l = new Livre("one piece");
    a.ajouterLivre(l);
    l.ajouterAuteur(a);
    l.AfficherLivre();
}

public class Auteur {
    private String nom;
    private List<Livre> livresEcrits;

    public Auteur(String nom) {
        this.nom = nom;
        this.livresEcrits = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Livre> getLivresEcrits() {
        return livresEcrits;
    }

    public void setLivresEcrits(List<Livre> livresEcrits) {
        this.livresEcrits = livresEcrits;
    }

    void ajouterLivre(Livre l){
        livresEcrits.add(l);
    }

    void AfficherAuteur(){
        System.out.println("Nom : " + nom);
    }
}

public class Livre {
    private String titre;
    private List<Auteur> auteurs;

    public Livre(String titre) {
        this.titre = titre;
        this.auteurs = new ArrayList<>();
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

    void ajouterAuteur(Auteur a){
        auteurs.add(a);
    }

    void AfficherLivre(){
        System.out.println("Titre : " + titre);
        for (Auteur a : auteurs){
            a.AfficherAuteur();
        }
    }
}