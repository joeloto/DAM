package ejercicio2.geometria;

import ejercicio2.interfaz.Libreria;

public class Linea extends Figura{
    private Punto puntoFinal;

    public void setPuntoFinal(Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }

    @Override
    public void pedirDatos() {
        super.pedirDatos();
        System.out.println("Dime los puntos");
        System.out.println("Primer punto");
        double p1 = Libreria.pedirDouble();
        double p2 = Libreria.pedirDouble();
        puntoFinal = new Punto(p1,p2);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Punto final: " + puntoFinal);
    }

    public Linea(Punto p1, Punto p2){
        super(p1,"linea");
        this.puntoFinal = p2;
    }

    public Linea() {
        this(new Punto(0,0), new Punto(1,1));
    }


}
