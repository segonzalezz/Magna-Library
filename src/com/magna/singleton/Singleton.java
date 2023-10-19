package Singleton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Singleton {

    private static Singleton INSTANCIA;
    private String baseDatos = "magna";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "root";
    private String password = "";
    private String driver = "com.mysql.cj.jdbc.Driver";
    Connection conexion;

    public Singleton() {
        conectar();
    }

    public static Singleton getInstancia() {
        if (INSTANCIA == null) {
            INSTANCIA = new Singleton();
        }
        return INSTANCIA;
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url + baseDatos, user, password); //Cadena de Conexion
//            System.out.println("SE CONECTO A LA BASE DE DATOS: " + baseDatos);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException("NO SE PUDO CONECTAR A LA DE DATOS: " + baseDatos);
        }
        return conexion;
    }

    public void desconectar() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//    public static void main(String[] args) {
//        Singleton conexion = new Singleton();
//        conexion.conectar();
//    }
}
