package boletin_tema5.ejercicio7;

import java.util.ArrayList;

public class Ejercicio7 {
    
    public void rellenaCol(ArrayList<Integer> coleccion){
        coleccion.clear();
        for (int i = 0; i <= 6; i++) {
            coleccion.add((int) (Math.random() * 50 + 1));
        }
    }

    public static int compara(ArrayList<Integer> coleccion1,ArrayList<Integer> coleccion2){
        int contador = 0;
        for (Integer elemento : coleccion1) {
            if (coleccion2.contains(elemento)) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        
    }
}
