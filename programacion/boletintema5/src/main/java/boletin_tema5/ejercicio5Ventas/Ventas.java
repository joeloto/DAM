package boletin_tema5.ejercicio5Ventas;

import java.time.LocalDate;

public class Ventas {
    public int[] vector = new int[12];
    private int year;
    LocalDate fechaActual = LocalDate.now();

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= fechaActual.getYear()) {
            this.year = year - 1;
        } else {
            this.year = year;
        }
    }

    public Ventas(int year) {
        for (int i = 0; i < this.vector.length; i++) {
            this.vector[i] = (int) (Math.random() * 1000);
        }
        setYear(year);
    }

    public Ventas(int year, int[] vector) {
        setYear(year);
        this.year = year;
        this.vector = vector;
        if (vector.length != 12) {
            int[] vector2 = new int[12];
            for (int i = 0; i < vector2.length; i++) {
                vector2[i] = (int) (Math.random() * 1000);
            }
            this.vector = vector2;
        }
    }

    /**
     * funcion que calcula la media de los valores de un vector
     * @return devuelve el resultado de la media
     */
    public double media() {
        double acumulador = 0;
        int cont;
        for (cont = 0; cont < vector.length; cont++) {
            acumulador += vector[cont];
        }
        return acumulador / cont;
    }

    
    public void grafica(){
        System.out.println("Año " + year + ":");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 100 && vector[i] >= 10) {
                System.out.printf("Mes %2d %s(%d): ", i," ", vector[i]);
            }
            if (vector[i] > 100) {
                System.out.printf("Mes %2d (%d): ", i, vector[i]);
            }
            if (vector[i] < 10) {
                System.out.printf("Mes %2d %s%s(%d): ",i," "," ", vector[i]);
            }
            for (int j = 0; j < vector[i]; j+=100) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    public void grafica2(){
        System.out.println("Año " + year + ":");
        for (int i = 0; i < vector.length; i++) {
          
            System.out.printf("Mes %2d %5s): ", i, "("+vector[i]);
           
            for (int j = 0; j < vector[i]; j+=100) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
