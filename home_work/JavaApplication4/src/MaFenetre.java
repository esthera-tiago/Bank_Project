/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kameni-arthur
 */
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
public class MaFenetre extends JFrame{
    public MaFenetre()
    {
        setTitle("Application De Gestion Des Banques");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //creation de la barre de menu
        JMenuBar barreMenu = new JMenuBar();
        
        //creation des menus
        JMenu menuClients = new JMenu("Client");
        JMenu menuCompte = new JMenu("Compte");
        JMenu menuTransaction = new JMenu("Transaction");
        JMenu menuAide = new JMenu("Aide");
        
        //creation des items pour le menu clients
        JMenuItem ajouterClient = new JMenuItem("ajouter un client");
        JMenuItem listeClient = new JMenuItem("liste de  clients");
        
        //ajouter des clients
        ajouterClient.addActionListener(e -> new FenetreAjouterClient().setVisible(true));
        
        //creation d'un item pour le menu comptes
        JMenuItem ouvrirCompte = new JMenuItem("Ouvrir un compte");
        JMenuItem listeCompte = new JMenuItem("Lste des comptes");
        
        //creation d'un item pour quitter l'application
        JMenuItem quitter = new JMenuItem("Quitter");
        
        //ajout d'action a l'item quitter
        quitter.addActionListener(e ->System.exit(0));
        
        //ajout des items aux menus
        menuClients.add(ajouterClient);
        menuClients.add(listeClient);
        
        menuCompte.add(ouvrirCompte);
        menuCompte.add(listeCompte);
        
        menuAide.add(quitter);
        
        //ajout des menus a la barre des menu
        
        barreMenu.add(menuClients);
        barreMenu.add(menuCompte);
        barreMenu.add(menuTransaction);
        barreMenu.add(menuAide);
        
        //ajout de la barre de menu a la fenetre
        setJMenuBar(barreMenu);
    }
}
