package programacion.POO.boletinPOO;

public class Geometria {

    private boolean figura;
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Geometria() {
        figura = false;
        setAltura(2);
        setBase(2);
    }

    public Geometria(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        double area2 = (getAltura() * getBase()) / 2;
        return area2;
    }

    public double perimetro() {
        double perimetro;
        if (figura = false) {
            perimetro = getAltura() + getBase();
            return perimetro;
        } else {
            perimetro = getBase() * 4;
        }
        return perimetro;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
    }
}
