/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author iMac
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection conn;
        String url = "jdbc:mysql://localhost/movies";
        String username = "root";
        String password = " ";
        
        try
        {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
        }
        catch (Exception e)
        {
            System.out.println(String.valueOf(e));
        }
        
    }
    
}
