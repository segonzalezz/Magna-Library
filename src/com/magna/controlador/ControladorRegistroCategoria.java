package com.magna.controlador;


import com.magna.excepciones.CategoriaDuplicadaException;
import com.magna.modelo.Categoria;
import com.magna.repository.CategoriaDao;
import javax.swing.JComboBox;

public class ControladorRegistroCategoria {
    
    private CategoriaDao categoriaDao;
    
    public ControladorRegistroCategoria() {
        categoriaDao = CategoriaDao.getInstancia();
    }
    
    public boolean registrarCategoria(Categoria categoria) throws CategoriaDuplicadaException {
        return categoriaDao.registrarCategoria(categoria); 
    }
    
    public Categoria obtenerCategoria(String id_categoria) {
        return categoriaDao.obtenerCategoria(id_categoria);
    }
    
    public boolean eliminarCategoria(String id_categoria) {
        return categoriaDao.eliminarCategoria(id_categoria);
    }
    
    public void cargarCategoriasComboBox(JComboBox<String> comboBox) {
        categoriaDao.mostrarCategoriaEnComboBox(comboBox);
    }
    
}
