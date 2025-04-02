package ejercicio2.geometria;

public class Circunferencia extends Figura{
    
    public double radio;

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    if (radio < 0){
        throw new IllegalArgumentException("El radio no puede ser negativo");
    }
}
