package Controlador;


import Excepciones.CategoriaDuplicadaException;
import Modelo.Categoria;
import Repository.CategoriaDao;
import javax.swing.JComboBox;

public class ControladorRegistroCategoria {
    
    private CategoriaDao categoriaDao;
    
    public ControladorRegistroCategoria() {
        categoriaDao = CategoriaDao.getInstancia();
    }
    
    public boolean registrarCategoria(Categoria categoria) throws CategoriaDuplicadaException {
        if (!categoriaDao.comprobarCategoria(categoria.getId_categoria())) {
            throw new CategoriaDuplicadaException("La categoria ya existe en la base de datos");
        }
        return categoriaDao.registrarCategoria(categoria);
    }
    
    public Categoria obtenerCategoria(String id_categoria) {
        return categoriaDao.obtenerCategoria(id_categoria);
    }
    
    public boolean eliminarCategoria(String id_categoria) {
        return categoriaDao.eliminarCategoria(id_categoria);
    }
    
    public void cargarCategoriasComboBox(JComboBox<String> comboBox) {
        categoriaDao.mostrarCategoriasEnComboBox(comboBox);
    }
    
}
