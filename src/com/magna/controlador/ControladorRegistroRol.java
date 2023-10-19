package Controlador;


import Excepciones.RolDuplicadoException;
import Modelo.Rol;
import Repository.RolDao;
import javax.swing.JComboBox;

public class ControladorRegistroRol {

    private RolDao rolDao;

    public ControladorRegistroRol() {
        rolDao = RolDao.getInstancia();
    }

    public boolean registrarRol(Rol rol) throws RolDuplicadoException {
        if (!rolDao.comprobarRol(rol.getId_rol())) {
            throw new RolDuplicadoException("El rol ya existe en la base de datos");
        }
        return rolDao.registrarRol(rol);
    }

    public Rol obtenerRol(String id_rol) {
        return rolDao.obtenerRol(id_rol);
    }

//    public boolean modificarRol(Rol rol) {
//        return rolDao.modificarRol(rol);
//    }
    
    public boolean eliminarRol(String id_rol){
        return rolDao.eliminarR(id_rol);
    }
    
    public void cargarRolesComboBox(JComboBox<String>comboBox){
        rolDao.mostrarRolesEnComboBox(comboBox);
    }
    
    public void cargarRolesComboBoxSinAdmi(JComboBox<String>comboBox){
        rolDao.mostrarRolesEnComboBoxSinAdmi(comboBox);
    }

}
