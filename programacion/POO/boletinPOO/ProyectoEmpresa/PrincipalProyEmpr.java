package programacion.POO.boletinPOO.ProyectoEmpresa;

import java.util.*;

public class PrincipalProyEmpr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado();
        IUEmpleado iuEmpl = new IUEmpleado(empleado);
        Empleado empleado2 = new Empleado();
        IUEmpleado iuEmpl2 = new IUEmpleado(empleado2);
        Directivo directivo = new Directivo();
        IUDirectivo iuDir = new IUDirectivo(directivo);

        Empresa emp = new Empresa(directivo, empleado, empleado2);

        iuEmpl.pedir();
        iuEmpl2.pedir();
        iuDir.pedir();

        int opcion;
        System.out.println("Menú de opciones");
        System.out.println("----------------");
        System.out.println("1.- Mostrar datos de los empleados");
        System.out.println("2.- Mostar datos del directivo");
        System.out.println("3.- Modificar datos");
        System.out.println("4.- Pagar");
        System.out.println("5.- Cobrar");
        System.out.println("6.- Salir");
        System.out.println("Teclee opción (1-6)");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Pulsa 1 para mostrar los datos de un empleado");
                System.out.println("Pulsa 2 para mostrar los datos de ambos empleados");
                int opc3;
                opc3 = sc.nextInt();
                switch (opc3) {
                    case 1:
                        emp.iuEmpleado.mostrar();
                        break;
                    case 2:
                        emp.iuEmpleado.mostrar();
                        emp.iuEmpleado2.mostrar();
                    default:
                        break;
                }
                break;
            case 2:
                System.out.println("Datos del directivo:");
                emp.iuDirectivo.mostrar();
                break;
            case 3:
                int opc4;
                System.out.println("Menú de opciones");
                System.out.println("----------------");
                System.out.println("1.- Cambiar datos empleado");
                System.out.println("2.- Cambiar datos directivo");
                System.out.println("3.- Salir");
                System.out.println("Teclee opción (1-3)");
                opc4 = sc.nextInt();
                switch (opc4) {
                    case 1:
                        emp.iuEmpleado.pedir();
                        break;
                    case 2:
                        emp.iuDirectivo.pedir();
                        break;
                    case 3:
                        System.out.println("Hasta otra!");
                        break;
                }
                break;
            case 4:
                System.out.println("El beneficio de la empresa antes de pagar a los empleados es " + emp.getGanancias());
                System.out.println("Dime las ganancias de la empresa");
                double ganancias = sc.nextDouble();
                emp.setGanancias(ganancias);
                System.out.println("El beneficio de la empresa después de pagar a los empleados es de " + emp.getGanancias());
            case 5:
                System.out.println("El beneficio de la empresa antes del incremento es");
                System.out.println("Dime las ganancias de la empresa");
                double ganancias2 = sc.nextDouble();
                emp.setGanancias(ganancias2);
                System.out.println("Dime una cantidad para el incremento de ganancias");
                double incremento = sc.nextDouble();
                System.out.println("Las ganancias ascienden a " + emp.getGanancias() + incremento);
            case 6:
                System.out.println("Hasta otra!");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

    }
}
