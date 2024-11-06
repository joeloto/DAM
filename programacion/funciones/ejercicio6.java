import java.util.Scanner;

public class ejercicio6 {

    /**
     * apartado a
     * calcula una potencia
     * 
     * @param base      recoge el valor de la base
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

    /**
     * apartado b
     * muestra n numero de potencias de la base a
     * 
     * @param a recoge la base
     * @param n recoge el numero de potencias que se muestran
     */
    public static void numPotencias(double a, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(potencia(a, i));
        }
    }


    //TODO doc
    public static double sumaPotencias(double x, int n) {//TODO revisar y hacer acumulación
        double acu = 0;
        for (int i = 0; i <= n; i++) {
            acu = acu + potencia(x, i);
        }
        return acu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Dime un valor para la base");
        // double base = sc.nextDouble();
        // System.out.println("Dime un valor para el exponente");
        // int exponente = sc.nextInt();
        System.out.println("Dime un número");
        double a = sc.nextDouble();
        System.out.println("Dime otro número");
        int n = sc.nextInt();
        // System.out.println(potencia(base, exponente));
        // numPotencias(a, n);
        System.out.println(sumaPotencias(a, n));
    }
}
