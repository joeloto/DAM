package ejercicio2.interfaz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Libreria {
    //static boolean error;

    public static int pedirEntero() {
        Scanner sc = new Scanner(System.in);
        boolean error;
        int entero = 0;
        do {
            error = false;
            try {
                System.out.println("Introduce un número entero");
                entero = sc.nextInt();
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("Introduce un número entero");
                sc.nextLine();
            }
        } while (error);
        return entero;
    }

    public static double pedirDouble() {
        Scanner sc = new Scanner(System.in);
        boolean error;
        double real = 0;
        do {
            error = false;
            try {
                System.out.println("Introduce un número real");
                real = sc.nextInt();
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("Introduce un número real");
                sc.nextLine();
            }
        } while (error);
        return real;
    }

    public static double pedirReal() {
        Scanner sc = new Scanner(System.in);
        boolean error;
        double real = 0;
        do {
            error = false;
            try {
                System.out.println("Introduce un número real");
                real = sc.nextDouble();
            } catch (InputMismatchException e) {
                error = true;
                System.out.println("Introduce un número real");
                sc.nextLine();
            }
        } while (error);
        return real;
    }
}
