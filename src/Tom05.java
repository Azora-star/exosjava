import java.util.Random;
import java.util.Scanner;
public class Tom05 {
        public static void main(String[] args) {
        
        //Utiliser l'heure systeme comme graine
        Random nombrealeatoire = new Random();

        //Initialisation du Scanner pour le clavier
        Scanner clavier_de_mon_pc = new Scanner(System.in);
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.println("Entrez un nombre : ");
        int nombre_utilisateur = clavier_de_mon_pc.nextInt();
        clavier_de_mon_pc.close();

        //Vous proposée
        System.out.println("Vous proposer " + nombre_utilisateur);

        //Générer un nombre aléatoire entre 1 et 100.
        int nombre_1_a_100 = nombrealeatoire.nextInt(100) + 1;
        System.out.println("Le nombre auquel je pensais était : " + nombre_1_a_100);

        //Vous étiez à X de la bonne réponse.
        int écart_entre = Math.abs(nombre_utilisateur-nombre_1_a_100);
        System.out.println("Vous étiez à " + écart_entre + " de la bonne réponse.");

       
        }  
}