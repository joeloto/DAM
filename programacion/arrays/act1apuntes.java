package programacion.arrays;

import java.util.*;

public class act1apuntes {

    public static double media(double[] vector) {
        double acu = 0;
        double media = 0;
        for (double num : vector) {
            acu = acu + num;
            media = (acu / vector.length);
        }
        return media;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        // double acu = 0;
        //double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime un número:");
            numeros[i] = sc.nextDouble();
        }

        // for (int i = 0; i < numeros.length; i++) {
        // acu = acu + numeros[i];
        // media = (acu/numeros.length);
        // }
        // for (double num : numeros) {
        // acu = acu + num;
        // media = (acu / numeros.length);
        // }

        System.out.println();
        System.out.println("Los números son:");
        // for (int i = 0; i < numeros.length; i++) {
        // System.out.println(numeros[i]);
        // }
        for (double nums : numeros) {
            System.out.println(nums);
        }
        System.out.printf("La media es %.2f", media(numeros));
    }
}
