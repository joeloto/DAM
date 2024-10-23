import java.util.Scanner;

public class Bol2_Ejer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entero;
        double real;

        System.out.println("Dame un numero entero:");
        entero = sc.nextInt();
        System.out.println("Dame un numero real");
        real = sc.nextDouble();
        
        System.out.printf("El numero en decimal es %d en octal es %05o y en hexadecimal es %X", entero, entero, entero);
        System.out.printf("\nEl numero real es %7.3f", real);

    }

}
