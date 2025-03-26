//VALIDADO
package principal.ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipalGeometria {
    public static void main(String[] args) {// TODO try
        Scanner sc = new Scanner(System.in);

        Geometria g = new Geometria();
        Geometria geo = new Geometria(4, 2, true);
        double basetr = 0;
        double alturatr = 0;
        boolean error;

        do {
            error = false;
            try {
                System.out.println("Dame la base del triangulo");
                basetr = sc.nextDouble();
                System.out.println("Dame la altura del triangulo");
                alturatr = sc.nextDouble();
                g.setBase(basetr);
                g.setAltura(alturatr);
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Introduce un número válido");
                error = true;
                sc.nextLine();
            }
        } while (error);

        System.out.println();

        System.out.printf("La base del %s es %.0f\n", g.tipo(), g.getBase());
        System.out.printf("La altura del %s es %.0f\n\n", g.tipo(), g.getAltura());
        System.out.printf("La base del %s es %.0f.\n", geo.tipo(), geo.getBase());
        System.out.printf("La altura del %s es %.0f.\n\n", geo.tipo(), geo.getAltura());
        System.out.printf("El perímetro del %s son %.1f cm.\n", g.tipo(), g.perimetro());
        System.out.printf("El perímetro del %s son %.1f cm.\n\n", geo.tipo(), geo.perimetro());
        System.out.printf("El área del %s son %.1f cm2.\n", g.tipo(), geo.area());
        System.out.printf("El área del %s son %.1f cm2.\n\n", geo.tipo(), geo.area());
        System.out.printf("La diagonal del %s son %.1f cm.\n", g.tipo(), g.diagonal());
        System.out.printf("La diagonal del %s son %.1f cm.\n\n", geo.tipo(), geo.diagonal());
    }
}
