package programacion.arrays.boletin;

public class ejercicio2 {

    public static int[][] crear(int n, int m) {
        int[][] vector = new int[n][m];
        for (int i = 0; i < n; i++) {
            int numChar = (int) (Math.random()*91+65);
        }
        return vector;
    }

    public static void mostrar(int[] vector) {
        for (int num : vector) {
            System.out.println(num);
        }
    }

    public static int maximo(int[] vector) {
        int mayor = 0;
        for (int i = 0; i < vector.length; i++) {
            if (mayor < vector[i]) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static int minimo(int[] vector) {
        int minimo = 5001;
        for (int i = 0; i < vector.length; i++) {
            if (minimo > vector[i]) {
                minimo = vector[i];
            }
        }
        return minimo;
    }

    public static boolean intercambio(int[] vector, int indice1, int indice2) {
        boolean posiciones;
        if (vector.length < indice1 || vector.length < indice2) {
            posiciones = false;
        } else {
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
        System.out.println("¿Se pueden intercambiar los valores? " + intercambio(vector, 2, 5));
    }
}
