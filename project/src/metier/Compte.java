package metier;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import utilitaire.Validation;

public abstract class Compte {
    protected String code;
    protected double solde;
    protected List<Operation> operations;

    public Compte(double solde) {
        this.code = genererCode();
        this.solde = solde;
        this.operations = new ArrayList<>();
    }

    private String genererCode() {
        Random rand = new Random();
        int number = rand.nextInt(90000) + 10000;
        return "CPT-" + number;
    }

    public String getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void verser(double montant, String source) {
        Validation.validerMontant(montant); 
        solde += montant;
        operations.add(new Versement(montant, source));
    }

    public abstract void retirer(double montant, String destination);

    public abstract double calculerInteret();

    public abstract void afficherDetails();
}
