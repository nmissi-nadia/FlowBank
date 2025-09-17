/**
 * 
 */
package Banque_Model;

/**
 * @author youco
 *
 */
public class CompteEpagne extends Compte{

	/**
	 * 
	 */
	public double tauxInteret;
	public CompteEpagne(double solde,double taux) {
		super(solde);
		this.tauxInteret=taux;
	}
	
	
	@Override
	public void retirer(double montant) {
	    if (montant <= 0) {
	        throw new IllegalArgumentException("Le montant doit être positif.");
	    }

	    if (this.solde   >= montant) {
	        this.solde -= montant;
	        System.out.println("Retrait réussi. Nouveau solde : " + this.solde);
	    } else {
	        throw new IllegalArgumentException("Retrait refusé : dépassement du découvert autorisé !");
	    }
	}
	@Override
	public  double calculerInteret() {
		return this.solde*this.tauxInteret;
	}
	@Override
	public void afficherDetails() {
		System.out.println("le nouveau solde du code "+code+" est "+solde+" dh et le taux d'interet = "+tauxInteret+"%");
		
	}

}
