package com.magna.superfunciones;

import com.magna.excepciones.LibroDuplicadoException;
import com.magna.excepciones.StockInsuficienteException;
import com.magna.modelo.Libro;
import com.magna.singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

public class SuperFuncionL {

    public static boolean registrarLibro(Libro libro) throws LibroDuplicadoException {
        Connection conexion = null;
        try {
            if (!comprobarLibro(libro.getId_libro())) {
                return false;
            }
            conexion = Singleton.getInstancia().conectar();
            String insertQuery = "INSERT INTO libro (id_libro, tit_libro, aut_libro, ano_public, can_stock, cod_categoria) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, libro.getId_libro());
            preparedStatement.setString(2, libro.getTit_libro());
            preparedStatement.setString(3, libro.getAut_libro());
            preparedStatement.setString(4, libro.getAno_public());
            preparedStatement.setInt(5, libro.getCan_stock());
            preparedStatement.setString(6, libro.getCod_categoria());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new LibroDuplicadoException("Error al registrar el libro");
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }

    private static boolean comprobarLibro(String id_libro) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT id_libro FROM libro WHERE id_libro = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, id_libro);
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

    public static Libro obtenerLibro(String id_libro) {
        Libro libro = null;
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT * FROM libro WHERE id_libro = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, id_libro);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String tit_libro = resultSet.getString("tit_libro");
                    String aut_libro = resultSet.getString("aut_libro");
                    String ano_public = resultSet.getString("ano_public");
                    int can_stock = resultSet.getInt("can_stock");
                    String cod_categoria = resultSet.getString("cod_categoria");
                    libro = new Libro(id_libro, tit_libro, aut_libro, ano_public, can_stock, cod_categoria);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return libro;
    }

    public static boolean eliminarLibro(String id_libro) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String query = "DELETE FROM libro WHERE id_libro = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setString(1, id_libro);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            } else {
                System.out.println("No se encontró ningun libro con codigo: " + id_libro + " en la base de datos");
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

    public static void mostrarLibrosEnComboBox(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("Selecionar");
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT id_libro, tit_libro FROM libro";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id_libro = resultSet.getString("id_libro");
                    String tit_libro = resultSet.getString("tit_libro");
                    String clienteCombo = id_libro + " - " + tit_libro;
                    comboBox.addItem(clienteCombo);
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

    public static boolean actualizarStockLibro(String id_libro, int can_stock) throws StockInsuficienteException {
        if (can_stock == 0) {
            throw new StockInsuficienteException("No hay suficiente stock para realizar el préstamo.");
        }
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String updateQuery = "UPDATE libro SET can_stock = can_stock + ? WHERE id_libro = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(updateQuery);
            preparedStatement.setInt(1, can_stock);
            preparedStatement.setString(2, id_libro);
            int filasActualizadas = preparedStatement.executeUpdate();
            return filasActualizadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
    
    public static int obtenerStockLibro(String id_libro) {
        Connection conexion = null;
        int stockActual = 0;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT can_stock FROM libro WHERE id_libro = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, id_libro);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                stockActual = resultSet.getInt("can_stock");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return stockActual;
    }
    //Metodo va para su respectiva superFuncion
    //Metodo tiene su propia interface
    //Y tambien metodo tiene su propio controlador.
//    public static boolean devolverLibro(String id_libro){
//         Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String selectQuery = "SELECT id_prestamo FROM prestamo WHERE cod_libro = ?";
//            PreparedStatement selectStatement = conexion.prepareStatement(selectQuery);
//            selectStatement.setString(1, id_libro);
//            ResultSet resultSet = selectStatement.executeQuery();
//            if (resultSet.next()) {
//                String id_prestamo = resultSet.getString("id_prestamo");
//                String deleteQuery = "DELETE FROM prestamo WHERE id_prestamo = ?";
//                PreparedStatement deleteStatement = conexion.prepareStatement(deleteQuery);
//                deleteStatement.setString(1, id_prestamo);
//                int rowsDeleted = deleteStatement.executeUpdate();
//                if (rowsDeleted > 0) {
//                    String updateQuery = "UPDATE libro SET can_stock = can_stock + 1 WHERE id_libro = ?";
//                    PreparedStatement updateStatement = conexion.prepareStatement(updateQuery);
//                    updateStatement.setString(1, id_libro);
//                    int rowsUpdated = updateStatement.executeUpdate();
//                    return rowsUpdated > 0;
//                }
//            }
//            return false;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return false;
//        } finally {
//            if (conexion != null) {
//                Singleton.getInstancia().desconectar();
//            }
//        }
//    }

}
