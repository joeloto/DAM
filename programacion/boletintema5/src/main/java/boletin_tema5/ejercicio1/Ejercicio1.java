package boletin_tema5.ejercicio1;

public class Ejercicio1 {

    public static int[] crear(int n) {
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int)(Math.random() * 4001 + 1000);
        }
        return vector;
    }

    public static void mostrar(int[] vector) {
        for (int num : vector) {
            System.out.println(num);
        }
    }

    public static int maximo(int[] vector) { 
        int mayor = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (mayor < vector[i]) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static int minimo(int[] vector) {
        int minimo = vector[0];
        for (int numero : vector) {
            if (minimo > numero){
                minimo = numero;
            }
        }
        return minimo;
    }

    public static boolean intercambio(int[] vector, int indice1, int indice2){
        boolean posiciones;
        if (vector.length <= indice1 || vector.length <= indice2 || indice1 < 0 || indice2 < 0) { 
            posiciones = false;
        } else{
            int intercambiar = vector[indice1];
            vector[indice1] = vector[indice2];
            vector[indice2] = intercambiar;
            posiciones = true;
        }
        return posiciones;
    }

    public static void main(String[] args) {
        int[] vector = crear(10);
        mostrar(vector);
        System.out.println();
        System.out.println("Valor máximo: " + maximo(vector));
        System.out.println("Valor mínimo: " + minimo(vector));
        System.out.println("¿Se pueden intercambiar los valores? " + intercambio(vector, -2, 10));
    }
}
