package com.magna.superfunciones;

import com.magna.modelo.Historial;
import com.magna.singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SuperFuncionH {

    public static boolean registrarHistorialP(Historial historial) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String insertQuery = "INSERT INTO historial (id, tipo_transaccion, cod_user, cod_libro, fech_prestamo, des_transaccion) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, historial.getId());
            preparedStatement.setString(2, historial.getTipo_transaccion());
            preparedStatement.setString(3, historial.getCod_user());
            preparedStatement.setString(4, historial.getCod_libro());
            preparedStatement.setString(5, historial.getFech_prestamo());
            preparedStatement.setString(6, historial.getDes_transaccion());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }

    public static boolean registrarHistorialD(Historial historial) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String insertQuery = "INSERT INTO historial (id, tipo_transaccion, fech_devolucion, des_transaccion) VALUES (?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, historial.getId());
            preparedStatement.setString(2, historial.getTipo_transaccion());
            preparedStatement.setString(3, historial.getFech_devolucion());
            preparedStatement.setString(4, historial.getDes_transaccion());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
}
