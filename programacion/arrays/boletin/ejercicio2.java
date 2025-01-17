package programacion.arrays.boletin;

public class ejercicio2 {

    public static char[][] crear(int filas, int columnas) {
        char[][] vector = new char[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                vector[i][j] = (char) (Math.random()*91+65);
            }
        }
        return vector;
    }

    public static void mostrar(char[][] vector) {
        System.out.println("   ");
        for (int i = 0; i < vector[0].length; i++) {
            System.out.printf("%8d", i);  
        }

        System.out.println();
        int contFilas = 0;
        for (char[] filas : vector) {
            System.out.printf("%3d", contFilas);
            contFilas++;
            for (char letra : filas) {
                System.out.printf("%7s", letra);
            }
            System.out.println();
        }
    }

    public static int maximo(char[][] vector) {
        int mayor = 0;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                if (mayor < vector[i][j]) {
                    mayor = vector[i][j];
                }
            }
        }
        return mayor;
    }

    public static int minimo(char[][] vector) {
        int minimo = 5001;
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {
                if (minimo > vector[i][j]) {
                    minimo = vector[i][j];
                }
            }
        }
        return minimo;
    }

    public static boolean intercambio(char[][] vector, int indice1, int indice2, int indice3, int indice4) {
        boolean posiciones;
        if (vector.length < indice1 || vector.length < indice2 || vector.length < indice3 || vector.length < indice4) {
            posiciones = false;
        } else {
            char intercambiar = vector[indice1][indice2];
            vector[indice1][indice2] = vector[indice3][indice4];
            vector[indice3][indice4] = intercambiar;
            posiciones = true;
        }
        return posiciones;
    }

    public static void main(String[] args) {
        char[][] vector = crear(3,4);
        mostrar(vector);
        System.out.println();
        System.out.println("Valor máximo: " + maximo(vector));
        System.out.println("Valor mínimo: " + minimo(vector));
        System.out.println("¿Se pueden intercambiar los valores? " + intercambio(vector, 2, 5, 6, 3));

        System.out.println();
        char[][] vector2 = crear(4,3);
        mostrar(vector);
        System.out.println();
        System.out.println("Valor máximo: " + maximo(vector2));
        System.out.println("Valor mínimo: " + minimo(vector2));
        System.out.println("¿Se pueden intercambiar los valores? " + intercambio(vector2, 2, 5, 6, 3));
    }
}
