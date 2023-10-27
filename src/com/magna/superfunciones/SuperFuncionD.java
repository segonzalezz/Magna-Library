package com.magna.superfunciones;

import com.magna.excepciones.DevolucionDuplicadaException;
import com.magna.modelo.Devolucion;
import com.magna.modelo.Historial;
import com.magna.singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SuperFuncionD {

    public static boolean registrarDevolucion(Devolucion devolucion) throws DevolucionDuplicadaException {
        Connection conexion = null;
        try {
            if (!comprobarDevolucion(devolucion.getCod_prestamo())) {
                return false;
            }
            conexion = Singleton.getInstancia().conectar();
            String insertQuery = "INSERT INTO devolucion (cod_prestamo, dateF_devolucion, des_devolucion) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1, devolucion.getCod_prestamo());
            preparedStatement.setString(2, devolucion.getDateF_devolucion());
            preparedStatement.setString(3, devolucion.getDes_devolucion());
            preparedStatement.executeUpdate();
            Historial historial= new Historial(devolucion.getCod_prestamo(), "Devolución", obtenerFechaActual(),
            "Se realizo una devolución del prestamo: " + devolucion.getCod_prestamo());
            SuperFuncionH.registrarHistorialD(historial);
            return true;
        } catch (SQLException e) {
            throw new DevolucionDuplicadaException("Error al registrar devolucion");
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }

    private static boolean comprobarDevolucion(String cod_prestamo) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT cod_prestamo FROM devolucion WHERE cod_prestamo = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, cod_prestamo);
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

    public static boolean devolverPrestamo(String cod_user, String cod_libro) throws DevolucionDuplicadaException {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String deleteQuery = "DELETE FROM prestamo WHERE cod_user = ? AND cod_libro = ?";
            PreparedStatement deleteStatement = conexion.prepareStatement(deleteQuery);
            deleteStatement.setString(1, cod_user);
            deleteStatement.setString(2, cod_libro);
            int rowsDeleted = deleteStatement.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
    
    public static String obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaDevolucion = fechaActual.format(formato);
        return fechaDevolucion;
    }

}
