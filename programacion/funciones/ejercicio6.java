// a) Realizar una función que halle y devuelva la potencia de un número ( No se
// permite usar funciones de Math). La base puede ser real y el exponente entero
// puede ser negativo (recuerda que a-b = (1/a)b
// ).
// Parámetros del método: la base y el exponente. Valor devuelto: la potencia

// b) Realiza un nuevo método (en la misma clase) que muestre en pantalla las n
// primeras potencias de un número a (n y a serán parámetros del método).
// Por ejemplo, si los parámetros son a=2 y n=4 mostrará: 1, 2, 4, 8.
// Para hacerlo deberás llamar al creado en el apartado anterior para calcular las
// potencias, no las puedes calcular de nuevo en este método.

// c) Escribe un método que sume la progresión geométrica (x puede ser real) y
// devuelva el resultado.
// 1+x+x2+ x3+ x4+... xn

// Se debe utilizar la función potencia (sin modificarla, sólo llamándola) programada
// anteriormente.
// Por ejemplo si x=2 y n=4 mostrará 31 por ser el resultado de 1+2+4+8+16.
// Parámetros del método: x y n. Valor devuelto: resultado de la progresión.


import java.util.Scanner;

public class ejercicio6 {

    /**
     * 
     * calcula una potencia
     * 
     * @param base      recoge el valor de la base
     * @param exponente recoge el valor del exponente
     * @return devuelve el resultado de la potencia
     */
    public static double potencia(double base, int exponente) {
        double potencia = 1;
        if (exponente < 0) {
            base = 1 / base;
            exponente = -exponente;
        }
        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }
        return potencia;
    }

    /**
     *
     * muestra n numero de potencias de la base a
     * 
     * @param a recoge la base
     * @param n recoge el numero de potencias que se muestran
     */
    public static void numPotencias(double a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(potencia(a, i));
        }
    }


    /**
     * suma de potencias
     * @param x recoge el valor de la base
     * @param n recoge el número de potencias que se quieren sumar
     * @return devuelve la suma de las potencias
     */
    public static double sumaPotencias(double x, int n) {
        double acu = 0;
        for (int i = 0; i <= n; i++) {
            acu = acu + potencia(x, i);
        }
        return acu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Dime un valor para la base");
        // double base = sc.nextDouble();
        // System.out.println("Dime un valor para el exponente");
        // int exponente = sc.nextInt();
        System.out.println("Dime un número");
        double a = sc.nextDouble();
        System.out.println("Dime otro número");
        int n = sc.nextInt();
        // System.out.println(potencia(base, exponente));
        // numPotencias(a, n);
        System.out.println(sumaPotencias(a, n));
    }
}
