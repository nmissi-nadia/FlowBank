package metier;

import utilitaire.Validation;

public class CompteCourant extends Compte {
    private double decouvert;

    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(double montant, String destination) {
        Validation.validerMontant(montant);
        if (this.solde - montant >= -this.decouvert) {
            this.solde -= montant;
            operations.add(new Retrait(montant, destination));
        } else {
            throw new utilitaire.BanqueException("Retrait impossible : depassement du decouvert autorise");
        }
    }

    @Override
    public double calculerInteret() {
        return 0;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Compte Courant [code=" + code + ", solde=" + solde + ", decouvert=" + decouvert + "]");
    }
}
