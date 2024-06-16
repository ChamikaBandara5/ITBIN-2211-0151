/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import java.sql.*;

/**
 *
 * @author Chamika
 */
public class ConnectionProvider {
    
    public static Connection getCon() throws SQLException{
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafemanagementsystme?useSSL=false","root","");
            return con;
            }
        catch(Exception e)
        {
           
        }
        return null;

       
    }
    
}
