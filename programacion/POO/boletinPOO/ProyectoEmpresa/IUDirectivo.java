package programacion.POO.boletinPOO.ProyectoEmpresa;

import java.util.Scanner;

public class IUDirectivo {
    Scanner sc = new Scanner(System.in);

    public Directivo directivo;

    public IUDirectivo(Directivo directivo) {
        this.directivo = directivo;
    }
    
    public void mostrar() {
        System.out.println("Nombre: " + directivo.getNombre());
        System.out.println("Apellidos: " + directivo.getApellidos());
        System.out.println("Edad: " + directivo.getEdad());
        System.out.println("DNI: " + directivo.getDni());
        System.out.println("Departamento: " + directivo.getDepartamento());
        System.out.println("Porcentaje beneficios: " + directivo.getBeneficios());
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
        System.out.println("Dime el nombre del departamento");
        String departamento = sc.nextLine();
        System.out.println("Dime el porcentaje de los beneficios");
        double beneficios = sc.nextDouble();

        directivo.setNombre(nombre);
        directivo.setApellidos(apellidos);
        directivo.setEdad(edad);
        directivo.setDni(dni);
        directivo.setDepartamento(departamento);
        directivo.setBeneficios(beneficios);
    }

    public void mostrar(int opc) {
        double beneficiosDirectivo = 0;
        switch (opc) {
            case 1:
                System.out.println("Nombre y apellidos: " + directivo.getNombre() + directivo.getApellidos());
                break;
            case 2:
                System.out.println("Edad: " + directivo.getEdad());
                break;
            case 3:
                System.out.println("DNI: " + directivo.getDni());
                break;
            case 4:
                System.out.println("El departamento es: " + directivo.getDepartamento());
                break;
            case 5:
                System.out.println("El directivo se lleva: " + directivo.beneficioTotal(beneficiosDirectivo));
            default:
                break;
        }
    }
}
