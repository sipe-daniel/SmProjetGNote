/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minijavamysqlgestionetudiant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jordan
 */
public class Connecter {
    Connection con;
    public Connecter (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etude","root","jordan96");
        } catch (Exception e) {System.err.println("e");}
        
        }
    
    Connection obtenirconnexion(){
        return con;
    }
    
}
