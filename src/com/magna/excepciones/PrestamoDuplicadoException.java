package com.magna.excepciones;

public class PrestamoDuplicadoException extends Exception{
    
    public PrestamoDuplicadoException(String mensaje){
        super(mensaje);
    }
}
