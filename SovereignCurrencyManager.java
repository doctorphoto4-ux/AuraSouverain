// Gestionnaire de la monnaie souveraine "L'Aurique" (AUR) - Onglet Solde Sécurisé
public class SovereignCurrencyManager {
    private final String nomMonnaie = "Aurique";
    private final String codeSymbole = "AUR";
    private double soldeAurique = 0.0; // Valeur gérée en arrière-plan

    // Méthode appelée pour afficher le solde dans l'onglet dédié de l'application
    public String obtenirAffichageSoldeOnglet() {
        return soldeAurique + " " + codeSymbole;
    }

    public void convertirDepuisMobileMoney(double montantExterne) {
        double valeurConvertie = montantExterne * 1.0; 
        soldeAurique += valeurConvertie;
    }

    public void transfererP2PInstantane(double montant, String destinataireId) {
        if (soldeAurique >= montant) {
            soldeAurique -= montant;
            System.out.println("Transfert de " + montant + " " + codeSymbole + " (Aurique) effectué vers " + destinataireId);
        }
    }
}
