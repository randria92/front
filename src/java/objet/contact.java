/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objet;

import java.io.Serializable;



public class contact implements Serializable{
    private int idInformationContact; 
    private String idEmploye;  
    private int idClient;
    private String typeInformationContact;
    private String descriptionInformationContact;

    public contact(int idInformationContact, String idEmploye, int idClient, String typeInformationContact, String descriptionInformationContact) {
        this.idInformationContact = idInformationContact;
        this.idEmploye = idEmploye;
        this.idClient = idClient;
        this.typeInformationContact = typeInformationContact;
        this.descriptionInformationContact = descriptionInformationContact;
    }

    public int getIdInformationContact() {
        return idInformationContact;
    }

    public void setIdInformationContact(int idInformationContact) {
        this.idInformationContact = idInformationContact;
    }

    public String getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(String idEmploye) {
        this.idEmploye = idEmploye;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getTypeInformationContact() {
        return typeInformationContact;
    }

    public void setTypeInformationContact(String typeInformationContact) {
        this.typeInformationContact = typeInformationContact;
    }

    public String getDescriptionInformationContact() {
        return descriptionInformationContact;
    }

    public void setDescriptionInformationContact(String descriptionInformationContact) {
        this.descriptionInformationContact = descriptionInformationContact;
    }

    @Override
    public String toString() {
        return "contact{" + "idInformationContact=" + idInformationContact + ", idEmploye=" + idEmploye + ", idClient=" + idClient + ", typeInformationContact=" + typeInformationContact + ", descriptionInformationContact=" + descriptionInformationContact + '}';
    }
    
    
    
    }

    