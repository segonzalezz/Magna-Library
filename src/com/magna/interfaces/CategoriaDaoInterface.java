    package com.magna.interfaces;

import com.magna.excepciones.CategoriaDuplicadaException;
import com.magna.modelo.Categoria;
import javax.swing.JComboBox;

public interface CategoriaDaoInterface {
    
    boolean registrarCategoria(Categoria categoria) throws CategoriaDuplicadaException;
    Categoria obtenerCategoria(String id_categoria);
    boolean eliminarCategoria(String id_categoria);
    void mostrarCategoriaEnComboBox(JComboBox<String> comboBox);
        
}
