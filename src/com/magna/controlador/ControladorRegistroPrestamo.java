package com.magna.controlador;

import com.magna.excepciones.PrestamoDuplicadoException;
import com.magna.modelo.Prestamo;
import com.magna.repository.PrestamoDao;

public class ControladorRegistroPrestamo {
    
    private PrestamoDao prestamoDao;
    
    public ControladorRegistroPrestamo(){
        prestamoDao = PrestamoDao.getInstancia();
    }
    
    public boolean registrarPrestamo(Prestamo prestamo) throws PrestamoDuplicadoException {
        return prestamoDao.registrarPrestamo(prestamo);
    }

    public boolean eliminarPrestamo(String id_prestamo) {
        return prestamoDao.eliminarPrestamo(id_prestamo);
    }
}
