package programacion.POO.boletinPOO.ProyectoEmpresa;

import java.util.Set;

public class Empleado {
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private double salario;
    private double irpf;

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getDni(){
        return dni;
    }
    public void setDni(String dni){
        this.dni = dni;
    }

    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;

        if (salario < 6000) {
            irpf = 7.5;
        } else if (salario >= 6000 && salario < 30000) {
            irpf = 15;
        } else{
            irpf = 20;
        }
    }

    public double getIrpf(){
        return irpf;
    }

    public Empleado(){
        this.nombre = " ";
        this.apellidos = " ";
        this.dni = " ";
        this.salario = 0;
        this.irpf = 0;
        this.edad = 0;
    }

    public Empleado(String nombre,String apellidos,int edad,String dni,double salario,double irpf){
        setNombre("Gerardo");
        setApellidos("Bolsón de Magallanes");
        setEdad(64);
        setDni("95478234Q");
        setSalario(29999);
    }

    public double atracoHacienda(){
        double dineroAtraco = 0;
        if (salario < 6000) {
           dineroAtraco =  salario * 0.075;
        } else if (salario >= 6000 && salario < 30000) {
            dineroAtraco =  salario * 0.15;
        } else{
            dineroAtraco =  salario * 0.2;
        }
        return dineroAtraco;
    }
    
}
