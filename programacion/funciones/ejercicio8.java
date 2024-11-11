import java.util.Scanner;

public class ejercicio8 {

    /**
     * identifica si un número es primo o no
     * @param num recoge el número
     * @return devuelve true si es primo y false si no es primo
     */
    public static boolean primo(int num) {
        if (num == 1) {
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
        // System.out.println("Dime un número");
        int num;
        // System.out.println(primo(num));

        do {
            System.out.println("Dime un valor");
            num = sc.nextInt();
            if (num < 2) {
                System.out.println("Dame un valor mayor que 2");
            }
        } while (num < 2);

        for (int cont = num; cont >= 2; cont--) {
            if (primo(cont) == true) {
                if (cont != num) {
                    System.out.println(cont);
                }
            }
        }
    }
}
