package Controlador;

import Repository.SesionDao;

public class ControladorInicioSesion {
    private SesionDao sesionDao;
    
    public ControladorInicioSesion(){
    sesionDao =  SesionDao.getInstancia();
    }
    
    public boolean verificacionUsuario(String usuarioU, String contrasenaU){
        return sesionDao.verificacionUsuario(usuarioU, contrasenaU);
    }
}
