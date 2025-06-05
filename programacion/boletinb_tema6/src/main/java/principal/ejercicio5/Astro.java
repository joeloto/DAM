package principal.ejercicio5;

public class Astro {
    private String nombre;
    private double radio;

    public String getNombre() {
        return nombre;
    }

    public String getNombre(char c) {
        String definitivo = "";
            for (int i = 0; i < nombre.length(); i++) {
                definitivo += nombre.charAt(i) + c;//Quitar el último
            }
        return definitivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre.toUpperCase().trim(); 
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        if (radio < 0) {
            throw new RadioNegativoException();
        }
        this.radio = radio;
    }

    public Astro(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == this.getClass() && this.getNombre() == ((Astro)obj).getNombre()) {//Comparar getNombre de ambas
            return true; 
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("El nombre es %s y el radio es de %.2f",getNombre(),this.radio);
    }
}
