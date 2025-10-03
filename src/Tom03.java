public class Tom03 {
        public static void main(String[] args) {

     //Varaible "en dur" 
        int heures = 15;
        int minutes = 27;
        int secondes = 12;

        //Calculer le le nombre de secondes écoulées depuis minuit
        int totalSecondes = heures * 3600 + minutes * 60 + secondes;

        //Nombre total de seconde depuis minuit 
        int secondesParJour = 24 * 3600;

        //Second restantes avant minuit
        int secondeAvantMinuit = secondesParJour - totalSecondes;

        //Affichage
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il s'est écoulé " + totalSecondes + " secondes depuis minuit.");
        System.out.println("Il reste " + secondeAvantMinuit + " secondes avant minuit.");

    }
}
