// Module d'Inscription Libre et Souveraine (Standard 2030)
public class SovereignRegistration {
    private String surnom;
    private boolean compteValide = false;

    // L'utilisateur choisit son nom, son surnom, avec emojis et caractères spéciaux autorisés
    public void creerIdentiteSouveraine(String nomChoisi) {
        // Validation simple : le nom est l'unique clé de l'identité
        if (nomChoisi != null && !nomChoisi.isEmpty()) {
            this.surnom = nomChoisi;
            this.compteValide = true;
            System.out.println("Identité souveraine créée : " + surnom);
            System.out.println("Bienvenue dans l'écosystème. Aucune donnée externe requise.");
        } else {
            System.out.println("Le nom choisi n'est pas valide.");
        }
    }

    public String getSurnom() {
        return surnom;
    }
}
