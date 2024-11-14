// a) Realizar un método que permita hallar el área de un rectángulo o de un
// triángulo rectángulo a partir de la base, la altura y un parámetro booleano
// (denominado bandera, flag o interruptor) para decidir si se trata de un rectángulo o
// un triángulo. Es decir, si se pasa como parámetro true hace el cálculo del área de
// un rectángulo, si se pasa false calcula el del triángulo.
// Devuelve el área. Parámetros del método: base, altura y la bandera.

// b) En el main codificar un menú clásico con las siguientes opciones:
// • Area de un triángulo (base*altura/2)
// • Area de un rectángulo (base*altura)
// • Area de un cuadrado (lado*lado)
// • Area de un círculo (Pi*radio 2)
// • Salir

// Las tres primeras opciones deben realizarse utilizando el método creado en el
// apartado anterior (por supuesto, sin modificarlo). Para la cuarta debe crearse
// un nuevo método con parámetro radio.


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

    /**
     * función calcula el área de un círculo
     * @param radio recoge el valor del radio
     * @return devuelve el cálculo del área
     */
    public static double circulo(double radio){
        return Math.PI * (Math.pow(radio, 2));
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
            System.out.println("Pulsa 5 para salir del programa");
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
                    System.out.printf("El área del cuadrado es %.2f", area(true, lado, lado));
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
                    System.out.printf("El área del círculo es %.2f", circulo(radio));
                    System.out.println();
                    break;
                    case 5:
                    System.out.println("Has salido del programa correctamente. ¡Hasta otra!");
                    break;
                default:
                    System.out.println("Escoge una opción de las indicadas");
                    System.out.println();
                    break;
            }
        } while (opc != 5);

    }

}
