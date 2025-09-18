import Banque_Model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Compte> cpts = new ArrayList<>();
        System.out.println("=== FlowBank vous souhaite la bienvenue dans votre espace Bancaire ===");
        boolean continu = true;

        // menu begin
        while (continu) {
            System.out.println("\n========================= Menu Banque ========================" +
                    "\n 1. Creer Compte Courant" +
                    "\n 2. Creer Compte Epargne" +
                    "\n 3. Verser sur un compte" +
                    "\n 4. Retirer d un compte" +
                    "\n 5. Consulter solde et details" +
                    "\n 6. Voir historique des operations" +
                    "\n 0. Quitter");
            System.out.print("Choix : ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1: 
                    System.out.print("Solde initial : ");
                    double soldeC = sc.nextDouble();
                    double dec = 2000;
                    CompteCourant cc = new CompteCourant(soldeC, dec);
                    cpts.add(cc);
                    System.out.println("Compte courant cree : " + cc.getCode());
                    break;

                case 2: 
                    System.out.print("Solde initial : ");
                    double soldeE = sc.nextDouble();
                    double taux = 0.04;
                    CompteEpagne ce = new CompteEpagne(soldeE, taux);
                    cpts.add(ce);
                    System.out.println("Compte epargne cree : " + ce.getCode());
                    break;

                case 3: 
                    System.out.print("Code du compte : ");
                    String codeV = sc.next();
                    Compte cptV = chercherCompte(cpts, codeV);
                    if (cptV != null) {
                        System.out.print("Montant : ");
                        double mntV = sc.nextDouble();
                        cptV.verser(mntV, "Depot especes");
                        System.out.println("Versement effectue.");
                    } else {
                        System.out.println("Compte introuvable !");
                    }
                    break;

                case 4: 
                    System.out.print("Code du compte : ");
                    String codeR = sc.next();
                    Compte cptR = chercherCompte(cpts, codeR);
                    if (cptR != null) {
                        System.out.print("Montant : ");
                        double mntR = sc.nextDouble();
                        try {
                            cptR.retirer(mntR, "Retrait ATM");
                            System.out.println("Retrait effectue.");
                        } catch (Exception e) {
                            System.out.println("Erreur : " + e.getMessage());
                        }
                    } else {
                        System.out.println("Compte introuvable !");
                    }
                    break;

                case 5: 
                    System.out.print("Code du compte : ");
                    String codeC = sc.next();
                    Compte cptC = chercherCompte(cpts, codeC);
                    if (cptC != null) {
                        cptC.afficherDetails();
                    } else {
                        System.out.println("Compte introuvable !");
                    }
                    break;

                case 6:
                    System.out.print("Code du compte : ");
                    String codeH = sc.next();
                    Compte cptH = chercherCompte(cpts, codeH);
                    if (cptH != null) {
                        System.out.println("--- Historique des operations ---");
                        for (Operation op : cptH.getOperations()) {
                            System.out.println(op.getClass().getSimpleName() +
                                    " | " + op.getMontant() +
                                    " | " + op.getDate());
                        }
                    } else {
                        System.out.println("Compte introuvable !");
                    }
                    break;

                case 0:
                    continu = false;
                    System.out.println("Merci d avoir utilise FlowBank !");
                    break;

                default:
                    System.out.println("Choix invalide !");
            }
        }

        sc.close();
    }

    private static Compte chercherCompte(List<Compte> comptes, String code) {
        for (Compte c : comptes) {
            if (c.getCode().equals(code)) {
                return c;
            }
        }
        return null;
    }
}
