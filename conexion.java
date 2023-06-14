package mysqlconection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yaser
 */
public class conexion {
    Connection con;
    private static String usuario="root";
    private static String clave="";
    private static String url="jdbc:mysql://localhost:3306/";
    private static String bd="hotel";
    
    public conexion() {
    }
    
    public Connection getConnection() {
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(url+bd, usuario, clave);
            System.out.println("SE CONECTO A BASE DE DATOS "+bd);
            } catch (SQLException | ClassNotFoundException ex) {
                System.err.println("NO SE CONECTO A: "+bd);
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    public void desconectar( ) {
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        conexion c = new conexion();
        c.getConnection();
    }
}
