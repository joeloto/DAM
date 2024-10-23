import java.util.Scanner;

public class Bol2_Ejer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int acu1 = 0;
        int acu2 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int opc;

        // for (int i = 1; i < 100; i++) {
        // if (i % 5 == 0){
        // acu1 = acu1 + i;
        // cont1 = i;
        // }
        // }
        // System.out.println("Contador: " + cont1);
        // System.out.println("Acumulador " + acu1);

        do {
            do {
                System.out.println("Dime un número");
                num = sc.nextInt();
            } while (num > 50 || num < 1);

            for (int i = 0; i <= 100; i++) {
                if (i % num == 0) {
                    acu2 = acu2 + i;
                    cont2 = i;
                    System.out.println("Contador: " + cont2);
                }
            }
            System.out.println("Acumulador: " + acu2);

            System.out.println("Pulsa 1 para probar otra vez");
            System.out.println("Pulsa 0 para salir");
            opc = sc.nextInt();

        } while (opc != 0);
    }
}
