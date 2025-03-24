package principal.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    Scanner sc = new Scanner(System.in);

    public void pedirNumero(String mensaje, int min, int max) {
        boolean error;
        int numero;
        if (min + 3 >= max || mensaje == "" || mensaje == null) {
            throw new IllegalArgumentException("Parámetros inválidos");
        }
        do {
            error = false;
            try {
                do {
                    System.out.println(mensaje + min + " y " + max);
                    numero = sc.nextInt();
                } while (numero < min || numero > max);
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número");
                error = true;
                sc.nextLine();
            }
        } while (error);
    }
}
