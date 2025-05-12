package pruebas.ejercicio1;

public class Potencia {
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
}
