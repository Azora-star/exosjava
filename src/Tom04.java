public class Tom04 {
        public static void main(String[] args) {
                
        // temps de départ
           int heures1 = 12;
           int minutes1 = 34;
           int secondes1 = 56;

        // temps d'arrivé 
           int heures2 = 15;
           int minutes2 = 27;
           int secondes2 = 12;

        // conversion en second
           int secondesDebut = heures1 * 3600 + minutes1 * 60 + secondes1;
           int secondesFin   = heures2 * 3600 + minutes2 * 60 + secondes2;

        // Différence en secondes
            int duree = secondesFin - secondesDebut;

        // Nombre total de secondes dans une journée
            int totalJournee = 24 * 3600;

        // Pourcentage en nombres flottants
            double pourcentage = (duree * 100.0) / totalJournee;

            System.out.println("Pourcentage écoulé est de " + pourcentage + " % " );
}

}
