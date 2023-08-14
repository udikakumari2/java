/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MyPc
 */

public class DBHelper {
    public static Connection getConnection(){
        Connection con=null;
        try{
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
       con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy", "root", "");
        
        }
        catch(Exception e){
        e.printStackTrace();
        }
        return con;
    }
}
  /* public static Statement st; 
    public static Connection con; 
     public static PreparedStatement getData;
     static{
       try {
           Class.forName("com.mysql.jdbc.Driver");
           
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
               st=con.createStatement();
               getData=con.prepareStatement("SELECT * FROM mupdate WHERE medicne_name LIKE ?");
               
           
}
        catch (Exception e) {
           
       }}

    /**
     *
     * @param name
     * @return
     * @throws SQLException*/
     
  /*  public static ResultSet getData(String name) throws SQLException{
       
       getData.setString(1, "%"+name+"%");
       return getData.executeQuery();
       
       }
        
     
     
   
}*/
