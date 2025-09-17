/**
 * 
 */
package Banque_Model;
import java.util.List;

/**
 * @author youco
 *
 */
public abstract class Compte {
	private static int compteur = 10000;
	protected String code;
	protected double solde;
	protected List listeoperations;
	/* Constructeur */
	protected Compte(double solde) {
		this.code="CPT-" + compteur++;;
		this.solde=solde;
	}
	
	
	public abstract void retirer(double montant);
	public abstract double calculerInteret();
	public abstract void afficherDetails();

}
