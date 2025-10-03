import java.util.Scanner;

public class M1E1 {

   public static void main(String[] args) {
        // Variables avec des valeurs en dur
        int heures = 12;
        int minutes = 34;
        int secondes = 56;

        // Calcul du nombre total de secondes depuis minuit
        int secondesEcoulees = heures * 3600 + minutes * 60 + secondes;

        // Affichage des résultats
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il s'est écoulé " + secondesEcoulees + " secondes depuis minuit.");
    }
    
    
}