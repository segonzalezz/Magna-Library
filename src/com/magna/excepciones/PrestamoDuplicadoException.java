package Excepciones;

public class PrestamoDuplicadoException extends Exception{
    
    public PrestamoDuplicadoException(String mensaje){
        super(mensaje);
    }
}
