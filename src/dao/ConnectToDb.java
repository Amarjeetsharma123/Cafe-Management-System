/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;


/**
 *
 * @author Amarjeet
 */
public class ConnectToDb {
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cms?userSSL=false","root","AMAR76#sharma23");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}
