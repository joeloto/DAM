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

    /** ejercicio6
     * escribe la palabra que quieras las veces que quieras
     * @param msg recoge el texto
     * @param n recoge el numero de veces que la quieres poner
     */
    public static void pintaVariosMensajes(String msg, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(msg);
        }
        System.out.println();
    }

    /** ejercicio7
     * suma los numeros del 1 al 20
     * @return devuelve la suma (acumulador)
     */
    public static int suma20(){
        int acu = 0;
        for (int i = 1; i <= 20; i++) {
            acu = acu + i;
        }
        return acu;
    }

    /**
     * suma los numeros desde el 0 hasta el que le pongas
     * @param n recoge hasta que numero quieres sumar
     * @return devuelve la suma (acumulador)
     */
    public static int sumaN(int n){
        int acu = 0;
        for (int i = 0; i <= n; i++) {
            acu = acu + i;
        }
        return acu;
    }

    /**
     * recoge el mensaje y una pedida de un valor
     * @param msg recoge el mensaje
     * @return devuelve el numero
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