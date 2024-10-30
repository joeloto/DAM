import java.util.Scanner;

public class ejercicio3 {

    public static double pedirDato(String dato) {
        Scanner sc = new Scanner(System.in);
        double dato1;
        while (true) {
            System.out.println("Dame el valor de " + dato);
            dato1 = sc.nextInt();
            if (dato1 > 0) {
                break;
            }
            else{
                System.out.println("Dame un valor positivo");
            }
        }
        return dato1;
    }

    public static double superf(double radio, double altura) {
        return 2 * Math.PI * radio * altura;
    }

    public static void mostrarDato(String msg, double superficie1) {
        System.out.printf("%.3f", superficie1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        double radio = pedirDato("radio");//pide valor con la primera funcion
        double altura = pedirDato("altura");//pide valor con la primera funcion
        double superficie = superf(radio, altura);//hace el calculo con la segunda funcion
        mostrarDato("La superficie es " , superficie);//muestra el resultado con la tercera funcion

    }
}
