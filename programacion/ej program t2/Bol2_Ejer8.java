import java.util.Scanner;

public class Bol2_Ejer8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;
        double num3;
        double max; 
        

        System.out.println("Dame el valor del primer numero");
        num1 = sc.nextDouble();
        System.out.println("Dame el valor del segundo numero");
        num2 = sc.nextDouble();
        System.out.println("Dame el valor del tercer numero");
        num3 = sc.nextDouble();

        if (num1>=num2){
            max = num1;
        } else{
            max = num2;
        } 
        
        if (max < num3){
           
            max = num3;
        }
        System.out.println("El mayor es " + max);
    }
}
