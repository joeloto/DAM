import java.util.Scanner;

public class Bol2_Ejer14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int cont1 = 0;
        int cont2 = 0;

        System.out.println("Dame un numero:");
        num = sc.nextInt();

        while (num != 0){
            System.out.println("Dame un numero:");
            num = sc.nextInt();
            cont1++;
            if (num<0){
                cont2++;
            }
            
        }
        cont1=cont1-1;
        System.out.println("Se introdujeron " + cont1 + " números de los cuales " + cont2 + " son negativos");



    }
}
