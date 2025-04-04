
import java.util.*;

public class IUEmpleado {
    Scanner sc = new Scanner(System.in);

    public Empleado empleado;

    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    // mostra
    public void mostrar() {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Apellidos: " + empleado.getApellidos());
        System.out.println("Edad: " + empleado.getEdad());
        System.out.println("DNI: " + empleado.getDni());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("IRPF: " + empleado.getIrpf());
    }

    public void pedir() {
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime unos apellidos");
        String apellidos = sc.nextLine();
        System.out.println("Dime una edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime un dni");
        String dni = sc.nextLine();
        System.out.println("Dime un salario");
        double salario = sc.nextDouble();

        empleado.setNombre(nombre);
        empleado.setApellidos(apellidos);
        empleado.setEdad(edad);
        empleado.setDni(dni);
        empleado.setSalario(salario);
    }

    public void mostrar(int opc) {
        switch (opc) {
            case 1:
                System.out.println("Nombre y apellidos: " + empleado.getNombre() + empleado.getApellidos());
                break;
            case 2:
                System.out.println("Edad: " + empleado.getEdad());
                break;
            case 3:
                System.out.println("DNI: " + empleado.getDni());
                break;
            case 4:
                System.out.printf("El salario es %.0f y el IRPF es del %.2f %%\n" , empleado.getSalario() , empleado.getIrpf());
                break;
            case 5:
                System.out.println("Hacienda se lleva: " + empleado.parteHacienda());
            default:
                break;
        }
    }

    // pedir a usuario
    /// Empleado e = newEmpleado()
    /// IUEmpleado iue = new IUEmpleado(e);
    /// iue.mosrtrar()
}