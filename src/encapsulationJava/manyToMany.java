import java.util.ArrayList;
import java.util.List;



void main(){
    Cours c = new Cours(102 , "Developpement");
    Etudiant e = new Etudiant(1 , "rida");
    e.inscrire(c);
    e.afficherEtudiant();
    c.AfficherCou();
}
public class Etudiant {
    private int id;
    private String nom;
    private List<Cours> coursSuivis = new ArrayList<>();

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    void inscrire(Cours c) {
        if (!coursSuivis.contains(c)) {
            coursSuivis.add(c);
            c.ajouterEtudiant(this);
        }
    }

    public void afficherEtudiant() {
        System.out.println("ID : " + id + " | Nom : " + nom);
        System.out.println("Cours suivis : ");
        for (Cours c : coursSuivis) {
            System.out.println(" - " + c.getTitre());
        }
    }

    public String getNom() { return nom; }
}


public class Cours {
    private int id;
    private String titre;
    private List<Etudiant> inscrits = new ArrayList<>();

    public Cours(int id, String titre) {
        this.id = id;
        this.titre = titre;
    }

    void ajouterEtudiant(Etudiant e) {
        if (!inscrits.contains(e)) {
            inscrits.add(e);
            e.inscrire(this);
        }
    }

    void AfficherCou() {
        System.out.println("ID : " + id + " | Titre : " + titre);
        System.out.println("Étudiants inscrits : ");
        for (Etudiant e : inscrits) {
            System.out.println(" - " + e.getNom());
        }
    }

    public String getTitre() { return titre; }
}


