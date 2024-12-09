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
        return base;
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
     //   figura = true;
        this.altura = altura;
        this.base = base;
    }

    public double area() {
        double area2 = 0;
        if (figura == false) {
            area2 = (getAltura() * getBase()) / 2;
        }else {
            area2 = getAltura() * getBase();
        }
        return area2;
    }

    public double perimetro() {
        double perimetro;
        if (figura == false) {
            perimetro = getAltura() + getBase() + diagonal();
            return perimetro;
        } else {
            perimetro = (getBase() * 2) + (getAltura() * 2);
        }
        return perimetro;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
    }

    public String tipo(){
        String figura2 = "";
        if (figura == true){
            figura2 = "rectángulo";
        }else{
            figura2 = "triángulo";
        }
        return figura2;
    }
}
