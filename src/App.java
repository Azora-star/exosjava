import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Récupérer nom 1

        // Initialisation du Scanner pour le clavier
        Scanner clavier = new Scanner(System.in);
        // nextInt attend une entrée au clavier
        System.out.println("Entrée un nom commun : ");
        String nom1 = clavier.next();

        // Récupérer nombre
        System.out.println("Entrée un nombre : ");
        int nombre = clavier.nextInt();

        // récupérer le nom2
        System.out.println("Entrée un nom commun : ");
        String nom2 = clavier.next();

        // Récupérer adjectif
        System.out.println("Entrée un adjectif : ");
        String adjectif = clavier.next();

        // Afficher la phrase "Il était une fois un NOM1 qui avait NOMBRE NOM2. Cela le
        // rendait très
        // ADJECTIF"
        System.out.println("Il était une fois un NOM1"); // qui avaitt NOMBRE NOM2.Cela le rendait très
        // ADJECTIF
        System.out.println("Il était une fois un " + nom1 + " qui avait " + nombre + nom2 + ". Cela le rendait très "
                + adjectif + ".");

    }

}
