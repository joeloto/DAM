import java.util.Scanner;

public class Bol2_Ejer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int ab;
        int ba;

        System.out.println("Dame el valor del primer número");
        a = sc.nextInt();
        System.out.println("Dame el valor del segundo número");
        b = sc.nextInt();

        ab = a;// Reto: 3 lineas
        a = b;
        b = ab;
     

        System.out.println("El valor intercambiado del primer número es " + a + ".");
        System.out.println("El valor intercambiado del segundo número es " + b + ".");





    }
}
