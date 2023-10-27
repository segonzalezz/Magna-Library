package com.magna.interfaces;

import com.magna.excepciones.LibroDuplicadoException;
import com.magna.excepciones.StockInsuficienteException;
import com.magna.modelo.Libro;
import javax.swing.JComboBox;

public interface LibroDaoInterface {
    
    boolean registrarLibro(Libro libro) throws LibroDuplicadoException;
    Libro obtenerLibro(String id_libro);
    boolean eliminarLibro(String id_libro);
    void mostrarLibrosEnComboBox(JComboBox<String> comboBox);
    boolean actualizarStockLibro(String id_libro, int can_stock) throws StockInsuficienteException;
//    boolean devolverLibro(String id_libro);
    
}
