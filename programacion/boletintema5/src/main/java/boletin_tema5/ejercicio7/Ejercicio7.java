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
package boletin_tema5.ejercicio7;

import java.util.*;

public class Ejercicio7 {//TODO coment

    /**
     * añade numeros aleatorios a una coleccion
     * @param coleccion representa la coleccion a la que se añaden los numeros
     */
    public static void rellenaCol(ArrayList<Integer> coleccion) {
        coleccion.clear();
        for (int i = 0; i <= 6; i++) {// TODO números distintos
            int numero = (int) (Math.random() * 50 + 1);
            if (!coleccion.contains(numero)) {
                coleccion.add(numero);
            } 
        }
    }

    /**
     * compara elementos de dos colecciones
     * @param coleccion1 representa una coleccion
     * @param coleccion2 representa otra coleccion
     * @return devuelve las veces que se repiten los elementos
     */
    public static int compara(ArrayList<Integer> coleccion1, ArrayList<Integer> coleccion2) {
        int contador = 0;
        for (Integer elemento : coleccion1) {
            if (coleccion2.contains(elemento)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * muestra los aciertos por pantalla
     * @param array representa el array con los numeros de aciertos
     */
    public static void mostrar(int[] array){
        int aciertos = 0;
        for (int num : array) {
            System.out.print(aciertos + " aciertos: " + num);
            System.out.println();
            aciertos++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> coleccion = new ArrayList<>();//TODO Comprobaciones sobre la entrada de datos

        String[] numeros;
        do{
        System.out.println("Introduce seis números entre 1 y 49 separados por comas");
        String numeroscomas = sc.nextLine();
        numeros = numeroscomas.split(",");
        } while (numeros.length != 6);

        for (String cifra : numeros) {
            int numero = Integer.parseInt(cifra);
            if (numero <= 0 || numero > 49) {
                System.out.println("Uno o más números están fuera de rangos");
            } 
            if (coleccion.contains(numero)) {
            }
            coleccion.add(numero);
        }

        int[] victoria = new int[7];
        ArrayList<Integer> loteria = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            rellenaCol(loteria);
            int indice = compara(coleccion, loteria);
            victoria[indice]++;
        }
        System.out.println();
        mostrar(victoria);

    }
}
