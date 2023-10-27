package com.magna.controlador;

import com.magna.excepciones.DevolucionDuplicadaException;
import com.magna.modelo.Devolucion;
import com.magna.repository.DevolucionDao;

public class ControladorDevolucion {
    
    private DevolucionDao devolucionDao;
    
    public ControladorDevolucion(){
        devolucionDao = DevolucionDao.getInstancia();
    }
    
    public boolean registrarDevolucion(Devolucion devolucion) throws DevolucionDuplicadaException {
        return devolucionDao.registrarDevolucion(devolucion);
    }
    
    public boolean devolverPrestamo(String id_libro, String id_user) throws DevolucionDuplicadaException{
        return devolucionDao.devolverPrestamo(id_libro, id_user);
    }
}
