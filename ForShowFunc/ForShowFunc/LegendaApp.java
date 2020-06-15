/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package legendaapp;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class LegendaApp {

    public static void main(String[] args) {
    
       
 
        try {
            String url = "jdbc:postgresql://localhost/Legenda?user=postgres&password=loader321";

            Connection connection = DriverManager.getConnection(url);

            Statement statement = connection.createStatement();
                                                          
            
             }
            catch (SQLException e) {
            System.out.println(e.getMessage());

            } 
    }
}
