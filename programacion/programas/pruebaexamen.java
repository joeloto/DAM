import java.util.Scanner;

public class pruebaexamen {

    public static void bucles() {
        for (int i = 40; i >= 5; i--) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
        double c = 1;
        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                c = c * j;
            }
        }
        System.out.println(c);
    }

    /**
     * 
     * @param num1 en el primer if recoge la base, en el segundo el multiplicando y
     *             el tercero el rango máximo del math.random
     * @param num2 en el primer if recoge el exponente, en el segundo el
     *             multiplicador
     * @return devuelve los resultados de las respectivas operaciones
     */
    public static int calculos(int num1, int num2) {
        int resultado = 1;
        int acu = 0;
        if (num2 > 0) {
            for (int i = 0; i < num2; i++){
                
            }
        }
        if (num2 < 0) {
            resultado = num1 % (+(num2));
        }
        if (num2 == 0) {
            resultado = 10 + (int) (Math.random() * (num1 - 10));
            if (num1 < 10) {
                resultado = 10 + (int) (Math.random() * (20 - 10));
            }
        }
        return resultado;
    }

    public static double mediasOsumas(int numeros, boolean operacion) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        double resultado = 0;
        double acu = 0;
        for (int i = 0; i < numeros; i++) {
            System.out.println("Dime un número");
            num = sc.nextDouble();
            acu = acu + num;
        }

        if (operacion == true) {
            resultado = acu  / numeros;
        }
        if (operacion == false) {
            resultado = acu;
        }
        return resultado;
    }

    public static void piramide() {
        for (int i = 1; i <= 10; i++) { // numero de filas
            for (int j = 11 - i; j >= 1; j--) { // imprimir numeros por fila
                System.out.printf("%3d", j);// imprime numeros separados por un espacio
            }
            System.out.println(); // saltar linea al final de fila
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.-Función bucles");
            System.out.println("2.-Función cálculos");
            System.out.println("3.-Función mediaOsumas");
            System.out.println("4.-Funcion pirámide");
            System.out.println("5.-Salir");
            System.out.println("Teclee opción (1-5)");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Función bucles seleccionada");
                    bucles();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Función cálculos seleccionada");
                    System.out.println("Dime un número");
                    int num1 = sc.nextInt();
                    System.out.println("Dime otro número");
                    int num2 = sc.nextInt();
                    System.out.println(calculos(num1, num2));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Función sumaOcalculos seleccionda");
                    System.out.println(mediasOsumas(3, true));
                    break;
                case 4:
                    System.out.println("Función pirámide seleccionada");
                    piramide();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Hasta otra!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 5);
    }
}