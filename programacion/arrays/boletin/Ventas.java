package programacion.arrays.boletin;

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
        if (vector.length != 12) {
            int[] vector2 = new int[12];
            for (int i = 0; i < vector2.length; i++) {
                vector2[i] = (int) (Math.random() * 1000);
            }
            this.vector = vector2;
        }
    }

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

    }
}
