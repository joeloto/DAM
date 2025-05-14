package pruebas.ejercicio2;

public class WrongParametersException extends StringIndexOutOfBoundsException{
    public WrongParametersException(String texto){
        super(texto);
    }
}
