package ejercicio2.geometria;

import ejercicio2.interfaz.Libreria;

public class Circunferencia extends Figura {

    public double radio;

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new IllegalArgumentException("El radio no puede ser negativo");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public Circunferencia(Punto punto, double radio) {
        super(punto,"circunferencia");
        setRadio(radio);
    }

    public Circunferencia() {
        this(new Punto(0,0),1);
    }

    @Override
    public void pedirDatos() {
        System.out.println("Dime el radio");
        radio = Libreria.pedirDouble();
        super.pedirDatos();
    }
    
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Radio: " + radio);
    }
}
