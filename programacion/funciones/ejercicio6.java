import java.util.Scanner;

public class ejercicio6 {

    /**
     * calcula una potencia
     * @param base recoge el valor de la base
     * @param exponente recoge el valor del exponente
     * @return devuelve el resultado de la potencia
     */
    public static double potencia(double base, int exponente) {
        double potencia = 1;
        if (exponente < 0) {
            base = 1 / base;
            exponente = -exponente;
        }
        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }
        return potencia;
    }

    public static double numPotencias(double a, int n){
        Scanner sc  = new Scanner (System.in);
        // System.out.println("Dame un valor para la base");
        // double base = sc.nextDouble();
        // System.out.println("Dame un valor para el exponente");
        int exponente = sc.nextInt();
        for (int i = 0; i == n; i++) {
            potencia(a, exponente);
        }
        return potencia(a, exponente);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Dime un valor para la base");
        // double base = sc.nextDouble();
        // System.out.println("Dime un valor para el exponente");
        // int exponente = sc.nextInt();
        System.out.println("Dime un número");
        double a = sc.nextDouble();
        System.out.println("Dime el número de potencias que quieres que se muestren");
        int n = sc.nextInt();
        // System.out.println(potencia(base, exponente));
        System.out.println(numPotencias(a,n));
    }
}
