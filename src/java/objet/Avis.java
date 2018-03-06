
package objet;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

public class Avis implements Serializable {
            private int idAvis;
            private int idClient;
            private String idEmploye;
            private int idLigneDeCommande;
            private String ISBN;
            private int noteAvis;
            private int statusDeValidationAvis;
            private String commentaireAvis;
            private Date dateModerationAvis;
            private Date dateAvis;
               
            public Avis(){            
           }

    public Avis(int idAvis, int idClient, String idEmploye, int idLigneDeCommande, String ISBN, int noteAvis, int statusDeValidationAvis, String commentaireAvis, Date dateModerationAvis, Date dateAvis) {
        this.idAvis = idAvis;
        this.idClient = idClient;
        this.idEmploye = idEmploye;
        this.idLigneDeCommande = idLigneDeCommande;
        this.ISBN = ISBN;
        this.noteAvis = noteAvis;
        this.statusDeValidationAvis = statusDeValidationAvis;
        this.commentaireAvis = commentaireAvis;
        this.dateModerationAvis = dateModerationAvis;
        this.dateAvis = dateAvis;
    }

    public int getIdAvis() {
        return idAvis;
    }

    public void setIdAvis(int idAvis) {
        this.idAvis = idAvis;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(String idEmploye) {
        this.idEmploye = idEmploye;
    }

    public int getIdLigneDeCommande() {
        return idLigneDeCommande;
    }

    public void setIdLigneDeCommande(int idLigneDeCommande) {
        this.idLigneDeCommande = idLigneDeCommande;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNoteAvis() {
        return noteAvis;
    }

    public void setNoteAvis(int noteAvis) {
        this.noteAvis = noteAvis;
    }

    public int getStatusDeValidationAvis() {
        return statusDeValidationAvis;
    }

    public void setStatusDeValidationAvis(int statusDeValidationAvis) {
        this.statusDeValidationAvis = statusDeValidationAvis;
    }

    public String getCommentaireAvis() {
        return commentaireAvis;
    }

    public void setCommentaireAvis(String commentaireAvis) {
        this.commentaireAvis = commentaireAvis;
    }

    public Date getDateModerationAvis() {
        return dateModerationAvis;
    }

    public void setDateModerationAvis(Date dateModerationAvis) {
        this.dateModerationAvis = dateModerationAvis;
    }

    public Date getDateAvis() {
        return dateAvis;
    }

    public void setDateAvis(Date dateAvis) {
        this.dateAvis = dateAvis;
    }

    @Override
    public String toString() {
        return "Avis{" + "idAvis=" + idAvis + ", idClient=" + idClient + ", idEmploye=" + idEmploye + ", idLigneDeCommande=" + idLigneDeCommande + ", ISBN=" + ISBN + ", noteAvis=" + noteAvis + ", statusDeValidationAvis=" + statusDeValidationAvis + ", commentaireAvis=" + commentaireAvis + ", dateModerationAvis=" + dateModerationAvis + ", dateAvis=" + dateAvis + '}';
    }

//    public Vector getVector() {
//        Vector v = new Vector();
//        v.add(idAvis);
//        v.add(idClient);
//        v.add(idEmploye);
//        v.add(idLigneDeCommande);
//        v.add(ISBN);
//        v.add(noteAvis);
//        v.add(statusDeValidationAvis);
//        v.add(commentaireAvis);
//        v.add(dateModerationAvis);
//        v.add(dateAvis);
//         /*.add("idAvis");
//        V.add("idClient");
//        V.add("idEmploye");
//        V.add("idLigneDeCommande");
//        V.add("ISBN");
//        V.add("NOTE AVIS");
//        V.add("StatusDeValidationAvis");
//        V.add("commentaireAvis");
//        V.add("dateModerationAvis");
//        V.add("dateAvis");*/
//        return v;
//    }
            
            
}

