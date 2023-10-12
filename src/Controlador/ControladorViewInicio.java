package Controlador;

import Singleton.Singleton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControladorViewInicio {
    
    public void mostrarCategoriasEnComboBox(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("Seleccionar");
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT id_categoria, nom_categoria FROM categoria";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id_categoria = resultSet.getString("id_categoria");
                    String nom_categoria = resultSet.getString("nom_categoria");
                    String[] partes = id_categoria.split(" - ");
                    if (partes.length > 0) {
                        String id = partes[0];
                        String Nombre = id + " - " + nom_categoria;
                        comboBox.addItem(Nombre);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
    
    public void mostrarLibrosPorCategoriaEnTabla(JComboBox<String> comboBox, JTable tabla) {
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = comboBox.getSelectedItem().toString();
                if (!seleccion.equals("Seleccionar")) {
                    String[] partes = seleccion.split(" - ");
                    String id_categoria = partes[0];
                    llenarTablaLibrosPorCategoria(id_categoria, tabla);
                }
            }
        });
    }
    
    private void llenarTablaLibrosPorCategoria(String id_categoria, JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT tit_libro, aut_libro FROM libro WHERE cod_categoria = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, id_categoria);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String tit_libro = resultSet.getString("tit_libro");
                    String aut_libro = resultSet.getString("aut_libro");
                    modelo.addRow(new Object[]{tit_libro,aut_libro});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
    
}
