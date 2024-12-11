/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kameni-arthur
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class FenetreAjouterClient extends JFrame{
    private static List<Client> clients = new ArrayList<>();
    public FenetreAjouterClient(){
        setTitle("Ajouter un client");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        
        JLabel labelNom = new JLabel("Nom:");
        JLabel labelPrenom = new JLabel("prenom:");
        JLabel labelAdresse = new JLabel("Adresse:");
        JLabel labeltelephone = new JLabel("Telephone:");
        
        JTextField textNom = new JTextField();
        JTextField textprenom = new JTextField();
        JTextField textAdresse = new JTextField();
        JTextField textTelephone = new JTextField();
        
        panel.add(labelNom);
        panel.add(textNom);
        panel.add(labelPrenom);
        panel.add(textprenom);
        panel.add(labelAdresse);
        panel.add(textAdresse);
        panel.add(labeltelephone);
        panel.add(textTelephone);
        
        JButton btnValider = new JButton("Valider");
        JButton btnAnnuler = new JButton("Annuler");
        
        JPanel panelButtons = new JPanel();
        
        panelButtons.add(btnValider);
        panelButtons.add(btnAnnuler);
        
        setLayout(new BorderLayout());
        
        add(panel, BorderLayout.CENTER);
        add(panelButtons, BorderLayout.SOUTH);
        
        btnValider.addActionListener(e -> {
            String nom = textNom.getText();
            String prenom = textprenom.getText();
            String adresse = textAdresse.getText();
            String telephone = textTelephone.getText();
            
            if (nom.isEmpty() || prenom.isEmpty() || telephone.isEmpty()) {
               JOptionPane.showMessageDialog(this, "veuillez remplir les champs obligatoires.","Erreur",JOptionPane.ERROR_MESSAGE);
            }else{
                Client client = new Client(nom, prenom, adresse, telephone);
                clients.add(client);
                System.out.println("client ajouter " + client);
                JOptionPane.showMessageDialog(this, "client ajouter avec succes", "succes", JOptionPane.INFORMATION_MESSAGE);
                
                textNom.setText("");
                textprenom.setText("");
                textAdresse.setText("");
                textTelephone.setText("");
            }
            
        });
        
        btnAnnuler.addActionListener(e -> dispose());
    }
    
    public static List<Client> getClients() {
        return clients;
    }
}
