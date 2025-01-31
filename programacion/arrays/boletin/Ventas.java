package programacion.arrays.boletin;

import java.time.LocalDate;

public class Ventas {
    public int[] vector = new int[13];
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
        if (vector.length != 13) {
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
        int acumulador = 0;
        int cont;
        for (cont = 0; cont < vector.length; cont++) {
            acumulador += vector[cont];
        }
        double media = acumulador / cont;
        return media;
    }

    public void grafica(){
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] < 100) {
                System.out.printf("Mes %2d %s(%d): ", i," ", vector[i]);
            }
            if (vector[i] > 100) {
                System.out.printf("Mes %2d (%d): ", i, vector[i]);
            }
            for (int j = 0; j < vector[i]; j+=100) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
