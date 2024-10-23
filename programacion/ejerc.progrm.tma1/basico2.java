import java.util.Scanner;
public class basico2 {
    public static void main (String args[]) {

    int num1;
    int num2;
    int resultado;
    Scanner sc = new Scanner(System.in); 

    System.out.println("Hola, este es un programa para realizar una suma.");
    System.out.println("Dime el valor del primer numero:");
    num1 = sc.nextInt();
    System.out.println("Dime el valor del primer numero:");
    num2 = sc.nextInt();
    resultado = (num1+num2);
    System.out.println("El resultado de la suma es "+ resultado +" .");
    
    }
}            