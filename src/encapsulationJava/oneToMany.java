import java.util.ArrayList;
import java.util.List;

void main(){
    Cours c1 = new Cours(123 , "one piece" , "the best anime");
    Instructeur ints = new Instructeur(102 , "messi" , "Koora");
    ints.AjouterCours(c1);
    ints.AfficherInfo();
}
public class Instructeur {
    private int id;
    private String nom;
    private String specialisation;
    private List<Cours> coursEnseignes = new ArrayList<>();

    public Instructeur(int id , String nom , String specialisation){
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
        this.coursEnseignes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public List<Cours> getcoursEnseignes() {
        return coursEnseignes;
    }

    public void setcoursEnseignes(List<Cours> cours) {
        this.coursEnseignes = cours;
    }

    void AfficherInfo(){
        System.out.println("ID : " + id + " Nom : " + nom + " Specialisation : " + specialisation );
        for (Cours co : coursEnseignes){
            co.AfficherCours();
        }
    }

    void AjouterCours(Cours c){
        coursEnseignes.add(c);
        System.out.println("Succer");
    }
}

public class Cours{
    private int id;
    private String titre;
    private String description;

    public Cours(int id , String titre , String description){
        this.id = id;
        this.titre = titre;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    void AfficherCours(){
        System.out.println("ID : " + id + " Titre : " + titre + " Description : " + description);
    }

}
