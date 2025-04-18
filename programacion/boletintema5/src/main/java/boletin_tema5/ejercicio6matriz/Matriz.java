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
package boletin_tema5.ejercicio6matriz;

public class Matriz {

    public int[][] matriz;

    /**
     * construye una matriz de n x n
     * 
     * @param n representa las dimensiones de la matriz
     */
    public Matriz(int n) {
        matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }

    }

    /**
     * muestra una matriz en formato tabla alineada
     * 
     * @param matriz representa la matriz que se va a mostrar alineada
     */
    public static void mostrar(int[][] matriz) {
        System.out.print("  ");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        int contFilas = 0;
        for (int[] fila : matriz) {
            System.out.printf("%2d", contFilas);
            contFilas++;
            for (int num : fila) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }

    /**
     * funcion que hace la suma de los elementos de la matriz
     * 
     * @return devuelve la el acumulador que contiene los datos de la suma
     */
    public int suma() {
        int acumulador = 0;
        for (int[] elemento : matriz) {
            for (int i : elemento) {
                acumulador += i;
            }
        }
        return acumulador;
    }

    /**
     * funcion que la suma de la diagonal de la matriz o del resto de los elementos
     * dependiendo del booleano
     * 
     * @param operacion booleano que representa la operacion que se va a realizar
     *                  dependiendo de su valor
     * @return devuelve la operacion
     */
    public int suma(boolean operacion) {
        int acumulador = 0;
        if (operacion) {
            for (int i = 0; i < this.matriz.length; i++) {
                acumulador += matriz[i][i];
            }
        } else {
            acumulador += suma() - acumulador;
        }
        return acumulador;
    }

    /**
     * suma los elementos de la linea que se indica
     * 
     * @param linea representa la linea de la que se quieren sumar los elementos
     * @return devuelve la suma de los elementos de la linea señalada
     */
    public int suma(int linea) {
        int acumulador = 0;
        if (linea < 0 || linea >= matriz.length) {
            return -1;
        }
        for (int i = 0; i < matriz[linea].length; i++) {
            acumulador += matriz[linea][i];
        }
        return acumulador;
    }

    /**
     * funcion que borra una linea de una matriz
     * 
     * @param linea hace referencia a la linea que se quiere borrar
     * @return devuelve la matriz sin la linea indicada o la matriz completa
     *         dependiendo de los rangos de la linea
     */
    public int[][] borraFila(int linea) {
        if (linea <= 0 || linea >= matriz.length) {
            return matriz;
        }
        int[][] m2 = new int[matriz.length - 1][matriz.length];
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (linea <= i) {
                    m2[i][j] = matriz[i + 1][j];
                } else {
                    m2[i][j] = matriz[i][j];
                }
            }
        }
        return m2;

    }
}
