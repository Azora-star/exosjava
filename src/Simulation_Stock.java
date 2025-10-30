import java.util.Scanner;

public class Simulation_Stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.programme demande à l’utilisateur
        System.out.print("Quel est le stock initial ? : ");
        int stock_initial = sc.nextInt();

        System.out.print("Quel est le seuil d'alerte ? : ");
        int seuil_alerte = sc.nextInt();

        System.out.print("Combien de jours doit durer la simulation ? : ");
        int nbr_jours_simuler = sc.nextInt();

        // 2.Pour chaque jour
        boolean simulationEnCours = true;
        int stock = stock_initial;

        for (int jour = 1; jour <= nbr_jours_simuler && simulationEnCours; jour++) {

            System.out.println();
            System.out.println();
            System.out.println("Jour " + jour);
            System.out.println("------");

            System.out.print("Quantité de produits reçue ? : ");
            int quantite_recue = sc.nextInt();

            System.out.print("Quantité de produits vendue ? : ");
            int quantite_vendue = sc.nextInt();

            stock = stock + quantite_recue - quantite_vendue;
            System.out.println("Le stock est de : " + stock);

            if (stock <= seuil_alerte && stock >= 0) {
                System.out.println("ATTENTION : le stock est sous le seuil d'alerte !");
            }

            if (stock < 0) {
                System.out.println("ERREUR : le stock est négatif. Simulation arrêtée.");
                simulationEnCours = false;
                System.exit(1);
            }
        }

        // 3.fin de la simulation
        System.out.println("Simulation terminée. Stock final : " + stock + " unités");

    }
}
