package Controlador;

import Excepciones.UsuarioDuplicadoException;
import Modelo.Usuario;
import Repository.UsuarioDao;
import javax.swing.JLabel;

public class ControladorRegistroUsuario {

    private UsuarioDao usuarioDao;

    public ControladorRegistroUsuario() {
        usuarioDao = UsuarioDao.getInstancia();
    }

    public boolean registrarU(Usuario usuario) throws UsuarioDuplicadoException {
        if (!usuarioDao.comprobarU(usuario.getCed_persona())) {
            throw new UsuarioDuplicadoException("El usuario ya existe en la base de datos");
        }
        return usuarioDao.registrarU(usuario);
    }

    public Usuario obtenerU(String ced_persona) {
        return usuarioDao.obtenerU(ced_persona);
    }

    public boolean eliminarU(String ced_persona) {
        return usuarioDao.eliminarU(ced_persona);
    }
    
    public void imprimirInformacionUsuarioRegistrado (JLabel nombreU, JLabel edadU, JLabel cedulaU, JLabel direccionU, JLabel usuarioU, JLabel rolU, String usuario){
        usuarioDao.imprimirInformacionUsuarioRegistrado(nombreU, edadU, cedulaU, direccionU, usuarioU, rolU, usuario);
    }
}
