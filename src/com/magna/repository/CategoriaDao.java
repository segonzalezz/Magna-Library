package com.magna.repository;

import com.magna.excepciones.CategoriaDuplicadaException;
import com.magna.interfaces.CategoriaDaoInterface;
import com.magna.modelo.Categoria;
import com.magna.superfunciones.SuperFuncionC;
import javax.swing.JComboBox;

public class CategoriaDao implements CategoriaDaoInterface{

    private static CategoriaDao INSTANCIA;

    private CategoriaDao() {
    }

    public static CategoriaDao getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new CategoriaDao();
        }
        return INSTANCIA;
    }
    
    @Override
    public boolean registrarCategoria(Categoria categoria) throws CategoriaDuplicadaException {
        SuperFuncionC superFuncion = new SuperFuncionC();
        return superFuncion.registrarCategoria(categoria);
    }
    
    @Override
    public Categoria obtenerCategoria(String id_categoria){
        SuperFuncionC superFuncion = new SuperFuncionC();
        return superFuncion.obtenerCategoria(id_categoria);
    }
    
    @Override
    public boolean eliminarCategoria(String id_categoria){
        SuperFuncionC superFuncion =  new SuperFuncionC();
        return superFuncion.eliminarCategoria(id_categoria);
    }
    
    @Override
    public void mostrarCategoriaEnComboBox(JComboBox<String> comboBox){
       SuperFuncionC superFuncion = new SuperFuncionC();
       superFuncion.mostrarCategoriaEnComboBox(comboBox);
    }
    
//    public Categoria obtenerCategoria(String id_categoria) {
//        Categoria categoria = null;
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String selectQuery = "SELECT * FROM categoria WHERE id_categoria = ?";
//            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
//            preparedStatement.setString(1, id_categoria);
//            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
//                if (resultSet.next()) {
//                    String nom_categoria = resultSet.getString("nom_categoria");
//                    categoria = new Categoria(id_categoria, nom_categoria);
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (conexion != null) {
//                Singleton.getInstancia().desconectar();
//            }
//        }
//        return categoria;
//    }

//    public boolean eliminarCategoria(String id_categoria) {
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String query = "DELETE FROM categoria WHERE id_categoria = ?";
//            PreparedStatement preparedStatement = conexion.prepareStatement(query);
//            preparedStatement.setString(1, id_categoria);
//            int rowsDeleted = preparedStatement.executeUpdate();
//            if (rowsDeleted > 0) {
//                return true;
//            } else {
//                System.out.println("No se encontró ninguna categoria con codigo: " + id_categoria + " en la base de datos");
//                return false;
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (conexion != null) {
//                Singleton.getInstancia().desconectar();
//            }
//        }
//        return false;
//    }
//    public void mostrarCategoriasEnComboBox(JComboBox<String> comboBox) {
//        comboBox.removeAllItems();
//        comboBox.addItem("Selecionar");
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String selectQuery = "SELECT id_categoria, nom_categoria FROM categoria";
//            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
//            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
//                while (resultSet.next()) {
//                    String id_categoria = resultSet.getString("id_categoria");
//                    String nom_categoria = resultSet.getString("nom_categoria");
//                    String categoriaCombo = id_categoria + " - " + nom_categoria;
//                    comboBox.addItem(categoriaCombo);
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (conexion != null) {
//                Singleton.getInstancia().desconectar();
//            }
//        }
//    }
}
