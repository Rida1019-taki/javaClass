import java.time.LocalDate;
import java.util.Date;

void main(){
    Voiture v1 = new Voiture("1111111" , "Mercedes" , "CLA");
    CarteGrise c1 = new CarteGrise(123 , LocalDate.of(2025 , 11 , 18));
    v1.lierCarteGrise(c1);
    c1.AfficherVoiture();
}
public class Voiture {
    private String immatriculation;
    private String marque;
    private String modele;
    private CarteGrise carteGrise;

    public CarteGrise getCarteGrise() {
        return carteGrise;
    }

    public void setCarteGrise(CarteGrise carteGrise) {
        this.carteGrise = carteGrise;
    }

    public Voiture(String immatriculation, String marque, String modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    void lierCarteGrise(CarteGrise c){
        this.carteGrise = c;
        c.setProprietaire(this);
    }
}

public class CarteGrise{
    private int numero;
    private Voiture proprietaire;
    private LocalDate dateEmission;

    public CarteGrise(int numero, LocalDate dateEmission) {
        this.numero = numero;
        this.dateEmission = dateEmission;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Voiture getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Voiture proprietaire) {
        this.proprietaire = proprietaire;
    }

    public LocalDate getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(LocalDate dateEmission) {
        this.dateEmission = dateEmission;
    }
    void AfficherVoiture(){
        System.out.println("Le numero : " + numero + " immatriculation : "
                + proprietaire.immatriculation + " La marque : " +
                proprietaire.marque + " Le modele : " + proprietaire.modele +
        " La date : " + dateEmission);
    }
}
