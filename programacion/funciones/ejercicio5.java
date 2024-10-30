import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio5 {

    public static boolean bisiesto(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Dime un año");
        year = sc.nextInt();

        PrintWriter f = new PrintWriter("ejercicio5.txt");
    }
    
    
}
