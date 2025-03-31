package principal.ejercicio1;

class WrongParametersException extends StringIndexOutOfBoundsException{
    public WrongParametersException(String texto){
        super(texto);
    }
}
