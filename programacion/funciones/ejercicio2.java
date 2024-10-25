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

    public static void nombre1(String nombre){
        System.out.println("Dime un nombre");
            
    }

    public static void main(String[] a) throws Exception {

        Scanner sc = new Scanner(System.in);

        //Creación del documento
        PrintWriter f = new PrintWriter("ejercicio2.txt");

        //Escritura del archivo

    }
}