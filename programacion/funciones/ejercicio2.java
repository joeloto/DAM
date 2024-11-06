import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio2 {

    Scanner sc = new Scanner(System.in);

    /**
     * apartado a
     * funcion que pone lineas en blanco
     * 
     * @param n
     */
    public static void lineasblanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
        System.out.println();
    }

    /**
     * apartado b
     * funcion que devuelve true si el numero es par y false si no lo es
     * 
     * @param n
     * @return
     */
    public static boolean par(int n) {
        return n % 2 == 0;
    }

    /**
     * apartado c
     * funcion para identificar numeros positivos
     * 
     * @param n
     * @return
     */
    public static char positivo(int n) {
        return (n >= 0) ? 'P' : 'N';// operador ternario--- si n es positivo devuelpe P sino, devuelve N
    }

    public static void main(String[] a) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Creación del documento

        PrintWriter f = new PrintWriter("ejercicio2.txt");

        // Escritura del archivo
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();
        int n;
        System.out.println("Dime un número y te diré si es negativo o positivo y si es par o impar");
        n = sc.nextInt();
        System.out.println(par(n));
        System.out.println(positivo(n));
        f.println(nombre);
        f.println(n);
        f.print("El numero es " + (par(n) == true ? "par" : "impar") + " y "
                + (positivo(n) == 'P' ? "positivo" : "negativo"));

        // Cierre
        f.close();
    }
}