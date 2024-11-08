import java.util.Scanner;

public class ejercicio8 {
    
    public static boolean primo(int num){
        if (num == 1){
            return false;
        }
        
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número");
        int num;
        //System.out.println(primo(num));
        
        do{
            System.out.println("Dime un valor");
            num = sc.nextInt();
            if (num < 2) {
                System.out.println("Dame un valor mayor que 2");
            }
        }while (num < 2);
    }
}

    