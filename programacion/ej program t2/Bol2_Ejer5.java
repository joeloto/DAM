import java.util.Scanner;

public class Bol2_Ejer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;
        double celsius;
        double farenheit;
        double kelvin;
        do {
            System.out.println("Dime una cantidad de grados Celsius");
            celsius = sc.nextDouble();
            System.out.println("Menú de opciones");
            System.out.println("----------------");
            System.out.println("1.- Farenheit.");
            System.out.println("2.- Kelvin.");
            System.out.println("3.- Salir del menú\n");
            System.out.println("Teclee opción (1-3)");
            opc = sc.nextInt();
            switch (opc) {
                case 1: 
                    farenheit = (1.8*celsius) + 32;
                    System.out.printf("Los grados Celsius en Farenheit son %.2f\n", farenheit);
                    break;
                case 2: 
                    kelvin = celsius + 273.15;
                    System.out.printf("Los grados Celsius en Kelvin son %.2f\n", kelvin);
                    break;
                case 3: 
                    System.out.println("Hasta otra!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }                 
        } while (opc != 3);

    }
}
