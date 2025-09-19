package metier;

public class CompteEpagne extends Compte {
    private double tauxInteret;

    public CompteEpagne(double solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    @Override
    public void retirer(double montant, String destination) {
        if (this.solde >= montant) {
            this.solde -= montant;
            operations.add(new Retrait(montant, destination));
        } else {
            System.out.println("Retrait refuse : solde insuffisant !");
        }
    }

    @Override
    public double calculerInteret() {
        return this.solde * tauxInteret / 100;
    }
    
    @Override
    public void afficherDetails() {
        System.out.println("Code : " + code + " | Solde = " + solde + " | taux d \'interet = "+ tauxInteret  );
    }
}
