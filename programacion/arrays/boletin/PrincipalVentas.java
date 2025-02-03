package programacion.arrays.boletin;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalVentas {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("ventas.txt");

        Scanner f = new Scanner(new File("ventas.txt"));

        int[] vector = new int[12];

        if (file.exists()){
            String a;
            while (f.hasNext()) {
                a = f.nextLine();
                int n = Integer.parseInt(a);
                Ventas v = new Ventas(2003, vector);
                for (int i = 0; i < vector.length; i++) {
                    vector[i] = n;
                }
            }
        } else{
            LocalDate fechaActual = LocalDate.now(); 
            Ventas ventas = new Ventas(fechaActual.getYear() -1);
            System.out.print("Gráfico de ventas: ");
            ventas.grafica();
            System.out.printf("La media de los datos es: %.2f", ventas.media());
        }

        
    }
}
