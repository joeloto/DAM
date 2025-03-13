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

import java.util.*;

public class PrincipalMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Matriz m = new Matriz(4);

        int opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Mostrar matriz");
            System.out.println("2.- Suma de todos los elementos");
            System.out.println("3.- Suma de la diagonal");
            System.out.println("4.- Suma de los elementos salvo la diagonal");
            System.out.println("5.- Suma de elementos de una fila");
            System.out.println("6.- Mostrar matriz sin una fila");
            System.out.println("7.- Salir");
            System.out.println("Teclee opción (1-7)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La matriz:");
                    Matriz.mostrar(m.matriz);
                    break;
                case 2:
                    Matriz.mostrar(m.matriz);
                    System.out.println("La suma de todos los elementos es: " + m.suma());
                    break;
                case 3:
                    Matriz.mostrar(m.matriz);
                    System.out.println("La suma de los elementos de la diagonal es: " + m.suma(true));
                    break;
                case 4:
                    Matriz.mostrar(m.matriz);
                    System.out.println("La suma de los elementos que no son de la diagonal es: " + m.suma(false));
                    break;
                case 5:
                    Matriz.mostrar(m.matriz);
                    System.out.println("¿De qué fila quieres que se sumen los elementos?");
                    int fila = sc.nextInt();
                    System.out.println("La suma de la fila " + fila + " es: " + m.suma(fila));
                    break;
                case 6:
                    Matriz.mostrar(m.matriz);
                    System.out.println("¿Qué fila quieres borrar?");
                    fila = sc.nextInt();
                    Matriz.mostrar(m.borraFila(fila));
                    break;
                case 7:
                    System.out.println("Hasta otra!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 7);
    }
}
