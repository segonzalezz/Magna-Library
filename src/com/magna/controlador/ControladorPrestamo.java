package com.magna.controlador;

import com.magna.repository.DevolucionDao;

public class ControladorPrestamo {
    
    private DevolucionDao devolucionDao;
    
    public ControladorPrestamo(){
        devolucionDao = DevolucionDao.getInstancia();
    }
    
    public boolean devolverPrestamo(String id_libro, String id_user){
        return devolucionDao.devolverPrestamo(id_libro, id_user);
    }
}
