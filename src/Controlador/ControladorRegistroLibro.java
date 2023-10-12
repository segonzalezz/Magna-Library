package Controlador;
import Excepciones.LibroDuplicadoException;
import Modelo.Libro;
import Repository.LibroDao;
import javax.swing.JComboBox;

public class ControladorRegistroLibro {
    
    private LibroDao libroDao;
    
    public ControladorRegistroLibro(){
        libroDao = LibroDao.getInstancia();
    }
    
    public boolean registrarLibro(Libro libro) throws LibroDuplicadoException{
       if(!libroDao.comprobarLibro(libro.getId_libro())){
           throw new LibroDuplicadoException("El libro ya existe en la base de datos");
       }
       return libroDao.registrarLibro(libro);
    }
    
    public Libro obtenerLibro(String id_libro){
        return libroDao.obtenerLibro(id_libro);
    }
    
    public boolean eliminarLibro(String id_libro){
        return libroDao.eliminarLibro(id_libro);
    }
    
    public void mostrarLibrosComboBox(JComboBox<String> comboBox){
        libroDao.mostrarLibrosEnComboBox(comboBox);
    }
    
    public boolean actualizarStockLibro(String id_libro, int can_stock){
        return libroDao.actualizarStockLibro(id_libro, can_stock);
    }
    
    public boolean devolverLibro(String id_libro){
        return libroDao.devolverLibro(id_libro);
    }
    
}
