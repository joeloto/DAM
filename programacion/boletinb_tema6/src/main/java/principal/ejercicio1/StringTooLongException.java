package principal.ejercicio1;

class StringTooLongException extends IllegalArgumentException{
    
    public StringTooLongException(){
        super("Cadena demasiado larga");
    }
}
