/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author GOVIND SINGLA
 */
public class admindatabasesms 
{
           static Connection con;
   static public Connection getConnect(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
          con=DriverManager.getConnection("" , "system" ,   "XYZ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
