import java.util.Scanner;

public class Bol2_Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc;
        int num1;
        double num2;
        double num3;
        int num4;
        int num5;
        int and1;
        do {
            System.out.println("Menú de opciones\n");
            System.out.println("----------------");
            System.out.println("1.- Calcular cuadrado\n");
            System.out.println("2.- Numero inverso\n");
            System.out.println("3.- Raíz cuadrada\n");
            System.out.println("4.- Calcular un AND\n");
            System.out.println("5.- Calcular un OR\n");
            System.out.println("6.- Salir del programa\n");
            System.out.println("Teclee opción (1-6)");
            opc = sc.nextInt();
            switch (opc) {
                case 1: 
                    System.out.println("Dame el valor de un numero entero:");
                    num1 = sc.nextInt();
                    System.out.printf("El numero elevado al cuadrado es %.2f\n" , Math.pow(num1, 2));
                    continue;
                case 2: 
                    System.out.println("Dame un numero para calcular su inverso:");
                    num2 = sc.nextDouble();
                    while (num2==0){
                        System.out.println("No se admite el 0");
                        System.out.println("Dame un numero");
                        num2=sc.nextInt();
                    }
                    System.out.printf("El numero inverso es %.4f\n", num2 = 1/num2);
                    continue;
                case 3: 
                    System.out.println("Dame un numero para calcular su raiz cuadrada:");
                    num3 = sc.nextDouble();
                    while (num3<0){
                        System.out.println("Prueba con numero positivo o con 0");
                        System.out.println("Dame un numero");
                        num3=sc.nextInt();
                    } 
                    System.out.println("La raiz cuadrada es " +  (Math.sqrt(num3)));
                    continue; 
                case 4:
                    System.out.println("Dame un numero:");
                    num4 = sc.nextInt();
                    System.out.println("Dame otro numero:");
                    num5 = sc.nextInt();
                    and1 = num4 & num5;
                    System.out.printf("El resultado es %X%n", and1);
                    continue;
                
                case 5:
                    System.out.println("Dame un numero:");
                    num4 = sc.nextInt();
                    System.out.println("Dame otro numero:");
                    num5 = sc.nextInt();
                    and1 = num4 | num5;
                    System.out.printf("El resultado es %X%n", and1);
                continue;
                
                case 6:
                    System.out.println("Has salido del programa correctamente");
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opc != 6);

    }
}
    

