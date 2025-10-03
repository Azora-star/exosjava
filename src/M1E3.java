public class M1E3 {

   public static void main(String[] args) {

    //Initialisation du Scanner pour le clavier
        Scanner clavier = new Scanner(System.in);

        //nextInt attend une entrée au clavier
        System.out.println("Entré les heures : ");
     
        //Récupérer les minutes
        System.out.println("Entrée les minutes : ");
        int minutes = clavier.nextInt ();

        //Récupérer les secondes
        System.out.println("Entrée les secondes : ");
        String secondes = clavier.next ();

        // Calcul du nombre total de secondes avant minuit
        int secondesEcoulees = heures * 3600 + minutes * 60 + secondes;

        // Affichage des résultats
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il y a encore " + secondesEcoulees + " secondes avant minuit.");
    }
    
}
