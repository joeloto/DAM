import java.util.Scanner;

public class ejercicio10 {

    /**
     * calculo de la base de un rectángulo o de un triángulo
     * @param flag recoge el tipo de área
     * @param base recoge el valor de la base
     * @param altura recoge el valor de la altura
     * @return devuelve el cálculo del área
     */
    public static double area(boolean flag, int base, int altura) {
        double area2 = 0;
        if (flag == true) {
            area2 = base * altura;
        }
        if (flag == false) {
            area2 = (base * altura) / 2;
        }
        return area2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        int opc;
        int lado;
        int radio;
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 1 para calcular la base de un rectángulo");
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 2 para calcular la base de un triángulo");
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 3 para calcular la base de un cuadrado");
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 4 para calcular la base de un círculo");
            System.out.println("-----------------------------------------------");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Has seleccionado hacer el área de un rectángulo");
                    do {
                        System.out.println("Dame un valor para la base");
                        base = sc.nextInt();
                        System.out.println("Dame un valor para la altura");
                        altura = sc.nextInt();
                        if (altura < 0 || base < 0) {
                            System.out.println("Dame valores positivo");
                        }
                    } while (base < 0 || altura < 0);
                    System.out.printf("El área del rectángulo es %.2f", area(true, base, altura));
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Has seleccionado hacer el área de un triángulo");
                    do {
                        System.out.println("Dame un valor para la base");
                        base = sc.nextInt();
                        System.out.println("Dame un valor para la altura");
                        altura = sc.nextInt();
                        if (altura < 0 || base < 0) {
                            System.out.println("Dame valores positivos");
                        }
                    } while (base < 0 || altura < 0);
                    System.out.printf("El área del rectángulo es %.2f", area(false, base, altura));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Has seleccionado hacer el área de un cuadrado");
                    do {
                        System.out.println("Dame un valor para los lados");
                        lado = sc.nextInt();
                        if (lado < 0) {
                            System.out.println("Dame valores positivos");
                        }
                    } while (lado < 0);
                    System.out.printf("El área del cuadrado es %.2f", Math.pow(lado, 2));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Has seleccionado hacer el área de un círculo");
                    do {
                        System.out.println("Dame un valor para el radio");
                        radio = sc.nextInt();
                        if (radio < 0) {
                            System.out.println("Dame un valor positivo");
                        }
                    } while (radio < 0);
                    System.out.printf("El área del círculo es %.2f", Math.PI * (Math.pow(radio, 2)));
                    System.out.println();
                    break;
                default:
                    System.out.println("Escoge una opción de las indicadas");
                    System.out.println();
                    break;
            }
        } while (opc != 4);

    }

}
