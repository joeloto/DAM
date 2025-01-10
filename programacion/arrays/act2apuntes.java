package programacion.arrays;

public class act2apuntes {

    public static double[][] dimensionesArray(int filas, int columnas) {
        double[][] tabla = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = (double) (Math.random() * 10 + 20);
            }
        }
        return tabla;
    }

    public static void segundaArray(double[][] tabla) {
        System.out.println("   ");
        for (int i = 0; i < tabla[0].length; i++) {
            System.out.printf("%7d", i);
        }
        // System.out.println();
        // for (int i = 0; i < tabla.length; i++) {
        //     System.out.printf("%3d", i);
        //     for (int j = 0; j < tabla[i].length; j++) {
        //         System.out.printf("%7.2f", tabla[i][j]);
        //     }
        //     System.out.println();
        // }

        System.out.println();
        int numFilas = 0;
        for (double[] fila : tabla) {
            System.out.printf("%3d", numFilas);
            numFilas++;
            for (double valor : fila) {
                System.out.printf("%7.2f ", valor);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] tabla1 = dimensionesArray(4, 3);
        double[][] tabla2 = dimensionesArray(3, 4);

        segundaArray(tabla1);
        segundaArray(tabla2);
    }
}
