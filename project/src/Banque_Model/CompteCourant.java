/**
 * 
 */
package Banque_Model;




/**
 * @author youco
 *
 */
public class CompteCourant extends Compte{

	/**
	 * 
	 */
	public double decouvert;
	public CompteCourant() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void retirer(double montant) {
	    if (montant <= 0) {
	        throw new IllegalArgumentException("Le montant doit être positif.");
	    }

	    if (this.solde - montant >= -this.decouvert) {
	        this.solde -= montant;
	        System.out.println("Retrait réussi. Nouveau solde : " + this.solde);
	    } else {
	        throw new IllegalArgumentException("Retrait refusé : dépassement du découvert autorisé !");
	    }
	}
	@Override
	public  double calculerInteret() {
		return 0;
	}
	@Override
	public void afficherDetails() {
		System.out.println("le nouveau solde du code "+code+" est "+solde+" dh et le decouvert = "+decouvert);
		
	}

}
