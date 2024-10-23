import java.util.Scanner;

public class Bol2_Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Dime el valor del primer numero:");
        n1 = sc.nextInt();
        System.out.println("Dime el valor del segundo numero:");
        n2 = sc.nextInt();
        if (n1 > n2) {
            System.out.println("El primer numero es mayor.");
        } else if (n1 < n2) {
            System.out.println("El segundo numero es mayor.");
        } else {
            System.out.println("Los numeros son iguales.");
        }

        if (n1 % n2 == 0) {
            System.out.println("Los numeros son multiplos");
        }

        if (n1 % n2 != 0) {
            System.out.println("Los numeros no son multiplos");
        }
    }

}
