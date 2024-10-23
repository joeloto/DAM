import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = 12.652845;
        int n2 = 43;
        System.out.println("El numero real es " + n1 + "y el entero " + n2);
        System.out.printf("El numero real es %.2f y el entero %X\n", n1, n2);
    }
}
