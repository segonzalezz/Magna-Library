package com.magna.superfunciones;

import com.magna.excepciones.PrestamoDuplicadoException;
import com.magna.modelo.Prestamo;
import com.magna.singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SuperFuncionP {

    public static boolean registrarPrestamo(Prestamo prestamo) throws PrestamoDuplicadoException {
        Connection conexion = null;
        try {
            if (!comprobarPrestamo(prestamo.getId_prestamo())) {
                return false;
            }
            conexion = Singleton.getInstancia().conectar();
            String insertQuery = "INSERT INTO prestamo (id_prestamo, dateS_prestamo, dateF_prestamo, cod_user, cod_libro) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, prestamo.getId_prestamo());
            preparedStatement.setString(2, prestamo.getDateS_prestamo());
            preparedStatement.setString(3, prestamo.getDateF_prestamo());
            preparedStatement.setString(4, prestamo.getCod_user());
            preparedStatement.setString(5, prestamo.getCod_libro());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new PrestamoDuplicadoException("Error al registrar el prestamo");
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }

    private static boolean comprobarPrestamo(String id_prestamo) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT id_prestamo FROM prestamo WHERE id_prestamo = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, id_prestamo);
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

    public static boolean eliminarPrestamo(String id_prestamo) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String query = "DELETE FROM prestamo WHERE id_prestamo = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setString(1, id_prestamo);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            } else {
                System.out.println("No se encontró ningún prestamo con ID: " + id_prestamo + " en la base de datos");
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
}
