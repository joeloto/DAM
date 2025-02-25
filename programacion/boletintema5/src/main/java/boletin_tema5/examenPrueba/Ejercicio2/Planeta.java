package boletin_tema5.examenPrueba.Ejercicio2;

public class Planeta extends Astro{

    public boolean habitabilidad;

    public Planeta(String nombre, double radio, boolean habitabilidad) {
        super(nombre,radio);
        this.habitabilidad = habitabilidad;
    }

    public Planeta() {
        this("",0,false);
    }

    public void muestraDatos(){
        super.muestraDatos();
        System.out.println(habitabilidad);
    }
}
