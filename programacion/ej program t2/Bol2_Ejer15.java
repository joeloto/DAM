import java.util.Scanner;

public class Bol2_Ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;
        double euros;
        double libras;
        double pasar;

        do {
            System.out.println("\nBienvenido al convesor de libras a euros (y viceversa)");
            System.out.println("--------------------------------------------------------");
            System.out.println("Opciones:");
            System.out.println("Pulsa 1 para convertir de euros a libras");
            System.out.println("Pulsa 2 para convertir de libras a euros");
            System.out.println("Pulsa 3 para salir");
            System.out.println("--------------------------------------------------------");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Dime los euros que quieres convertir a libras");
                    euros = sc.nextDouble();
                    while (euros < 0) {
                        System.out.println("Prueba con una cantidad positiva");
                        euros = sc.nextDouble();
                    }
                    pasar = euros * 0.83121754;
                    System.out.printf("La cantidad en libras son %.2f\n ", pasar);
                    continue;
                case 2:
                    System.out.println("Dime los euros que quieres convertir a libras");
                    libras = sc.nextDouble();
                    while (libras < 0) {
                        System.out.println("Prueba con una cantidad positiva");
                        libras = sc.nextDouble();
                    }
                    pasar = libras * 1.2029288;
                    System.out.printf("La cantidad en euros son %.2f\n ", pasar);
                    continue;
                case 3:
                    System.out.println("Has salido correctamente\n");
                    break;
                default:
                    System.out.println("Escoge una opción de las indicadas\n");
                    continue;        
            }
        } while (opc != 3);

    }
}
