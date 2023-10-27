package com.magna.controlador;

import com.magna.excepciones.PrestamoDuplicadoException;
import com.magna.excepciones.StockInsuficienteException;
import com.magna.modelo.Prestamo;
import com.magna.repository.PrestamoDao;

public class ControladorRegistroPrestamo {
    
    private PrestamoDao prestamoDao;
    
    public ControladorRegistroPrestamo(){
        prestamoDao = PrestamoDao.getInstancia();
    }
    
    public boolean registrarPrestamo(Prestamo prestamo) throws PrestamoDuplicadoException, StockInsuficienteException {
        return prestamoDao.registrarPrestamo(prestamo);
    }

    public boolean eliminarPrestamo(String id_prestamo) {
        return prestamoDao.eliminarPrestamo(id_prestamo);
    }
}
