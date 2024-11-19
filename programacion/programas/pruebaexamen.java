import java.util.Scanner;

public class pruebaexamen {
    public static void piramide() {
        // Bucle para manejar el número de filas (de 10 a 1)
        for (int i = 1; i <= 10; i++) {
            // Bucle interno para imprimir números en cada fila
            for (int j = 10; j >= i; j--) {
                System.out.print(j + " "); // Imprime el número con un espacio
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }

    public static void bucles(){
        for (int i = 40; i >= 5; i--) {
            if(i % 2 != 0){
                System.out.printf("%d ", i);
            }
        }
        for (int j = 1; j <= 10; j++) {
            double c = 1;
            if (j % 2 == 0) {
                c = c *j;
                System.out.println(c);
            }
        }
    }

    // public static int calculos(int num1, int num2){
    //     if (num2 > 0) {
    //         int resultado = num1^num2;
    //     }
    //     if (num2 < 0){
    //         int resultado = num1%num2;
    //     }
    //     return resultado;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.-Función bucles");
            System.out.println("2.-Funcion piramide");
            System.out.println("3.-");
            System.out.println("4.-");
            System.out.println("Teclee opción (1-4)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                bucles();
                break;
                case 2:
                piramide();
                break;
                case 3:
                break;
                case 4:
                System.out.println("Hasta otra!");
                break;
                default:
                System.out.println("Opción no válida.");
                break;
                }
        } while (opcion != 4);
    }
}