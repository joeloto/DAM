package programacion.POO;

public class Pelota {
    
    public String tipo;
    private double radio;

    public Pelota(){
        tipo = "playa";
        radio = 40;
    }

    public Pelota(String tipo, int radio){
        this.tipo = tipo;
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public void inflar(){
        radio ++;
    }

    public void inflar(int n){
        radio += n;
    }

}
