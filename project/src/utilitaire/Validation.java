package utilitaire;

public class Validation {
    public static void validerMontant(double montant) throws BanqueException {
        if (montant <= 0) {
            throw new BanqueException("Le montant doit etre positif");
        }
    }
}
