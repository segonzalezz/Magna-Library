
package com.magna.superfunciones;

import com.magna.excepciones.UsuarioDuplicadoException;
import com.magna.modelo.Usuario;
import com.magna.singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;

public class SuperFuncionU {
    
    public static boolean registrarUsuario(Usuario usuario) throws UsuarioDuplicadoException{
        Connection conexion = null;
        try {
            if (!comprobarU(usuario.getUser_u())) {
                return false;
            }
            conexion = Singleton.getInstancia().conectar();
            String insertQuery = "INSERT INTO usuario (nom_persona, ed_persona, ced_persona, dir_persona, user_u, pass_u, cod_rol) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
            preparedStatement.setString(1,usuario.getNom_persona());
            preparedStatement.setInt(2,usuario.getEd_persona());
            preparedStatement.setString(3, usuario.getCed_persona());
            preparedStatement.setString(4, usuario.getDir_persona());
            preparedStatement.setString(5, usuario.getUser_u());
            preparedStatement.setString(6, usuario.getPass_u());
            preparedStatement.setString(7, usuario.getCod_rol());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new UsuarioDuplicadoException("Error al registrar el usuario");
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
    
    private static boolean comprobarU(String ced_persona){
       Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT ced_persona FROM usuario WHERE ced_persona = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, ced_persona);
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
    
    public static Usuario obtenerUsuario(String ced_persona){
         Usuario usuario = null;
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT * FROM usuario WHERE ced_persona = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, ced_persona);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String nom_persona = resultSet.getString("nom_persona");
                    int ed_persona = resultSet.getInt("ed_persona");
                    String dir_persona = resultSet.getString("dir_persona");
                    String user_u = resultSet.getString("user_u");
                    String pass_u = resultSet.getString("pass_u");
                    String cod_rol = resultSet.getString ("cod_rol");
                    usuario = new Usuario(nom_persona, ed_persona, ced_persona, dir_persona, user_u, pass_u, cod_rol);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return usuario;
    }
    
    public static boolean eliminarUsuario(String ced_persona){
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String query = "DELETE FROM usuario WHERE ced_persona = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(query);
            preparedStatement.setString(1, ced_persona);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                return true;
            } else {
                System.out.println("No se encontró ninguna persona con cedula: " + ced_persona + " en la base de datos");
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
    
     public static void imprimirInformacionUsuarioRegistrado(JLabel nombreU, JLabel edadU, JLabel cedulaU, JLabel direccionU, JLabel usuarioU, JLabel rolU, String usuario) {
         Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT nom_persona, ed_persona, ced_persona, dir_persona, user_u, cod_rol FROM usuario WHERE user_u = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, usuario);

            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String nombre = resultSet.getString("nom_persona");
                    int edad = resultSet.getInt("ed_persona");
                    String cedula = resultSet.getString("ced_persona");
                    String direccion = resultSet.getString("dir_persona");
                    String user = resultSet.getString("user_u");
                    String cod_rol = resultSet.getString("cod_rol");

                    nombreU.setText(" " + nombre);
                    edadU.setText(" " + edad);
                    cedulaU.setText(" " + cedula);
                    direccionU.setText(" " + direccion);
                    usuarioU.setText(" " + user);
                    rolU.setText(" " + cod_rol);
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
