package programacion.arrays;

public class act2apuntes {

    public static double[][] dimensionesArray(int filas, int columnas) {
        double[][] tabla = new double[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = (int) (Math.random() * 10 + 20);
            }
        }
        return tabla;
    }

    public static void segundaArray(double[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            System.out.printf("%d", i);
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.printf("%3.2d", tabla[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double [][] tabla2 = dimensionesArray(8, 5);

        segundaArray(tabla2);
    }
}
