import java.util.*;

public class Positivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.print("Dime un número entero: ");
        numero = sc.nextInt();
        System.out.println();
        if (numero > 0) {
            System.out.println("El número es positivo");
        }
    }
}