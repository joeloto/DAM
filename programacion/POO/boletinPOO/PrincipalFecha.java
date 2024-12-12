package programacion.POO.boletinPOO;
import java.util.*;

public class PrincipalFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fecha fecha = new Fecha();
        Fecha f = new Fecha();//TODO pedir datos a usuri

        System.out.println("Primera fecha:");
        System.out.println("Día:");
        int dia = sc.nextInt();
        System.out.println("Mes:");
        int mes = sc.nextInt();
        System.out.println("Año:");
        int year = sc.nextInt();

        System.out.println("Segunda fecha:");
        System.out.println("Día:");
        int dia2 = sc.nextInt();
        System.out.println("Mes:");
        int mes2 = sc.nextInt();
        System.out.println("Año:");
        int year2 = sc.nextInt();

        fecha.setDia(dia);
        fecha.setMes(mes);
        fecha.setYear(year);

        f.setDia(dia2);
        f.setMes(mes2);
        f.setYear(year2);

        System.out.println();
        System.out.println(fecha.fechaFormateada(false));
        System.out.println(fecha.fechaFormateada(true));
        System.out.println();
        System.out.println(f.fechaFormateada(false));
        System.out.println(f.fechaFormateada(true));
        System.out.println();
        System.out.println("La diferencia entre años es " + Fecha.DifYear(f,fecha));
        
    }
    

    


}
