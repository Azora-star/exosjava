public class TOM01   {
    public static void main(String[] args) {
        //Variable en dur
        int heures = 12;
        int minutes = 00;
        int secondes = 00;

        //Calcule
        int Second_Au_Total = heures * 3600 + minutes * 60 + secondes;

        //Affichage
        System.out.println("Il est actuellement " + heures + "h " + minutes + "min " + secondes + "s.");
        System.out.println("Il s'est écoulé " + Second_Au_Total + " depuis minnuit.");
}
}