package areas.app;

import areas.milibreria.Areas;
import areas.milibreria.InterfazUsuario;

//import entornos.*;

public class Principal {
    public static void main(String[] args) {
        InterfazUsuario iu = new InterfazUsuario();
        double lado;
        double area;

        System.out.println("Vamos a calcular el área de un pentágono");
        lado = iu.pideRealPositivo("Introduce el lado (debe ser positivo)");

        area = Areas.pentagonoRegular(lado);
    }
}
