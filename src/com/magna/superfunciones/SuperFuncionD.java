package com.magna.superfunciones;

import com.magna.singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SuperFuncionD {
    
        public static boolean devolverPrestamo(String id_libro, String id_user){
         Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT id_prestamo FROM prestamo WHERE cod_libro = ? AND cod_usuario = ?";
            PreparedStatement selectStatement = conexion.prepareStatement(selectQuery);
            selectStatement.setString(1, id_libro);
            selectStatement.setString(2, id_user);
            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) {
                String id_prestamo = resultSet.getString("id_prestamo");
                String deleteQuery = "DELETE FROM prestamo WHERE id_prestamo = ?";
                PreparedStatement deleteStatement = conexion.prepareStatement(deleteQuery);
                deleteStatement.setString(1, id_prestamo);
                int rowsDeleted = deleteStatement.executeUpdate();
                if (rowsDeleted > 0) {
                    String updateQuery = "UPDATE libro SET can_stock = can_stock + 1 WHERE id_libro = ?";
                    PreparedStatement updateStatement = conexion.prepareStatement(updateQuery);
                    updateStatement.setString(1, id_libro);
                    int rowsUpdated = updateStatement.executeUpdate();
                    return rowsUpdated > 0;
                }
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
}
