package com.magna.repository;

import com.magna.excepciones.DevolucionDuplicadaException;
import com.magna.interfaces.DevolucionDaoInterface;
import com.magna.modelo.Devolucion;
import com.magna.superfunciones.SuperFuncionD;

public class DevolucionDao implements DevolucionDaoInterface{
    
    public static DevolucionDao INSTANCIA;
    
    private DevolucionDao(){
        
    }
    
    public static DevolucionDao getInstancia(){
       if(INSTANCIA == null){
           INSTANCIA  = new DevolucionDao();
       } 
       return INSTANCIA;
    }
    
    @Override
    public boolean registrarDevolucion(Devolucion devolucion) throws DevolucionDuplicadaException{
        SuperFuncionD superFuncionD = new SuperFuncionD();
        return superFuncionD.registrarDevolucion(devolucion);
    }
    
    @Override
    public boolean devolverPrestamo(String id_libro, String id_user) throws DevolucionDuplicadaException{
        SuperFuncionD superFuncionD = new SuperFuncionD();
        return superFuncionD.devolverPrestamo(id_libro, id_user);
    }
    
}
