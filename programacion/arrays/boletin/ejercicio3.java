package programacion.arrays.boletin;

import java.util.ArrayList;

public class ejercicio3 {
    
    public static ArrayList<Integer> crear(int filas){
        ArrayList<Integer> vector = new ArrayList();
        for (int i = 0; i < filas; i++) {
            vector.add((int) (Math.random()*26 + 65));
        }
        return vector;
    }
    public static void mostrar(ArrayList<Integer> vector) {
        for (int num : vector) {
            System.out.println(num);
        }
    }

    public static int maximo(ArrayList<Integer> vector) { 
        
        int mayor = vector.get(0);
        for (int i = 0; i < vector.size(); i++) {
            if (mayor < vector.get(i)) {
                mayor = vector.get(i);
            }
        }
        return mayor;
    }

    public static int minimo(ArrayList<Integer> vector) {
        int minimo = vector.get(0);
        for (int numero : vector) {
            if (minimo > numero){
                minimo = numero;
            }
        }
        return minimo;
    }

    public static boolean intercambio(ArrayList<Integer> vector, int indice1, int indice2){
        boolean posiciones;
        if (vector.size() <= indice1 || vector.size() <= indice2 || indice1 < 0 || indice2 < 0) { 
            posiciones = false;
        } else{
            int intercambiar = indice1;
            int intercambiar2 = indice2;
            vector.set(indice2, intercambiar);
            vector.set(indice1, intercambiar2);
            
            posiciones = true;
        }
        return posiciones;
    }

    public static void main(String[] args) {
        ArrayList<Integer> vector = crear(10);
        mostrar(vector);
        System.out.println();
        System.out.println("Valor máximo: " + maximo(vector));
        System.out.println("Valor mínimo: " + minimo(vector));
        System.out.println("¿Se pueden intercambiar los valores? " + intercambio(vector, 2, 5));
    }
}

