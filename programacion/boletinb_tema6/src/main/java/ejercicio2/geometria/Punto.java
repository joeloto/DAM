package ejercicio2.geometria;

public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this(0, 0);
    }

    @Override
    public String toString(){
        return "(" + x + ";" + y + ")";
    }
}
