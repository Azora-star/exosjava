import java.util.Scanner;

public class PGCD {
    public static void main(String[] args) {

        // Scanner
        Scanner clavier = new Scanner(System.in);

        // Noms de la variable
        int a = 0;
        int b = 0;
        int deux = 0;
        int trois = 0;
        int cinq = 0;
        int sept = 0;
        int onze = 0;
        int treize = 0;

        System.out.println("Entrée le 1er nombre : " + a);
        a = clavier.nextInt();
        int memoire_a = a;

        System.out.println("Entrée le 2ème nombre : " + b);
        b = clavier.nextInt();
        int memoire_b = b;

        // les nombres premiers
        int a_deux = 0;
        int a_trois = 0;
        int a_cinq = 0;
        int a_sept = 0;
        int a_onze = 0;
        int a_treize = 0;

        int b_deux = 0;
        int b_trois = 0;
        int b_cinq = 0;
        int b_sept = 0;
        int b_onze = 0;
        int b_treize = 0;

        // Les conditions pour a
        while (a % 2 == 0) {
            if (a % 2 == 0) {
                a_deux = a_deux + 1;
                a = a / 2;
            }
        }

        while (a % 3 == 0) {
            if (a % 3 == 0) {
                a_trois = a_trois + 1;
                a = a / 3;
            }
        }

        while (a % 5 == 0) {
            if (a % 5 == 0) {
                a_cinq = a_cinq + 1;
                a = a / 5;
            }
        }

        while (a % 7 == 0) {
            if (a % 7 == 0) {
                a_sept = a_sept + 1;
                a = a / 7;
            }
        }

        while (a % 11 == 0) {
            if (a % 11 == 0) {
                a_onze = a_onze + 1;
                a = a / 11;
            }
        }

        while (a % 13 == 0) {
            if (a % 13 == 0) {
                a_treize = a_treize + 1;
                a = a / 13;
            }
        }
        System.out.println("le nombre a est maintenant : " + a);
        System.out.println("nombre de division par 2 de a : " + a_deux);
        System.out.println("nombre de division par 3 de a : " + a_trois);
        System.out.println("nombre de division par 5 de a : " + a_cinq);
        System.out.println("nombre de division par 7 de a : " + a_sept);
        System.out.println("nombre de division par 11 de a : " + a_onze);
        System.out.println("nombre de division par 13 de a : " + a_treize);

        // Les conditions pour b
        while (b % 2 == 0) {
            if (b % 2 == 0) {
                b_deux = b_deux + 1;
                b = b / 2;
            }
        }

        while (b % 3 == 0) {
            if (b % 3 == 0) {
                b_trois = b_trois + 1;
                b = b / 3;
            }
        }

        while (b % 5 == 0) {
            if (b % 5 == 0) {
                b_cinq = b_cinq + 1;
                b = b / 5;
            }
        }

        while (b % 7 == 0) {
            if (b % 7 == 0) {
                b_sept = b_sept + 1;
                b = b / 7;
            }
        }

        while (b % 11 == 0) {
            if (b % 11 == 0) {
                b_onze = b_onze + 1;
                b = b / 11;
            }
        }

        while (b % 13 == 0) {
            if (b % 13 == 0) {
                b_treize = b_treize + 1;
                b = b / 13;
            }
        }
        System.out.println("le nombre b est mbintenbnt : " + b);
        System.out.println("nombre de division pbr 2 de b : " + b_deux);
        System.out.println("nombre de division pbr 3 de b : " + b_trois);
        System.out.println("nombre de division pbr 5 de b : " + b_cinq);
        System.out.println("nombre de division pbr 7 de b : " + b_sept);
        System.out.println("nombre de division pbr 11 de b : " + b_onze);
        System.out.println("nombre de division pbr 13 de b : " + b_treize);

        // Le PGCD
        if (a_deux < b_deux) {
            deux = a_deux;
        } else {
            deux = b_deux;
        }

        if (a_trois < b_trois) {
            trois = a_trois;
        } else {
            trois = b_trois;
        }
        ;

        if (a_cinq < b_cinq) {
            cinq = a_cinq;
        } else {
            cinq = b_cinq;
        }
        ;

        if (a_sept < b_sept) {
            sept = a_sept;
        } else {
            sept = b_sept;
        }

        if (a_onze < b_onze) {
            onze = a_onze;
        } else {
            onze = b_onze;
        }
        ;

        if (a_treize < b_treize) {
            treize = a_treize;
        } else {
            treize = b_treize;
        }
        ;

        double r2 = Math.pow(2, deux);
        double r3 = Math.pow(3, trois);
        double r5 = Math.pow(5, cinq);
        double r7 = Math.pow(7, sept);
        double r11 = Math.pow(11, onze);
        double r13 = Math.pow(13, treize);

        double PGCD = r2 * r3 * r5 * r7 * r11 * r13;

        System.out.println("Le PGCD de " + memoire_a + " et " + memoire_b + " est : " + PGCD);
    }
}