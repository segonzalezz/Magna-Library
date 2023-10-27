package com.magna.interfaces;

import com.magna.excepciones.DevolucionDuplicadaException;
import com.magna.modelo.Devolucion;

public interface DevolucionDaoInterface {
    
    boolean registrarDevolucion(Devolucion devolucion) throws DevolucionDuplicadaException;
    boolean devolverPrestamo(String id_liro, String id_user) throws DevolucionDuplicadaException;
}
