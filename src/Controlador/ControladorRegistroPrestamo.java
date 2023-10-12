package Controlador;

import Excepciones.PrestamoDuplicadoException;
import Modelo.Prestamo;
import Repository.PrestamoDao;

public class ControladorRegistroPrestamo {
    
    private PrestamoDao prestamoDao;
    
    public ControladorRegistroPrestamo(){
        prestamoDao = PrestamoDao.getInstancia();
    }
    
    public boolean registrarPrestamo(Prestamo prestamo) throws PrestamoDuplicadoException {
        if (!prestamoDao.comprobarPrestamo(prestamo.getId_prestamo())) {
            throw new PrestamoDuplicadoException("El alquiler ya existe en la base de datos");
        }
        return prestamoDao.registrarPrestamo(prestamo);
    }

    public boolean eliminarPrestamo(String id_prestamo) {
        return prestamoDao.eliminarPrestamo(id_prestamo);
    }
}
