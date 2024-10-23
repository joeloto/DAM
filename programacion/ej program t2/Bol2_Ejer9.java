import java.util.Scanner;

public class Bol2_Ejer9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intro1;
        int num;
        int contador = 0;
        int maximo = Integer.MIN_VALUE;

        System.out.println("¿Cuántos números quieres introducir?");
        intro1 = sc.nextInt();

        while (contador != intro1) {
            System.out.println("Dame un número");
            num = sc.nextInt();
            contador = contador + 1;
            if (num > maximo) {
                maximo = num;
            }

        }
        System.out.println("El numero máximo es " + maximo);

    }
}
