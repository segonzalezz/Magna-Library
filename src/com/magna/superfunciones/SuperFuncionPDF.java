package com.magna.superfunciones;

import com.magna.modelo.Categoria;
import com.magna.modelo.Libro;
import com.magna.modelo.Rol;
import com.magna.modelo.Usuario;
import com.magna.singleton.Singleton;
import com.mysql.cj.jdbc.DatabaseMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

public class SuperFuncionPDF {
    
    public void mostrarTablasDisponibles(JComboBox<String> comboBox) {
        comboBox.removeAllItems();
        comboBox.addItem("Selecionar");
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            DatabaseMetaData metaData = (DatabaseMetaData) conexion.getMetaData();
            ResultSet tablas = metaData.getTables("magna", null, null, new String[]{"TABLE"});;
            while (tablas.next()) {
                String nombreTabla = tablas.getString("TABLE_NAME");
                comboBox.addItem(nombreTabla);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
    }
    
    public static List<Libro> obtenerTodosLosLibros(){
       List<Libro> libros = new ArrayList<>();
        Connection conexion = null;
        try{
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT * FROM libro";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery); 
                ResultSet resultSet = preparedStatement.executeQuery()) {
                while(resultSet.next()){
                    String id_libro = resultSet.getString("id_libro");
                    String tit_libro = resultSet.getString("tit_libro");
                    String aut_libro = resultSet.getString("aut_libro");
                    String ano_public = resultSet.getString("ano_public");
                    int can_stock = resultSet.getInt("can_stock");
                    String cod_categoria = resultSet.getString("cod_categoria");
                    Libro libro = new Libro(id_libro, tit_libro, aut_libro, ano_public, can_stock, cod_categoria);
                    libros.add(libro);
                }
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return libros;  
    }
    
    public static List<Usuario> obtenerTodosLosUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Connection conexion = null;
        try{
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT * FROM usuario";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
                ResultSet resultSet = preparedStatement.executeQuery()){
                while(resultSet.next()){
                    String nom_persona = resultSet.getString("nom_persona");
                    int ed_persona = resultSet.getInt("ed_persona");
                    String ced_persona = resultSet.getString("ced_persona");
                    String dir_persona = resultSet.getString("dir_persona");
                    String user_u =  resultSet.getString("user_u");
                    String pass_u = resultSet.getString("pass_u");
                    String cod_rol =  resultSet.getString("cod_rol");
                    Usuario usuario = new Usuario(nom_persona, ed_persona, ced_persona, dir_persona, user_u, pass_u, cod_rol);
                    usuarios.add(usuario);
                }
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return usuarios;
        
    }
    
    public static List<Rol> obtenerTodosLosRoles(){
        List<Rol> roles = new ArrayList<>();
        Connection conexion = null;
        try{
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT * FROM rol";
            try(PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery); 
                ResultSet resultSet = preparedStatement.executeQuery()) {
                while(resultSet.next()){
                    String id_rol = resultSet.getString("id_rol");
                    String nom_rol = resultSet.getString("nom_rol");
                    Rol rol = new Rol(id_rol, nom_rol);
                    roles.add(rol);
                }
            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return roles;
    }

    public static List<Categoria> obtenerTodasLasCategorias() {
        List<Categoria> categorias = new ArrayList<>();
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT * FROM categoria";
            try (PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery); 
                ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    String id_categoria = resultSet.getString("id_categoria");
                    String nom_categoria = resultSet.getString("nom_categoria");
                    Categoria categoria = new Categoria(id_categoria, nom_categoria);
                    categorias.add(categoria);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return categorias;
    }
}
