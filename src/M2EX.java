import java.util.Scanner;

public class M2EX {
    public static void main(String[] args) {

        // Bonjour ! Je suis l'assistant de la machine à café
        Scanner clavier = new Scanner(System.in);
        System.out.println(
                "Bonjour ! Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez ? :");

        // Nombre de pièce
        System.out.println("pièces de 1 cent ? : ");
        int nb1 = clavier.nextInt();
        System.out.println("pièces de 5 cent ? : ");
        int nb5 = clavier.nextInt();
        System.out.println("pièces de 10 cent ? : ");
        int nb10 = clavier.nextInt();
        System.out.println("pièces de 20 cent ? : ");
        int nb20 = clavier.nextInt();
        System.out.println("pièces de 50 cent ? : ");
        int nb50 = clavier.nextInt();

    }
}
