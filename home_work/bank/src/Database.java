/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kameni-arthur
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Database {
    public static final String URL = "jdbc:sqlite:../../bank.sqlite";
    
    public static Connection connect(){
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(URL);
            System.out.println("connection sqlite reussi");
        } catch (SQLException e) {
            System.out.println("erreur de connection"+e.getMessage());
        }
        return conn;
        
    }
    
    public static void main(String[] args){
        Database.connect();
    }
}
