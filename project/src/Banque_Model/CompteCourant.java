package Banque_Model;

public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant, String destination) {
        if (this.solde - montant >= -this.decouvert) {
            this.solde -= montant;
            operations.add(new Retrait(montant, destination));
        } else {
            System.out.println("Retrait refuse : depasse le decouvert autorise !");
        }
    }

    @Override
    public double calculerInteret() {
        return 0; // pas d'intérêt
    }
    @Override
    public void afficherDetails() {
        System.out.println("Code : " + code + " | Solde = " + solde + " |decouvert = "+ decouvert );
    }
}
