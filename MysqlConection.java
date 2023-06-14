/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mysqlconection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author yaser
 */
public class MysqlConection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario="root";
        String clave="3r2AS(Aa50RVMowD";
        String url="jdbc:mysql://localhost:3306/";
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MysqlConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con= DriverManager.getConnection(url,usuario,clave);
            stmt=con.createStatement();
            stmt.executeUpdate("INSERT INTO usuarios VALUES(null,'124AS','camisa','150')");
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
