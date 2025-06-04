package principal.ejercicio5;

import java.util.ArrayList;

public class Planeta extends Astro{
    private boolean gaseoso;
    public ArrayList<Astro> satelites;

    public boolean isGaseoso() {
        return gaseoso;
    }

    public void setGaseoso(boolean gaseoso) {
        this.gaseoso = gaseoso;
    }

    public Planeta(boolean gaseoso, String nombre, double radio) {
        this.gaseoso = gaseoso;
        this.satelites = new ArrayList<>();
        setNombre(nombre);
        setRadio(radio);
    }

    public Planeta() {
        this(false, "", 0);
    }
}
