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
package boletin_tema5.examenPrueba.Ejercicio2;

public class Astro {

    public double radio;
    private String nombre;

    public void setNombre(String nombre){
        this.nombre = nombre.toUpperCase().trim();
    }

    public String getNombre(){
        return nombre;
    }

    public String getNombre(char caracter){
        String cadenaResult = "";
        for (int i = 0; i < nombre.length(); i++) {
           cadenaResult += nombre.charAt(i);
           if (i < nombre.length() - 1) {
            cadenaResult += caracter;
           }
        }
        return cadenaResult;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void muestraDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.printf("El radio: %.2d", getRadio());
    }

    public Astro(String nombre, double radio){
        setNombre(nombre);
        setRadio(radio);
    }

    public Astro(){}
}
