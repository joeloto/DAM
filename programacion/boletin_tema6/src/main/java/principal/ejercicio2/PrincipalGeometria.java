package principal.ejercicio2;

import java.util.Scanner;

public class PrincipalGeometria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Geometria g = new Geometria();
        Geometria geo = new Geometria(4, 2, true);

        System.out.println("Dame la base del triangulo");
        double basetr = sc.nextDouble();
        System.out.println("Dame la altura del triangulo");
        double alturatr = sc.nextDouble();

        System.out.println();
        g.setBase(basetr);
        g.setAltura(alturatr);

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
