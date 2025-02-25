package boletin_tema5.examenPrueba;

import java.util.*;

public class Ejercicio1 {

    public static int[][] creaMatriz(int magos) {
        int[][] matriz = new int[magos][4];
        for (int i = 0; i < magos; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 6 + 1);
            }
        }
        return matriz;
    }

    public static void muestraMatriz(int[][] matriz) {
        if (matriz == null) {
            System.out.println();
        } else {
            String[] elementos = { "A", "F", "E", "W" };
            System.out.printf("%3s", " ");
            for (String elemento : elementos) {
                System.out.printf("%4s", elemento);
            }
            System.out.println();
            int contFilas = 0;
            for (int[] mago : matriz) {
                System.out.printf("%3d", contFilas);
                contFilas++;
                for (int poder : mago) {
                    System.out.printf("%4d", poder);
                }
                System.out.println();
            }
        }
    }

    public static int poderDeMago(int[][] matriz, int fila) {
        int acumulador = 0;
        for (int i = 0; i < matriz.length; i++) {
            acumulador += matriz[fila][i];
        }
        return acumulador;
    }

    public static void intercambioDePoder(int[][] matriz, int fila1, int fila2){
        for (int i = 0; i < matriz.length; i++) {
            int HechizoIntercambiador = matriz[fila1][i];
            matriz[fila1][i] = matriz[fila2][i];
            matriz[fila2][i] = HechizoIntercambiador;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = creaMatriz(4);

        muestraMatriz(matriz);
    
        System.out.println("Dime un mago:");
        int fila = sc.nextInt();

        System.out.println("La suma de los poderes del mago " + fila + " es " + poderDeMago(matriz, fila));

        System.out.println();
        System.out.println("Intercambio:");
        intercambioDePoder(matriz, 0,matriz.length - 1);

        muestraMatriz(matriz);


    }

}
