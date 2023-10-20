package com.magna.controlador;

import com.magna.excepciones.UsuarioDuplicadoException;
import com.magna.modelo.Usuario;
import com.magna.repository.UsuarioDao;
import javax.swing.JLabel;

public class ControladorRegistroUsuario {

    private UsuarioDao usuarioDao;

    public ControladorRegistroUsuario() {
        usuarioDao = UsuarioDao.getInstancia();
    }

    public boolean registrarU(Usuario usuario) throws UsuarioDuplicadoException {
        return usuarioDao.registrarUsuario(usuario);
    }

    public Usuario obtenerU(String ced_persona) {
        return usuarioDao.obtenerUsuario(ced_persona);
    }

    public boolean eliminarU(String ced_persona) {
        return usuarioDao.eliminarUsuario(ced_persona);
    }
    
    public void imprimirInformacionUsuarioRegistrado (JLabel nombreU, JLabel edadU, JLabel cedulaU, JLabel direccionU, JLabel usuarioU, JLabel rolU, String usuario){
        usuarioDao.imprimirInformacionUsuarioRegistrado(nombreU, edadU, cedulaU, direccionU, usuarioU, rolU, usuario);
    }
}
