import java.util.Scanner;

public class Bol2_Ejer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int cont1 = 1; cont1 <= 50; cont1++) {
            System.out.println("El primer contador es " + cont1);
        }
        System.out.println("----------------------------------------------------------------------");

        for (int cont2 = 50; cont2 > 0; cont2 = cont2 - 1) {
            System.out.println("El segundo contador es " + cont2);
        }
        System.out.println("----------------------------------------------------------------------");

        for (int cont3 = 2; cont3 < 20; cont3++) {
            if (cont3 % 2 == 0){
                System.out.println("El tercer contador es " + cont3);
            }
        }
        System.out.println("----------------------------------------------------------------------");

        for (int cont4 = 90; cont4 <=130; cont4++){
            if (cont4 % 2 !=0){
                System.out.println("El cuarto contador es " + cont4);    
            }
        }
        System.out.println("----------------------------------------------------------------------");
        
        for (int cont5 = 70; cont5 >= 25; cont5 = cont5 - 1){
            if (cont5 % 5 == 0){
                System.out.println("El quinto contador es " + cont5);
            }
        }

    }

}
