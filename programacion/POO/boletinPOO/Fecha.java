package programacion.POO.boletinPOO;

public class Fecha {

    private int dia;
    private int mes;
    private int year;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Fecha() {
        setDia(17);
        setMes(12);
        setYear(2003);
    }

    public Fecha(int mes, int dia, int year) {//TODO pueden entrar valores erróneos
        setDia(dia);
        setMes(mes);
        setYear(year);
    }

    public String fechaFormateada(boolean cadena) {
        String cadena2 = "";
        if (cadena == true) {
            cadena2 = dia + "/" + mes + "/" + year;
        } else {
            switch (mes) {
                case 1:
                    cadena2 = "enero";
                    break;
                case 2:
                    cadena2 = "febrero";
                    break;
                case 3:
                    cadena2 = "marzo";
                    break;
                case 4:
                    cadena2 = "abril";
                    break;
                case 5:
                    cadena2 = "mayo";
                    break;
                case 6:
                    cadena2 = "junio";
                    break;
                case 7:
                    cadena2 = "julio";
                    break;
                case 8:
                    cadena2 = "agosto";
                    break;
                case 9:
                    cadena2 = "septiembre";
                    break;
                case 10:
                    cadena2 = "octubre";
                    break;
                case 11:
                    cadena2 = "noviembre";
                    break;
                case 12:
                    cadena2 = "diciembre";
                    break;
            }
            cadena2 = dia + " de " + cadena2 + " de " + year;
        }
        return cadena2;
    }

    public static int DifYear(Fecha fecha1, Fecha fecha2){
        int resta = Math.abs(fecha1.getYear()-fecha2.getYear());//TODO valor abs
        return resta;
    }
}
