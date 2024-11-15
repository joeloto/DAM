// En el mismo archivo haz las siguientes funciones:
// a) Codifica un método que deje en pantalla n líneas en blanco ( es un parámetro).
// No devuelve nada.

// b) Escribe una función denominada par con un único parámetro entero. Devuelve
// true si el parámetro es número par y false si no lo es. No muestra nada.

// c) Escribir una función que tenga un argumento (otra forma de llamar a un
// parámetro) de tipo entero y que devuelva la letra ‘P’ (devuelve char) si el número
// es positivo o cero y la letra ‘N’ si es negativo. Intenta hacerlo con el operador
// ternario (ver Apéndice I del Tema 2); si no te sale hazlo con if.

// d) En el programa principal primero pides el nombre del usuario. A continuación
// dejas deja 10 líneas en blanco mediante la 1ª función. Luego pides un número
// entero al usuario e indicas si es par y positivo o negativo.



import java.util.Scanner;

public class ejercicio1 {

    Scanner sc = new Scanner(System.in);

    /**
     *  
     * funcion que pone lineas en blanco
     * 
     * @param n Cantidad de líneas a dejar
     */
    public static void lineasblanco(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
        System.out.println();
    }

    /**
     *  Comprueba qsi un nº es par
     *  
     * 
     * @param n Nº a comprobar
     * @return true si el numero es par y false si no lo es
     */
    public static boolean par(int n) {
        return n % 2 == 0;
    }

    /**
     *  
     * funcion para identificar numeros positivos
     * 
     * @param n Nº a comprobar
     * @return 'P' si n es positivo o 0 y 'N' en caso de que sea negativo
     */
    public static char positivo(int n) {
        return (n >= 0) ? 'P' : 'N';// operador ternario--- si n es positivo devuelpe P sino, devuelve N
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // apartado a
        // int n;
        // System.out.println();
        // System.out.println();
        // System.out.println(" ¿Cuántas líneas en blanco quieres poner?");
        // n = sc.nextInt();
        // lineasblanco(n);

        // apartado b
        // int n1;
        // System.out.println("Dime un número");
        // n = sc.nextInt();
        // System.out.println(par(n1));

        // apartado c
        // int n;
        // System.out.println("Dime un número");
        // n = sc.nextInt();
        // System.out.println(positivo(n));

        // apartado d
        System.out.println();
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();

        lineasblanco(10);
        int n;
        System.out.println("Dime un número para saber si es par y positivo o negativo");
        n = sc.nextInt();
        System.out.println(par(n));
        System.out.println(positivo(n));

        int opcion;
       
    }

}
