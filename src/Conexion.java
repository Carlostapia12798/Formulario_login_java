
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Conexion {
    
    //funcion para conectar con la base de datos
    
    public static Connection getconnection(){
    
        Connection con = null;
        
        
        try{
            //se hace la conexion a la base de datos
            class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/practicafinal","root","123456");       
        } 
            //en caso de que no se pueda hacer la conexion que tire el mensaje
            catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        return con;
    }
  
}
