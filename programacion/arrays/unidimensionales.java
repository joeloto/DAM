package programacion.arrays;

public class unidimensionales {

    public static void main(String[] args) {
        double[] temperaturas = new double[4];

        temperaturas[0] = 7.5;
        temperaturas[1] = 3.2;
        temperaturas[2] = 1.3;
        temperaturas[3] = 10;

        // Rellena un array con valores aleatorios
        for (int i = 0; i < temperaturas.length; i++){
            temperaturas[i] = Math.random() * 50 - 25;
        }

        System.out.println("Tamaño: " + temperaturas.length);

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("temperaturas[%d] = %7.2fºC\n", i, temperaturas[i]);
           
        }
    }
}
