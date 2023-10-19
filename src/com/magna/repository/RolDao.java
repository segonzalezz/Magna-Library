package com.magna.repository;
import com.magna.excepciones.RolDuplicadoException;
import com.magna.interfaces.RolDaoInterface;
import com.magna.modelo.Rol;
import com.magna.superfunciones.SuperFuncionR;

import javax.swing.JComboBox;

public class RolDao implements RolDaoInterface{

    private static RolDao INSTANCIA;

    private RolDao() {
    }

    public static RolDao getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new RolDao();
        }
        return INSTANCIA;
    }
    
    @Override
    public boolean registrarRol(Rol rol) throws RolDuplicadoException{
        SuperFuncionR superFuncion = new SuperFuncionR();
        return superFuncion.registrarRol(rol);
    }
    
    @Override
    public boolean eliminarR(String id_rol){
        SuperFuncionR superFuncion = new SuperFuncionR();
        return superFuncion.eliminarR(id_rol);
    }
    
    @Override
    public Rol obtenerRol(String id_rol){
        SuperFuncionR superFuncion = new SuperFuncionR();
        return superFuncion.obtenerRol(id_rol);
    }
    
    @Override
    public void mostrarRolesEnComboBox(JComboBox<String> comboBox){
        SuperFuncionR superFuncion = new SuperFuncionR();
        superFuncion.mostrarRolesEnComboBox(comboBox);
    }
    
    @Override
    public void mostrarRolesEnComboBoxSinAdmi(JComboBox<String> comboBox) {
        SuperFuncionR superFuncion = new SuperFuncionR();
        superFuncion.mostrarRolesEnComboBoxSinAdmi(comboBox);
    }
    
    
    

//    public boolean registrarRol(Rol rol) throws RolDuplicadoException {
//        Connection conexion = null;
//        try {
//            if (!comprobarRol(rol.getId_rol())) {
//                return false;
//            }
//            conexion = Singleton.getInstancia().conectar();
//            String insertQuery = "INSERT INTO rol (id_rol, nom_rol) VALUES (?, ?)";
//            PreparedStatement preparedStatement = conexion.prepareStatement(insertQuery);
//            preparedStatement.setString(1, rol.getId_rol());
//            preparedStatement.setString(2, rol.getNom_rol());
//            preparedStatement.executeUpdate();
//            return true;
//        } catch (SQLException e) {
//            throw new RolDuplicadoException("Error al registrar el rol");       
//        } finally {
//            if (conexion != null) {
//                Singleton.getInstancia().desconectar();
//            }
//        }
//    }
//    
//    public boolean comprobarRol(String id_rol) {
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String selectQuery = "SELECT id_rol FROM rol WHERE id_rol = ?";
//            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
//            preparedStatement.setString(1, id_rol);
//            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
//                if (resultSet.next()) {
//                    return false;
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return true;
//    }
    
//    public Rol obtenerRol(String id_rol) {
//        Rol rol = null;
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String selectQuery = "SELECT * FROM rol WHERE id_rol = ?";
//            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
//            preparedStatement.setString(1, id_rol);
//            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
//                if (resultSet.next()) {
//                    String nom_rol = resultSet.getString("nom_rol");
//                    rol = new Rol(id_rol, nom_rol);
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        } finally {
//            if (conexion != null) {
//                Singleton.getInstancia().desconectar();
//            }
//        }
//        return rol;
//    }
    
//    public boolean modificarRol(Rol rol) {
//        Rol rolEncontrado = obtenerRol(rol.getId_rol());
//        Connection conexion = null;
//        if (rolEncontrado != null) {
//            rolEncontrado.setId_rol(rol.getNom_rol());
//            try {
//                String updateQuery = "UPDATE rol SET nom_rol = ?";
//                conexion = Singleton.getInstancia().conectar();
//                PreparedStatement preparedStatement = conexion.prepareStatement(updateQuery);
//                preparedStatement.setString(1, rolEncontrado.getNom_rol());
//                preparedStatement.executeUpdate();
//                return true;
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } finally {
//                if (conexion != null) {
//                    Singleton.getInstancia().desconectar();
//                }
//            }
//        }
//        return false;
//    }
    
//    public boolean eliminarR(String id_rol) {
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String query = "DELETE FROM rol WHERE id_rol = ?";
//            PreparedStatement preparedStatement = conexion.prepareStatement(query);
//            preparedStatement.setString(1, id_rol);
//            int rowsDeleted = preparedStatement.executeUpdate();
//            if (rowsDeleted > 0) {
//                return true;
//            } else {
//                System.out.println("No se encontró ningún rol con codigo: " + id_rol + " en la base de datos");
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
    
//    public void mostrarRolesEnComboBox(JComboBox<String> comboBox) {
//        comboBox.removeAllItems();
//        comboBox.addItem("Selecionar");
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar(); 
//            String selectQuery = "SELECT id_rol, nom_rol FROM rol";
//            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
//            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
//                while (resultSet.next()) {
//                    String id_rol = resultSet.getString("id_rol");
//                    String nom_rol = resultSet.getString("nom_rol");
//                    String rolCombo = id_rol + " - " + nom_rol;
//                    comboBox.addItem(rolCombo);
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
    //Se le muestra al usuario
//    public void mostrarRolesEnComboBoxSinAdmi(JComboBox<String> comboBox) {
//        comboBox.removeAllItems();
//        comboBox.addItem("Seleccionar");
//        Connection conexion = null;
//        try {
//            conexion = Singleton.getInstancia().conectar();
//            String selectQuery = "SELECT id_rol, nom_rol FROM rol WHERE nom_rol != 'administrador'";
//            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
//            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
//                while (resultSet.next()) {
//                    String id_rol = resultSet.getString("id_rol");
//                    String nom_rol = resultSet.getString("nom_rol");
//                    String proveedorCombo = id_rol + " - " + nom_rol;
//                    comboBox.addItem(proveedorCombo);
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
