import java.util.Scanner;

public class ejercicio3 {

    /**
     * recoge el dato mientras sea positivo
     * 
     * @param dato recoge dato
     * @return devuelve el dato una vez que es positivo
     */
    public static double pedirDato(String dato) {
        Scanner sc = new Scanner(System.in);
        double dato1;
        do { 
            System.out.println("Dame el valor de " + dato);
            dato1 = sc.nextInt();

            if (dato1 < 0) {
                System.out.println("Dame un valor positivo");
            }

        } while (dato1 < 0);
        return dato1;
    }

    /**
     * calcula la superficie del cilindro
     * 
     * @param radio  recoge el valor del radio
     * @param altura recoge el valor de la altura
     * @return devuelve la operación de la superficie
     */
    public static double superf(double radio, double altura) {
        return 2 * Math.PI * radio * altura;
    }

    /**
     * muestra el mensaje y el resultado de la superfice
     * 
     * @param msg         recoge el mensaje
     * @param superficie1 recoge el valor de la superficie
     */
    public static void mostrarDato(String msg, double superficie1) {
        System.out.printf(" %s  %.3f", msg, superficie1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radio = pedirDato("radio");// pide valor con la primera funcion
        double altura = pedirDato("altura");// pide valor con la primera funcion
        double superficie = superf(radio, altura);// hace el calculo con la segunda funcion
        mostrarDato("La superficie es ", superficie);// muestra el resultado con la tercera funcion

    }
}
