package com.magna.interfaces;

import com.magna.excepciones.PrestamoDuplicadoException;
import com.magna.modelo.Prestamo;

public interface PrestamoDaoInterface {
    
    boolean registrarPrestamo(Prestamo prestamo) throws PrestamoDuplicadoException;
    boolean eliminarPrestamo(String id_prestamo);
}
