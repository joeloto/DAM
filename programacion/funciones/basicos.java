import java.util.Scanner;

public class basicos {

    Scanner sc = new Scanner(System.in);

    /**
     * ejercicio1
     */
    public static void saludo() {
        System.out.println("Hola");
    }

    /**
     * ejercicio2
     */
    public static void saludo10() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Hola");
        }
    }
    /*
     * ejercicio3
     */

    public static void variosSaludos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("Hola");
        }
        System.out.println();
    }

    /*
     * ejercicio4
     */
    public static void pintaMensaje(String msg) {
        System.out.println(msg);
    }

    /*
     * ejercicio5
     */
    public static void pintaMensaje10(String msg) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(msg);
        }
    }

    /*
     * ejercicio6
     */
    public static void pintaVariosMensajes(String msg, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
        System.out.println();
    }

    /*
     * ejercicio7
     */
    public static int suma20(){
        int acu = 0;
        for (int i = 1; i <= 20; i++) {
            acu = acu + i;
        }
        return acu;
    }

    /*
     * ejercicio8
     */
    public static int sumaN(int n){
        int acu = 0;
        for (int i = 0; i <= n; i++) {
            acu = acu + i;
        }
        return acu;
    }

    /*
     * ejercicio9
     */
    public static int pideNumero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.println(msg);
        int n;
        n = sc.nextInt();
        return n;
    }

    public static void main(String[] args) {
        //ejercicio1
        // saludo();

        // ejercicio2 {
        // saludo10();
        // }

        // ejercicio3
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println();
        // variosSaludos(5);
        // System.out.println();
        // System.out.println(" ¿Cuántos holas quieres poner?");
        // n = sc.nextInt();
        // variosSaludos(n);

        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println();
        // variosSaludos(2);
        // System.out.println();
        // System.out.println(" ¿Cuántos holas quieres poner?");
        // n = sc.nextInt();
        // variosSaludos(n);

        // ejercicio4
        // pintaMensaje("Adiós");

        // ejercicio5
        // pintaMensaje10("Adiós");

        // ejercicio6
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println();
        // System.out.println();
        // System.out.println("¿Cuántos adiós quieres poner?");
        // n = sc.nextInt();
        // pintaVariosMensajes("Adios",n);

        //ejercicio7
        // int suma = suma20();
        // System.out.println("El resultado es " + suma);

        //ejercicio8
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.println();
        // System.out.println("¿Hasta donde quieres sumar?");
        // n = sc.nextInt();
        // int suma = sumaN(n);
        // System.out.println("El resultado es "+ suma);

        //ejercicio9
        // Scanner sc = new Scanner (System.in);
        // int n;
    
        // int doble = pideNumero("Dime el valor de un entero");

        // System.out.println("El doble es " + doble*2);
    }

}