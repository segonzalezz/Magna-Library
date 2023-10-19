package Repository;
import Modelo.Usuario;
import Singleton.Singleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SesionDao {
    
    public static SesionDao INSTANCIA;
    
    private SesionDao(){

    }
    
    public static SesionDao getInstancia(){
        if(INSTANCIA == null){
            INSTANCIA =  new SesionDao();
        }
        return INSTANCIA;
    }
    
    public boolean verificacionUsuario(String usuarioU, String contrasenaU) {
        Connection conexion = null;
        try {
            conexion = Singleton.getInstancia().conectar();
            String selectQuery = "SELECT COUNT(*) AS count FROM usuario WHERE user_u = ? AND pass_u = ?";
            PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
            preparedStatement.setString(1, usuarioU);
            preparedStatement.setString(2, contrasenaU);
            try ( ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int count = resultSet.getInt("count");
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conexion != null) {
                Singleton.getInstancia().desconectar();
            }
        }
        return false;
    }
}
