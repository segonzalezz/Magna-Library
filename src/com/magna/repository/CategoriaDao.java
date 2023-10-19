package Repository;

import Excepciones.CategoriaDuplicadaException;
import Modelo.Categoria;
import Singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class CategoriaDao {
    
    private static CategoriaDao INSTANCIA;

    private CategoriaDao() {
    }

    public static CategoriaDao getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new CategoriaDao();
        }
        return INSTANCIA;
    }
    
     public boolean registrarCategoria(Categoria categoria) throws CategoriaDuplicadaException {
        Connection conexion = null;
        try {
            if (!comprobarCategoria(categoria.getId_categoria())) {
                return false;
            }
            conexion = Singleton.getInstancia().conectar();
            String insertQuery = "INSERT INTO categoria (id_categoria, nom_categoria) VALUES (?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, categoria.getId_categoria());
            preparedStatement.setString(2, categoria.getNom_categoria());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new CategoriaDuplicadaException("Error al registrar el categoria");       
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
     
     public boolean comprobarCategoria(String id_categoria) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT id_categoria FROM categoria WHERE id_categoria = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, id_categoria);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
     
     public Categoria obtenerCategoria(String id_categoria) {
        Categoria categoria = null;
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT * FROM categoria WHERE id_categoria = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, id_categoria);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String nom_categoria = resultSet.getString("nom_categoria");
                    categoria = new Categoria(id_categoria, nom_categoria);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return categoria;
    }
     
    public boolean eliminarCategoria(String id_categoria) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String query = "DELETE FROM categoria WHERE id_categoria = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setString(1, id_categoria);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            } else {
                System.out.println("No se encontró ninguna categoria con codigo: " + id_categoria + " en la base de datos");
                return false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return false;
    }
    
    public void mostrarCategoriasEnComboBox(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("Selecionar");
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar(); 
            String selectQuery = "SELECT id_categoria, nom_categoria FROM categoria";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id_categoria = resultSet.getString("id_categoria");
                    String nom_categoria = resultSet.getString("nom_categoria");
                    String categoriaCombo = id_categoria + " - " + nom_categoria;
                    comboBox.addItem(categoriaCombo);
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
