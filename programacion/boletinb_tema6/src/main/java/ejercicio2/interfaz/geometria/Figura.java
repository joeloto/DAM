package ejercicio2.interfaz.geometria;

public class Figura {
    public Punto origen;
    public String nombre;

    public Punto getOrigen() {
        return origen;
    }
    public void setOrigen(Punto origen) {
        this.origen = origen;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre.trim().toUpperCase();
    }
    
    public Figura(Punto origen, String nombre){
        setNombre(nombre);
        setOrigen(origen);
    }

    public Figura(){
        this(new Punto(0,0),"");
    }
    
}
