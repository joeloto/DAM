package programacion.arrays.boletin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalVentas {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(""); 

        int[] vector = new int[12];
        
        if (args.length == 0){
            file = new File("ventas.txt");
        } else{
            file = new File(args[0]);
        }
        if (file.exists()){
            Scanner f = new Scanner(file);
            String linea1;
            String linea2;
            linea1 = f.nextLine();
            int year = Integer.parseInt(linea1);
            linea2 = f.nextLine();
            String[] datos = linea2.split(";");
            int[] lista = new int[datos.length];
            Ventas v = new Ventas(year, lista);
            f.close();
        } else{
            LocalDate fechaActual = LocalDate.now(); 
            Ventas ventas = new Ventas(fechaActual.getYear() -1);
            System.out.print("Gráfico de ventas: ");
            ventas.grafica2();
            System.out.printf("La media de los datos es: %.2f", ventas.media());
            PrintWriter e = new PrintWriter("ventas"+ ventas.getYear() + ".txt");
            e.println(ventas.getYear());
            for (int i = 0; i < vector.length; i++) {
                e.printf("%d; ",vector[i]);
            }
            e.close();
        }
    }
}
