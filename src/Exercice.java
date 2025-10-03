public class Exercice {
    public static void main(String[] args) {
        // Varia
        int heures = 15;
        int minutes = 27;
        int seconde = 12;

        //Calculer le nombre de second écoulées depuis minuit 
        int totalSecondes = heures * 3600 + minutes * 60 + seconde;
        
        //Nombre total de seconde depuis minuit 
        int secondesParJour = 24 * 3600;

        //Second restant avant minuit 
        int secondavantminuit = secondesParJour - totalSecondes;

        //Affichage
        System.out.println("Il est " + heures + "h " + minutes + "min " + seconde + "s." );
        System.out.println("Il s'est écoulé " + totalSecondes + " secondes depuis minuit.");
        System.out.println("Il reste " + secondavantminuit + " secondes avant minuit.");
    }
}
