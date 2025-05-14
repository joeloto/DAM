package pruebas.ejercicio3;

public class Vectores {
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
}
