package programacion.POO.boletinPOO.ProyectoEmpresa;

import java.util.*;;

public class IUEmpleado {
    Scanner sc = new Scanner(System.in);

    public Empleado empleado;

    public IUEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    // mostra
    public void mostrar() {
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellidos());
        System.out.println(empleado.getEdad());
        System.out.println(empleado.getDni());
        System.out.println(empleado.getSalario());
        System.out.println(empleado.getIrpf());
    }

    public void pedir() {
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();
        System.out.println("Dime unos apellidos");
        String apellidos = sc.nextLine();
        System.out.println("Dime una edad");
        int edad = sc.nextInt();
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
                System.out.println("Salario e IRPF: " + empleado.getSalario() + empleado.getIrpf());
            case 5:
                System.out.println("Hacienda se lleva: " + empleado.atracoHacienda());
            default:
                break;
        }
    }

    // pedir a usuario
}
/// Empleado e = newEmpleado()
/// IUEmpleado iue = new IUEmpleado(e);
/// iue.mosrtrar()