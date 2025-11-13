import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    int studentId;
    String nom;
    String email;
    private List<Cours> cours = new ArrayList<>();


    public Etudiant(int studentId , String nom , String email){
        this.studentId = studentId;
        this.nom = nom;
        this.email = email;
    }

}