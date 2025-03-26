package principal.ejercicio2;

public class Geometria {

    private boolean figura;
    private double altura;
    private double base;

    public boolean getFigura() {
        return figura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0){
            throw new IllegalArgumentException("No se permiten valores negativos");
        } else{
            this.altura = altura;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base < 0){
            throw new IllegalArgumentException("No se permiten valores negativos");
        } else{
            this.base = base;   
        }
    }

    public Geometria() {
        figura = false;
        setAltura(2);
        setBase(2);
    }

    public Geometria(double base, double altura) {
        figura = false;
        setAltura(altura);
        setBase(base);
    }

    public Geometria(double base, double altura, boolean figura) {
        this.figura = figura;
        // figura = true;
        setAltura(altura);
        setBase(base);
    }

    /**
     * calculo de area
     * @return devuelve el area
     */
    public double area() {
        double area2 = 0;
        if (figura == false) {
            area2 = (getAltura() * getBase()) / 2;
        } else {
            area2 = getAltura() * getBase();
        }
        return area2;
    }

    /**
     * calculo de perimetro
     * @return devuelve el perimetro
     */
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

    /**
     * tamaño de la diagonal
     * @return devuelve el tamaño de la diagonal
     */
    public double diagonal() {
        return Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getBase(), 2));
    }

    /**
     * identificacion del tipo de la figura
     * @return devuelve el tipo de figura
     */
    public String tipo() {
        String figura2 = "";
        if (figura == true) {
            figura2 = "rectángulo";
        } else {
            figura2 = "triángulo";
        }
        return figura2;
    }
}