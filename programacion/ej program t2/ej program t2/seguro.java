import java.util.*;

public class seguro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int seguro;
        int carnet;

        System.out.println("El precio inicial del seguro es de 300 euros");
        seguro = 300;
        System.out.println("Dime tu edad:");
        edad = sc.nextInt();
        System.out.println("Dime tus años con el carnet:");
        carnet = sc.nextInt();
        if (edad < 21) {
            System.out.println("El seguro es de " + (seguro + 100) + " euros.");
        } else if (carnet > 10) {
            System.out.println("El seguro es de " + (seguro - 30) + " euros.");
        } else {
            System.out.println("El seguro es de 300 euros");
        }
    }
}
