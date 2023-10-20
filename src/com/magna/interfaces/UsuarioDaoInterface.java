package com.magna.interfaces;

import com.magna.excepciones.UsuarioDuplicadoException;
import com.magna.modelo.Usuario;
import javax.swing.JLabel;

public interface UsuarioDaoInterface {
    
    boolean registrarUsuario(Usuario usuario) throws UsuarioDuplicadoException;
    Usuario obtenerUsuario(String id_usuario);
    boolean eliminarUsuario(String id_usuario);
    void imprimirInformacionUsuarioRegistrado(JLabel nombreU, JLabel edadU, JLabel cedulaU, JLabel direccionU, JLabel usuarioU, JLabel rolU, String usuario);
    
}
