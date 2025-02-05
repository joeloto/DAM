package programacion.arrays.boletin;

public class Matriz {
    
    int[][] matriz;

    public Matriz(int n){
        matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 11);
            }
        }
    }

    public static void mostrar(int[][] matriz){
        
        System.out.println("   ");
        for (int i = 0; i < matriz[0].length; i++) {
            System.out.printf("%7d", i);
        }
        System.out.println();
        int contFilas = 0;
        for (int[] fila : matriz) {
            System.out.printf("%3d", contFilas);
            contFilas++;
            for (int num : fila) {
                System.out.printf("%7d", num);
            }
        }
    }

    
}
