//VALIDADO
package principal.ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);
    
    /**
     * pide un numero entre unos rangos determinados 
     * @param mensaje representa el mensaje
     * @param min representa el rango minimo del numero
     * @param max representa el rango maximo del numero
     */
    public static void pedirNumero(String mensaje, int min, int max) {
        boolean error;
            int numero;
            if (mensaje == null||min + 3 >= max || mensaje.equals("")) {
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

    public static void main(String[] args) {
        pedirNumero("dime un numero entre ",-5,20);
    }
}
