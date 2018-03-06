
package accesBDD;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.ComboBoxEditor;

public class BDD implements Serializable{
    private DataSource ds;

    public BDD() throws NamingException {
        InitialContext context = new InitialContext();
        ds = (DataSource) context.lookup("jdbc/Librairie");
    }
    
    public Connection getConnection() throws SQLException{
        Connection cnt = ds.getConnection();
        return cnt;
    }
    
    
}
