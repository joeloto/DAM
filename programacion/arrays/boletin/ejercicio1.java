package programacion.arrays.boletin;

public class ejercicio1 {

    public static double[] crear(int n){
        n = (int) Math.random() * 5000 - 1000;
        double[] vector = new double[n];
        return vector;
    }

    public static void mostrar(){
        int[] vector2 = new int[10];
        for (int num : vector2){
            System.out.println(num);
        }
    }
    
    public static void main(String[] args) {
        int[] vector = new int[10];
    }
}
