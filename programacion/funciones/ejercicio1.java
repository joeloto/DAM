

import java.util.Scanner;

public class ejercicio1 {

    Scanner sc = new Scanner(System.in);

    /** apartado a
     * funcion que pone lineas en blanco
     * @param n
     */
    public static void lineasblanco(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("");
        }
        System.out.println();
    }

    /** apartado b
     * funcion que devuelve true si el numero es par y false si no lo es
     * @param n
     * @return
     */
    public static boolean par(int n){
        return n % 2 == 0;
    }

    /** apartado c
     * funcion para identificar numeros positivos
     * @param n
     * @return
     */
    public static char positivo(int n){
        return (n >= 0) ? 'P' : 'N';//operador ternario--- si n es positivo devuelpe P sino, devuelve N
    }

    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //apartado a
        // int n;
        // System.out.println();
        // System.out.println();
        // System.out.println(" ¿Cuántas líneas en blanco quieres poner?");
        // n = sc.nextInt();
        // lineasblanco(n);

        //apartado b
        // int n1;
        // System.out.println("Dime un número");
        // n = sc.nextInt();
        // System.out.println(par(n1));

        //apartado c
        // int n;
        // System.out.println("Dime un número");
        // n = sc.nextInt();
        // System.out.println(positivo(n));
       
        //apartado d
        System.out.println();
        lineasblanco(10);
        int n;
        System.out.println("Dime un número para saber si es par y positivo o negativo");
        n = sc.nextInt();
        System.out.println(par(n));
        System.out.println(positivo(n));
    }

}

