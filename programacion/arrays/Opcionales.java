package programacion.arrays;

public class Opcionales {
    public static int suma(int... numeros) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++)
            // Puede usarse un for mejorado
            resultado += numeros[i];
        return resultado;
    }

    public static void main(String[] args) {
        int x = 5;
        int total = suma(2, -45, x, 5 * x);
        System.out.println(total);
        System.out.println(suma(12, -2, 54, 1, 81));
        System.out.println(suma(3, 6, 21));
    }
}
