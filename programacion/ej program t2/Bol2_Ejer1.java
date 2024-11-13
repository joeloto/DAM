import java.util.*;
public class Bol2_Ejer1 {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

int opcion;
do {
System.out.println(Menú de opciones);
System.out.println(----------------);
System.out.println(1.-);
System.out.println(2.- );
System.out.println(3.-);
System.out.println(4.-);
System.out.println(Teclee opción (1-4));
opcion = sc.nextInt();
switch ( opcion) {
case 1:
break;
case 2:
break;
case 3:
break;
case 4:
System.out.println(Hasta otra!);
break;
default:
System.out.println(Opción no válida.);
break;
}
} while (opcion != 4);
    }
}