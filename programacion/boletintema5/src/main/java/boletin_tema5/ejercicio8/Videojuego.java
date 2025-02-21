package boletin_tema5.ejercicio8;

import java.time.LocalDate;

public class Videojuego {

    public String titulo;
    public int year;
    public String fabricante;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.toUpperCase();
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante.toUpperCase();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1950) {
            LocalDate localDate = LocalDate.now();
            this.year = localDate.getYear();
        } else {
            this.year = year;
        }
    }

}
