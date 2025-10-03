public class Tom02   {
    public static void main(String[] args) {
        //Varaible en dur 
        int heures = 21;
        int minutes = 43;
        int secondes = 17;

        //Calculer le le nombre de secondes écoulées depuis minuit
        int totalSecondes = heures * 3600 + minutes * 60 + secondes;

        //Affichage
        System.out.println("Il est " + heures + "h " + minutes + "min " + secondes + "s.");
        System.out.println("Il s'est écoulé " + totalSecondes + " seconde depuis minuit.");   
}

}