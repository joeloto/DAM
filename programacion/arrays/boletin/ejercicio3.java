package programacion.arrays.boletin;

import java.util.ArrayList;

public class ejercicio3 {
    
    public static ArrayList<Integer> crear(int filas){
        ArrayList<Integer> vector = new ArrayList();
        for (int i = 0; i < filas; i++) {
            vector.add((int) (Math.random()*4001 + 1000));
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
            int intercambiar = vector.get(indice1);
            vector.set(indice1, vector.get(indice2));
            vector.set(indice2, intercambiar);
            posiciones = true;
        }
        return posiciones;
    }

    public static void eliminar(int numero, ArrayList<Integer> vector){
        for (int i = vector.size() - 1; i >= 0; i--) {
            if (numero < vector.get(i)){
                vector.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> vector = crear(10);
        mostrar(vector);
        System.out.println();
        System.out.println("Valor máximo: " + maximo(vector));
        System.out.println("Valor mínimo: " + minimo(vector));
        System.out.println("¿Se pueden intercambiar los valores? " + intercambio(vector, 2, 5));
        mostrar(vector);
        eliminar(2500, vector);
        System.out.println();
        mostrar(vector);
    }
}

