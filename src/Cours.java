import java.util.ArrayList;
import java.util.List;

public class Cours {
    int coursID;
    String titre;
    String description;
    String instructeur;
    List<Etudiant> etudiants = new ArrayList<>();

    public Cours(int coursID , String titre , String description , String instructeur){
        this.coursID = coursID;
        this.titre = titre;
        this.description = description;
        this.instructeur = instructeur;
    }

    void AfficherCours(){
        System.out.println("ID: " + coursID);
        System.out.println("Titre: " + titre);
        System.out.println("Description: " + description);
        System.out.println("Instructeur: " + (instructeur));
        System.out.println("Étudiants: " + etudiants.size());
        for (Etudiant e : etudiants) {
            System.out.println("- " + e.nom);
        }
    }
}
