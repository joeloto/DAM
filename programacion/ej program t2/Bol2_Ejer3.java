import java.util.Scanner;

public class Bol2_Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int cont = 0;
        int acu = 0;

        System.out.println("Dime un numero:");
        num = sc.nextInt();

        if (num>0){
            while (cont<num){
                cont = cont + 1;
                acu = acu + cont;
              System.out.println("Contador: " + cont);    
                
                
            }
            System.out.println("Acumulador: " + acu);    
        }else {
            System.out.println("Prueba otra vez con un numero positivo");
        }    






        







    }
}
