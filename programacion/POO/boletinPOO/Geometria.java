package programacion.POO.boletinPOO;

public class Geometria {

    private boolean figura;
    private double altura;
    private double base;

    public boolean getFigura(){
        return figura;
    }

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
        figura = false;
        this.altura = altura;
        this.base = base;
    }

    public Geometria(double base, double altura, boolean figura){
        this.figura = figura;
        figura = true;
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        double area2 = (getAltura() * getBase()) / 2;
        return area2;
    }

    public double perimetro() {
        double perimetro;
        if (figura == false) {
            perimetro = getAltura() + getBase() + diagonal();
            return perimetro;
        } else {
            perimetro = getBase() * 4;
        }
        return perimetro;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
    }

    public String tipo(){
        String figura2 = "";
        if (figura == true){
            figura2 = "Rectangulo";
        }
        if (figura == false){
            figura2 = "Triangulo";
        }
        return figura2;
    }
}
