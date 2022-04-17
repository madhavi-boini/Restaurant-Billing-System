
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narasimha
 */
public class ConnectionProvider {
    public static Connection getCon()  
    {
       
        try 
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@LAPTOP-NBOM5BSG:1522:XE","system","madhavi8");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;
        }
    }
}
