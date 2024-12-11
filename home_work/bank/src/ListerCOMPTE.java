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
public class ListerCOMPTE extends JFrame{
    private JTable table;
    private DefaultTableModel model;
    
    public ListerCOMPTE(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Liste Des Comptes");
        setSize(600, 400);
        
        model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("nom");
        model.addColumn("prenom");
        model.addColumn("Date de naissance");
        model.addColumn("profession");
        model.addColumn("mot de passe");
        model.addColumn("contenu(Fcfa)");
        
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
            rs = stmt.executeQuery("SELECT * FROM compte");
{
            while (rs.next()) {
        int id = rs.getInt("id");
        String nom = rs.getString("nom");
        String prenom = rs.getString("prenom");
        
        String datenaissance = rs.getString("dateNaiss");
        String proffession = rs.getString("proffesion");
        
        String type = rs.getString("motpasse");
        String contenu = rs.getString("montant");
        
        model.addRow(new Object[]{id, nom, prenom, datenaissance, proffession, type, contenu});
    }
        }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        new Connexion();
    }
}
