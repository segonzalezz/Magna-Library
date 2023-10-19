package com.magna.interfaces;

import com.magna.excepciones.RolDuplicadoException;
import com.magna.modelo.Rol;
import javax.swing.JComboBox;

public interface RolDaoInterface {
    
    boolean registrarRol(Rol rol)throws RolDuplicadoException;
    boolean eliminarR(String id_rol);
    Rol obtenerRol(String id_rol);
    void mostrarRolesEnComboBox(JComboBox<String> comboBox);
    void mostrarRolesEnComboBoxSinAdmi(JComboBox<String> comboBox);
    
}
