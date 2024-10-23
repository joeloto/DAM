import java.util.Scanner;

public class Bol2_Ejer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;
        double media;
        double acu = 0;
        int cont = 0;    
        
        System.out.println("Dame un numero");
        num = sc.nextInt();
        
        while (num!=0){
            System.out.println("Dame un numero");
            num = sc.nextInt();
            acu = acu + num;
            cont= cont + 1;
            System.out.println(cont);
                
        }
        cont=cont-1;
        media = (acu/cont);
        System.out.println("La media es " + media);

        }
}
