import java.util.Scanner;

public class ejercicio10 {

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
        do {
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 1 para calcular la base de un rectángulo");
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 2 para calcular la base de un triángulo");
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 3 para calcular la base de un cuadrado");
            System.out.println("-----------------------------------------------");
            System.out.println("Pulsa 4 para calcular la base de un cículo");
            System.out.println("-----------------------------------------------");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    do {
                        System.out.println("Dame un valor para la base");
                        base = sc.nextInt();
                        System.out.println("Dame un valor para la altura");
                        altura = sc.nextInt();
                        if (altura < 0 || base < 0) {
                            System.out.println("Dame un valor positivo");
                        }
                    } while (base < 0 || altura < 0);
                    System.out.printf("El área del rectángulo es %.2f", area(true, base, altura));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    break;
            }
        } while (opc != 4);
        // System.out.printf("El área del rectángulo es %.2f.", area(true, base,
        // altura));

    }

}
