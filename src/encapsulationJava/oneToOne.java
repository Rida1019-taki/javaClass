import java.time.LocalDate;

void main(){
    Passport pass = new Passport(12345 , "Marocaine" , LocalDate.of(2025 , 11 , 14));
    Personne p1 = new Personne("rida" , 20 , pass);
    p1.AfficherInfo();
}
public class Personne {
    private String nom;
    private int age;
    private Passport passport;

    public Personne(String nom , int age , Passport passport){
        this.nom = nom;
        this.age = age;
        this.passport = passport;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String NewNom){
        this.nom = NewNom;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int NewAge){
         this.age = NewAge;
    }

    public Passport getPassport(){
        return passport;
    }

    public void setPassport(Passport passport){
         this.passport = passport;
    }
    void AfficherInfo(){
        System.out.println("Nom : " + nom + " Age : " + age);
        passport.AffchierPassport();
    }
}

public class Passport{
    private int numero;
    private String nationalite;
    private LocalDate dateExpiration;

    public Passport(int numero , String nationalite , LocalDate dateExpiration){
        this.numero = numero;
        this.nationalite = nationalite;
        this.dateExpiration = dateExpiration;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int NewNumero){
        this.numero = NewNumero;
    }

    public String getNationalite(){
        return nationalite;
    }

    public void setNationaite(String NewNationalite){
        this.nationalite = NewNationalite;
    }

    public LocalDate getDateExpiration(){
        return dateExpiration;
    }

    public void setDateExpiration(LocalDate NewDateExpiration){
        this.dateExpiration = NewDateExpiration;
    }

    void AffchierPassport(){
        System.out.println("Numero : " + numero);
        System.out.println("Nationalite : " + nationalite);
        System.out.println("Date Expiration : " + dateExpiration);
    }
}
