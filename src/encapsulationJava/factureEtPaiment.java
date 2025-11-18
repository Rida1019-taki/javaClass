import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

void main(){
    Facture f = new Facture(01 );
    Paiement p = new Paiement(1000.0 , new Date());
    f.ajouterPaiement(p);
    f.calculerTotalPaiements();
    f.AfficherTotal();
}

public class Facture {
    private int id;
    private List<Paiement> paiements;

    public Facture(int id) {
        this.id = id;
        this.paiements = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    void ajouterPaiement(Paiement p){
        paiements.add(p);
    }

    double calculerTotalPaiements(){
        double total = 0.0;
        for (Paiement p : paiements){
            total += p.montant;
        }
        return total;
    }

    void AfficherTotal(){
        System.out.println("ID : " + id);
        System.out.println("Montan Total : " + calculerTotalPaiements());
        for (Paiement p : paiements){
            p.AfficherPaiement();
        }
    }
}

public class Paiement {
    private double montant;
    private Date date;

    public Paiement(double montant, Date date) {
        this.montant = montant;
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    void AfficherPaiement(){
        System.out.println("Montant : " + montant + " Date : " + date);
    }
}