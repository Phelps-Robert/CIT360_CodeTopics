package addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RJ
 */
public class DbUtil {
    
    Connection connection=null;
    
    private final String DB_URL = "jdbc:mysql://localhost/addressbook";
    private final String USER = "root";
    private final String PASS = "123456";
    
    public Connection getConnection (){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL,USER,PASS);
         } catch(ClassNotFoundException | SQLException e){
             System.out.println("driver loading problem" + e.getMessage());
         }
         
         return connection;
    }
    
    public void closeConnection(){
        if(connection != null){
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(DbUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
