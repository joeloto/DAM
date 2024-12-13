package programacion.POO.boletinPOO.ProyectoEmpresa;
import java.util.*;

public class PrincipalEmpresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado empleado = new Empleado();
        IUEmpleado iu = new IUEmpleado(empleado);

        iu.pedir();

        System.out.println("Dime un número del 1 al 5");
        int opc = sc.nextInt();
        iu.mostrar(opc);


    }
}
