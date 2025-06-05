package principal.ejercicio4;
 

public class Empleado extends Persona {
    private double salario;
    private double irpf;

    
    public Empleado(String nombre, String apellidos, int edad, String dni, double salario) {
        setNombre(nombre);
        setApellidos(apellidos);
        setEdad(edad);
        setDni(dni);
        setSalario(salario);
    }
    
    public Empleado() {
        this("", "", 0, "", 0);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

        if (salario < 6000) {
            irpf = 7.5;
        } else if (salario < 30000) {
            irpf = 15;
        } else {
            irpf = 20;
        }
    }

    public double getIrpf() {
        return irpf;
    }

    public double parteHacienda() {
        return salario * irpf / 100;
    }

    @Override
    public String firmaMail() {
        return getNombre() + " " + getApellidos();
    }
}
