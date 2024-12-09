package programacion.POO.boletinPOO;

public class Fecha {
    
    private int dia;
    private int mes;
    private int year;

    public int getDia(){
        return dia;
    }

    public int setDia(int dia){
        if (dia < 1 || dia > 31) {
            return 1;
        }
        return dia;
    }

    public int getMes(int dia){
        return mes;
    }

    public int setMes(int mes){
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        return mes;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public Fecha(){
        setDia(17);
        setMes(12);
        setYear(2003);
    }

    public Fecha(int mes, int dia, int year){
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public String fechaFormateada(boolean cadena){
        String cadena2 = "";
        if (cadena == true) {
            cadena2 = dia + "/" + "/" + year;
        } else{
            
        }
        return cadena2;
    }
}
