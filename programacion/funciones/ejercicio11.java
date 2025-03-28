// a) Realizar una función que devuelva el factorial de un número seg ún se
// definió en el boletín anterior (recuerda que 0!=1). Hazlo con parámetro int pero
// que devuelva double o long.

// b) El cálculo del coseno de un ángulo se puede aproximar por el siguiente cálculo
// (aproximación de Taylor):
// cos(x)=1−x^2/2!*x^4/4!- x^6/6!+...
// Realizar un método que realice y devuelva dicho cálculo (hazlo al menos hasta el
// termino de potencia 4. Si quiere mete más). Debes usar la función factorial hecha
// en el apartado anterior y la de potencia hecha en un ejercicio previo.

// c) Realizar un programa que muestre por pantalla los cosenos de los ángulos de 0.1
// , 0.2, y hasta 1 radian. Además en cada línea mostrará el resultado del coseno
// según tu función y el error absoluto obtenido de restarlo de la función Math.cos().
// Usa 5 decimales de aproximación para todo y que los valores ocupen 8 posiciones.
// Opcional: Realiza la función factorial aplicando recursividad (ver apéndice de
// apuntes, evita buscar en internet).

import java.util.Scanner;

public class ejercicio11 {

    /**
     * función que hace el factorial de un número
     * 
     * @param num recoge el valor del número el cual se quiee hacer el factorial
     * @return devuelve el factorial
     */
    public static double factorial(int num) {
        double acu = 1;
        for (int i = 1; i <= num; i++) {
            // System.out.println(i);
            acu *= i;
        }
        // if (num == 0) {
        //    // System.out.println("El factorial es: ");
        //     return 1;
        // }
        return acu;
    }

    /**
     * funcion que hace el coseno con la aproximacion de taylor
     * 
     * @param num de que número se quiere hacer el coseno
     * @return devuelve el resultado del coseno
     */
    public static double coseno(double num) {
        double resultado = 1 - (ejercicio6.potencia(num, 2) / factorial(2))
                + (ejercicio6.potencia(num, 4) / factorial(4)) 
                - (ejercicio6.potencia(num, 6) / factorial(6));
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Dime un número:");
        // int num = sc.nextInt();
        // System.out.println("El factorial de " + num + " es " + factorial(num));

        // Coseno:
        // System.out.println("Coseno:\n");
        // System.out.println("Dime un número para hacer su coseno");
        // int x = sc.nextInt();
        // System.out.println();
        // System.out.println("El coseno es " + coseno(x) + "\n");

        double error = 0;
        for (double angulo = 0.1; angulo < 1; angulo += 0.1) {
            error = coseno(angulo)-Math.cos(angulo);
        }
        System.out.printf("El error absoluto es %8.5f", error);
    }
}
