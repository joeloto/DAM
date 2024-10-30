import java.util.Scanner;

public class ejercicio4 {

    public static boolean bisiesto(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        do{
            do{
        System.out.println("Si es bisiesto saldrá true si no saldrá false");
        year = sc.nextInt();
        System.out.println(bisiesto(year));
            } while (year != 0);
        } while (year != 0);
    }
}
