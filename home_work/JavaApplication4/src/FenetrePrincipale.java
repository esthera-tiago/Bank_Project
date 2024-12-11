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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class FenetrePrincipale extends JFrame {
    public FenetrePrincipale(){
        setTitle("gestion des clients");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JButton btnAjouterClient = new JButton("ajouter un boutton");
        JButton btnAfficherClients = new JButton("afficher les boutton");
        
        btnAjouterClient.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               new FenetreAjouterClient().setVisible(true);
            }
        });
        
        btnAfficherClients.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                List<Client> clients = FenetreAjouterClient.getClients();
                StringBuilder clientsText = new StringBuilder();
               
                
                for (Client client : clients) {
                    clientsText.append(client.toString()).append("\n");
                }
                JOptionPane.showMessageDialog(FenetrePrincipale.this, clientsText.toString(), "liste des clients", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        JPanel panel = new JPanel();
        panel.add(btnAjouterClient);
        panel.add(btnAfficherClients);
        add(panel, BorderLayout.CENTER);
    }

public static void main(String[] args){
    SwingUtilities.invokeLater(() -> new FenetrePrincipale().setVisible(true));
}

}