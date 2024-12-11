/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kameni-arthur
 */
public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    
    public Client(String nom, String prenom, String adresse, String telephone){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }
    @Override
    public String toString(){
        return "client{"+"nom='"+nom+'\''+",prenom='"+prenom+'\''+"adresse='"+adresse+'\''+"telephone='"+telephone+'\''+'}';
    }
        
}
