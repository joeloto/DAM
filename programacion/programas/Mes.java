import java.util.*;
    public class Mes {
        public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroMes;
        String cadenaMes;
        System.out.println("Introduce un número de mes (1-12)");
        numeroMes=sc.nextInt();
        
        switch (numeroMes) {
        case 1: cadenaMes = "Enero";
        break;
        case 2: cadenaMes = "Febrero";
        break;
        case 3: cadenaMes = "Marzo";
        break;
        case 4: cadenaMes = "Abril";
        break;
        case 5: cadenaMes = "Mayo";
        break;
        case 6: cadenaMes = "Junio";
        break;
        case 7: cadenaMes = "Julio";
        break;
        case 8: cadenaMes = "Agosto";
        break;
        case 9: cadenaMes = "Septiembre";
        break;
        case 10:cadenaMes = "Octubre";
        break; 
        }
    }
}

