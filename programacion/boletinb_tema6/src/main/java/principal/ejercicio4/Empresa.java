package principal.ejercicio4;

public class Empresa {
    
    private double ganancias;
    private Directivo directivo;
    private Empleado empleado;
    private Empleado empleado2;
    public IUDirectivo iuDirectivo;
    public IUEmpleado iuEmpleado;
    public IUEmpleado iuEmpleado2;

    public double getGanancias(){
        return ganancias;
    }

    public void setGanancias(double ganancias){
        this.ganancias = ganancias;
    }

    public Empresa(Directivo directivo, Empleado empleado, Empleado empleado2){
        this.directivo = directivo;
        this.empleado = empleado;
        this.empleado2 = empleado2;
        iuDirectivo = new IUDirectivo(directivo);
        iuEmpleado = new IUEmpleado(empleado);
        iuEmpleado2 = new IUEmpleado(empleado2);
    }

    public Empresa(Directivo directivo, Empleado empleado, Empleado empleado2, double ganancias){
        this.directivo = directivo;
        this.empleado = empleado;
        this.empleado2 = empleado2;
        iuDirectivo = new IUDirectivo(directivo);
        iuEmpleado = new IUEmpleado(empleado);
        iuEmpleado = new IUEmpleado(empleado2);
        setGanancias(ganancias);
    }
}
