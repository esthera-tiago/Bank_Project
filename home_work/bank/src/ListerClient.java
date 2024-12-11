import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kameni-arthur
 */
public class ListerClient extends JFrame{
    private JTable table;
    private DefaultTableModel model;
    
    public ListerClient(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Liste Des Clients");
        setSize(600, 400);
        
        model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nom");
        model.addColumn("Email");
        
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        
        chargerDonner();
        
        setVisible(true);
    }
    
    private void chargerDonner(){
        try {
           Connection conn = Database.connect();
           Statement stmt = conn.createStatement();
           ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM client");
{
            while (rs.next()) {
        int id = rs.getInt("id");
        String nom = rs.getString("nom");
        String prenom = rs.getString("prenom");
        
        model.addRow(new Object[]{id, nom, prenom});
    }
        }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        new Connexion();
    }
}
