package principal;

public class Mosca extends Animal {
    public Mosca() {
        this.nombreCientifico = "Drosophila Melanogaster";
    }

    @Override
    public void muestraDatos() {
        super.muestraDatos();
        System.out.printf("Sin embargo las moscas no tienen edad\n");
    }
}
