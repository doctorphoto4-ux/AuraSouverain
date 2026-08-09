// Écran d'accueil - Le "Dash" Souverain
public class SovereignDashLauncher {
    
    public void lancerInterfacePrincipale() {
        System.out.println("--- Démarrage du Dash Souverain ---");
        afficherAvatar3D();
        activerConnectiviteShadowLink();
        System.out.println("Bienvenue dans votre écosystème, Romaric.");
    }

    private void afficherAvatar3D() {
        System.out.println("Affichage de l'avatar 3D central : mode 'Aura Partagée' activé.");
    }

    private void activerConnectiviteShadowLink() {
        // Le réseau Mesh se connecte automatiquement en arrière-plan
        System.out.println("Shadow Link activé : connexion indépendante prête.");
    }
}
