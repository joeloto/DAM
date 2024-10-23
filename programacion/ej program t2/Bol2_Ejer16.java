import java.util.Scanner;

public class Bol2_Ejer16 {
    public static void main(String[] args) { // TODO preguntar si se desea jugar de nuevo
        Scanner sc = new Scanner(System.in);

        int n1;
        int opc;
        int n2;
        do {// De repet de juego
            int cont = 6;
            boolean act = false;

            do { // de pet de dato
                System.out.println("Jugador 1, introduce un número");
                n1 = sc.nextInt();
            } while (n1 > 100 || n1 < 0);

            for (int i = 0; i < 50; i++) {
                System.out.println();
            }
            System.out.println("Jugador 2, adivina el número");
            while (act == false) {
                cont = cont - 1;
                System.out.println("Te quedan " + cont + " intentos");
                System.out.println("Introduce un número");
                n2 = sc.nextInt();
                if (n1 > n2) {
                    System.out.println("El número a adivinar es mayor");
                } else if (n1 < n2) {
                    System.out.println("El número a adivinar es menor");

                }
                if (n1 == n2) {
                    System.out.println("Enhorabuena! Has adivinado el número");
                    act = true;
                } else if (n1 != n2 && cont == 1) {
                    System.out.println("No has adivinado el número");
                    act = true;
                }

            }

            System.out.println("Pula cualquier número para volver a jugar");
            System.out.println("Pulsa 0 para salir");
            opc = sc.nextInt();
        } while (opc != 0);

    }
}
