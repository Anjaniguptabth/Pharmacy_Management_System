/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Jani
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mySql://localhost:3306/pharmacy?useSSL=false","root","12345");
           return con;
        }
        catch(Exception e){
            System.out.print(e);
            return null;
        }
    }
    
}
