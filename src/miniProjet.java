import java.util.ArrayList;
import java.util.Scanner;

public class miniProjet {

     ArrayList<Etudiant> etudiants = new ArrayList<>();
     ArrayList<Instructeur> instructeurs = new ArrayList<>();
     ArrayList<Cours> cours = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void main(){
        while (true){
            Menu();
            System.out.print("Choice : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    AjouterEtudiant();
                break;
                case 2 :
                    AssignerInstructeur();
                break;
                case 3 :
                    AjouterCours();
                break;
                case 4 :
                    InscrireEtudiant();
                break;
                case 5 :
                    AssignerInstruc();
                break;
                case 6 :
                    AfficherCours();
                break;
                case 7 :
                    return;

                default:
                    System.out.println("There no choice like that : " + choice);
            }
        }
    }
    void Menu() {
        System.out.println("=== Menu Gestion des Cours ===");
        System.out.println("1. Ajouter un étudiant");
        System.out.println("2. Ajouter un instructeur");
        System.out.println("3. Ajouter un cours");
        System.out.println("4. Inscrire un étudiant à un cours");
        System.out.println("5. Assigner un instructeur à un cours");
        System.out.println("6. Afficher les détails d’un cours");
        System.out.println("7. Quitter");
    }

    void AjouterEtudiant () {
        System.out.print("Enter ur ID : ");
        int studentId = sc.nextInt();
        System.out.print("Enter ur name : ");
        String nom = sc.next();
        System.out.print("Enter ur email : ");
        String email = sc.next();

        etudiants.add(new Etudiant(studentId , nom , email));
        System.out.println("Succee.");
    }
    void AssignerInstructeur () {
        System.out.print("Enter ur ID : ");
        int instructorId = sc.nextInt();
        System.out.print("Enter ur name : ");
        String nom = sc.next();
        System.out.print("Enter ur Specialisation : ");
        String specialisation = sc.next();

        instructeurs.add(new Instructeur(instructorId , nom ,specialisation));
        System.out.println("Succee.");
    }
    void AjouterCours(){
        System.out.print("Enter ur ID : ");
        int coursID = sc.nextInt();
        System.out.print("Enter ur name : ");
        String titre = sc.next();
        System.out.print("Enter ur Specialisation : ");
        String description = sc.next();
        System.out.print("Enter ur instructeur : ");
        String instructeur = sc.next();

        cours.add(new Cours(coursID , titre , description , instructeur));
        System.out.println("Succee.");
    }
    void InscrireEtudiant(){
        System.out.print("ID etudiant : ");
        int IdEtudiant = sc.nextInt();
        System.out.print("ID cours : ");
        int IdCours = sc.nextInt();

        Etudiant etudiant = FindEtudiant(IdEtudiant);
        Cours cours = FindCours(IdCours);

        cours.etudiants.add(etudiant);
        System.out.println("Inscrire succefly.");
    }
    void AssignerInstruc(){
        System.out.print("ID instructeur : ");
        int IdInstructeur = sc.nextInt();
        System.out.print("ID cours : ");
        int IdCours = sc.nextInt();

        Instructeur instr = FindInstructeur(IdInstructeur);
        Cours cour = FindCours(IdCours);

        cour.instructeur = instr.nom;
        System.out.println("Inscrire succefly.");
    }
    void AfficherCours() {
        System.out.print("ID cours : ");
        int coursID = sc.nextInt();
        Cours cour = FindCours(coursID);
        if (cour != null) {
            cour.AfficherCours();
        } else {
            System.out.println("Cours non trouvé !");
        }
    }
    Etudiant FindEtudiant(int id){
        for (Etudiant i : etudiants) {
            if (i.studentId == id) {
                return i;
            }
        }
        return null;
    }
    Instructeur FindInstructeur(int id){
        for (Instructeur i : instructeurs) {
            if (i.instructorId == id) {
                return i;
            }
        }
        return null;
    }
    Cours FindCours(int id){
        for (Cours i : cours) {
            if (i.coursID == id) {
                return i;
            }
        }
        return null;
    }
}
