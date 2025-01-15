package programacion.arrays.boletin;

public class ejercicio1 {

    public static int[] crear(int n){
        n = (int) Math.random() * 5000 - 1000;
        int[] vector = new int[n];
        return vector;
    }

    public static void mostrar(int[] vector){
        for (int num : vector){
            System.out.println(num);
        }
    }

    public static int maximo(int[] vector){
        int mayor = 0;
        for (int i = 0; i < vector.length; i++) {
            if (mayor < vector[i]) {
                mayor = vector[i];
            }
        }
        return mayor;
    }

    public static int minimo(int[] vector){
        int minimo = 5001;
        for (int i = 0; i < vector.length; i++) {
            if (minimo > vector[i]) {
                minimo = vector[i];
            }
        }
        return minimo;
    }
    
    public static void main(String[] args) {
        int[] vector = crear(10);

        
    }
}
