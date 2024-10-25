import java.util.Scanner;

public class ejercicio3 {
    
    
    public static double pedirDato(double dato){
        Scanner sc = new Scanner(System.in);
        int dato2;
        do{
            System.out.println("Dame un valor real");
            dato2 = sc.nextInt();
         }while (dato2 < 0);
        return dato;
    }
    
    // public static double superf(double radio, double altura){

    // }
}
