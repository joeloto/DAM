/*-
 * =====LICENSE-START=====
 * Boletin tema 5
 * ------
 * Copyright (C) 2020 - 2025 Organization Name
 * ------
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =====LICENSE-END=====
 */
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
