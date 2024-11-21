import java.util.Scanner;

public class pruebaexamen {

    /**
     * 2 bucles:
     * el primero muestra los impares entre el 5 y el 40 de forma decreciente
     * el segundo hace la multiplicacion de los numeros pares de entre el 1 y el 10
     * (muestra el resultado fuera del bucle)
     */
    public static void bucles() {
        for (int i = 40; i >= 5; i--) { // va contando, empieza desde el 40 y va restando hasta el 5
            if (i % 2 != 0) { // comprueba si los numeros son impares
                System.out.printf("%d ", i);// muestra los impares
            }
        }
        double c = 1;
        for (int j = 1; j <= 10; j++) { // cuenta del 1 al 10
            if (j % 2 == 0) { // comprueba si son pares
                c = c * j; // multiplica los numeros
            }
        }
        System.out.println();//salto de linea
        System.out.println(c);// escribe el resultado
    }

    /**
     * calcula el cuadrado, el resto o devuelve un numero aleatorio dependiendo del
     * segundo numero que metas
     * 
     * @param num1 en el primer if recoge la base, en el segundo el multiplicando y
     *             el tercero el rango máximo del math.random
     * @param num2 en el primer if recoge el exponente, en el segundo el
     *             multiplicador
     * @return devuelve los resultados de las respectivas operaciones
     */
    public static int calculos(int num1, int num2) {
        int resultado = 1;
        if (num2 > 0) { // si num2 es positivo
            for (int i = 0; i < num2; i++) {// el contador se incrementa (empieza desde 0) mientras este sea menor que
                                            // num2
                resultado *= num1; // multiplica en num1 por si mismo hasta que el contador (i) sea mayor que el
                                   // exponente (num2)
            }
        }
        if (num2 < 0) { //si num2 es negativo
            resultado = num1 % ((+num2)); // hace la division del num1 entre el valor absoluto del num2
        }
        if (num2 == 0) { //si num2 es igual a 0
            resultado = 10 + (int) (Math.random() * (num1 - 10)); // numero aleatorio entre 10 y el num1 si el num2 es
                                                                  // positivo
            if (num1 < 10) { //si num2 es igual a 0 y además num1 es menor que 10
                resultado = 10 + (int) (Math.random() * (20 - 10)); // pero si el num1 es menor que 10 muestra un numero
                                                                    // aleatorio entre 10 y 20
            }
        }
        return resultado;
    }

    /**
     * recoge numeros y reliza su media o los suma
     * 
     * @param numeros   recoge el numero de numeros con el que se quiere operar
     * @param operacion recoge el tipo de operacion: media (true) / suma (false)
     * @return devuelve los resultados
     */

    public static double mediasOsumas(int numeros, boolean operacion) {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        double resultado = 0;
        double acu = 0;
        for (int i = 0; i < numeros; i++) {
            System.out.println("Dime un número");
            num = sc.nextDouble();//pide valor
            acu = acu + num; // suma los numeros a traves del acumulador
        }

        if (operacion == true) { //si el booleano es verdadero
            resultado = acu / numeros; // media division de la suma de los numeros (acu) entre la cantidad de numeros
                                       // (numeros)
        }
        if (operacion == false) { //si el booleano es falso
            resultado = acu; // suma
        }
        return resultado; //devolucion del tipo de resultado
    }

    /**
     * hace media piramide descendente con numeros del 1 al 10
     */
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
            System.out.println();
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
                    break;
                case 2:
                    System.out.println("Función cálculos seleccionada");
                    System.out.println("Dime un número");
                    int num1 = sc.nextInt();
                    System.out.println("Dime otro número");
                    int num2 = sc.nextInt();
                    System.out.println(calculos(num1, num2));
                    break;
                case 3:
                    System.out.println("Función sumaOcalculos seleccionda");
                    System.out.println("¿Cuántos números quieres poner?");
                    int numeros = sc.nextInt();
                    System.out.println(mediasOsumas(numeros, true));
                    break;
                case 4:
                    System.out.println("Función pirámide seleccionada");
                    piramide();
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