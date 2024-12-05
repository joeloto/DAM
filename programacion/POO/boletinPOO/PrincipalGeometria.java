package programacion.POO.boletinPOO;

public class PrincipalGeometria {
    public static void main(String[] args) {

        Geometria g = new Geometria();
        Geometria geo = new Geometria(4, 2, true);

        System.out.println();
        System.out.printf("El perimetro del %s son %.1f cm.\n", g.tipo(), g.perimetro());
        System.out.printf("El perimetro del %s son %.1f cm.\n\n", geo.tipo(), geo.perimetro());
        System.out.printf("El area del %s son %.1f cm2.\n", g.tipo(), geo.area());
        System.out.printf("El area del %s son %.1f cm2.\n\n", geo.tipo(), geo.area());
        System.out.printf("La diagonal del %s son %.1f cm.\n", g.tipo(), g.diagonal());
        System.out.printf("La diagonal del %s son %.1f cm.\n\n", geo.tipo(), geo.diagonal());
    }
}
