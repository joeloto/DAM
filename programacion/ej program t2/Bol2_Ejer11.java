import java.util.Scanner;

public class Bol2_Ejer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acu = 0;
        int cont = 0;
        int n1 = 10000;
        int n = 0;

        while (acu < n1) {
            cont = cont + 1;
            acu = acu + cont;
            // System.out.println(acu);
        }
         
            n = cont;
            System.out.println("El valor de n es " + n);
       

    }
}
