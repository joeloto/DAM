import java.util.Scanner;
public class basico3 {
    public static void main (String args[]) {

    int num1;
    int num2;
    int num3;
    int num4;
    int suma;
    int cociente;
    int resto;
    Scanner sc = new Scanner(System.in); 

    System.out.println("Bienvenido al programa para realizar una suma y una division");
    System.out.println("Primer vamos a realizar la suma.");
    System.out.println(("Dime el valor del primer numero:"));
    num1 = sc.nextInt();
    System.out.println("Dime el valor del segundo numero:");
    num2 = sc.nextInt();
    suma = (num1+num2);
    System.out.println("El resultado de la suma es "+ suma +".");
    System.out.println("Ahora vamos con la division");
    System.out.println(("Dime el valor del Dividendo:"));
    num3 = sc.nextInt();
    System.out.println(("Dime el valor del divisor:"));
    num4 = sc.nextInt();
    cociente = (num3/num4);
    resto = (num3%num4);
    System.out.println("El resultado del cociente es "+ cociente +".");
    System.out.println("El resultado del resto es "+ resto +".");
    System.out.println("\nGracias por jugar :)");

    }
}    