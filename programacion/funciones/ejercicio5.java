import java.io.PrintWriter;
import java.util.Scanner;

public class ejercicio5 {

    public static boolean bisiesto(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        int year;
        System.out.println("Dime un año");
        year = sc.nextInt();
        PrintWriter f = new PrintWriter("ejercicio5.txt");

       f.println((bisiesto(year)== true) ? year + " Es bisiesto " : year + " No es bisiesto ");
        for (int cont = year; cont <= 2024; cont++) {
            if (bisiesto(cont) == true){
                if (cont != year){
                   f.println(cont);
                }
            }
        }
        f.close();

        //TODO lectura del archivo

    }
    
    
}
