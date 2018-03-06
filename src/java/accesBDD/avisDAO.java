


package accesBDD;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import objet.Avis; 

public class avisDAO implements Serializable {
    
    private Connection cnt;
    
    public avisDAO() throws NamingException {
//        mc = new maConnexion();
        try {
            // charger le driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("1) erreur de chargement du driver");
            ex.printStackTrace();
            System.exit(0);            
        }
        
        // code depuis java 7
        // informations de connexion
        String url = "jdbc:sqlserver://localhost:53975;databaseName=Librairie;";
        String user = "cedric";
        String mdp = "cedric21";
        try {
            cnt = DriverManager.getConnection(url, user, mdp); 
            System.out.println("connexion réussie!!!!");
        } catch (SQLException ex) {
            System.out.println("2) erreur sur la connexion");
            ex.printStackTrace();
        } 
    }
    
    public List<Avis> listAvis () throws SQLException {
        String req = "select idAvis" +
                    ",noteAvis" +              
                    ",commentaireAvis" +
                    ",dateAvis" +
                    "FROM avis";
//        Connection cnt = mc.getConnection();
        Statement stm = cnt.createStatement();
        List<Avis> la = new ArrayList<>();
        try {
            ResultSet rs = stm.executeQuery(req);
            
            while (rs.next()) {
                Avis avs = new Avis();
                avs.setIdAvis(rs.getInt("idAvis"));
                avs.setISBN(rs.getString("ISBN"));
                avs.setNoteAvis(rs.getInt("noteAvis"));          
                avs.setCommentaireAvis(rs.getString("commentaireAvis"));
                avs.setDateAvis(rs.getDate("dateAvis"));
                la.add(avs);
            }
            rs.close();
        }finally{
            if(cnt != null){
                cnt.close();
                stm.close();
            }
        } 
        
        return la;
    }

    public boolean insertAvis (Avis avs) throws SQLException {
        String req;
        req = "INSERT INTO avis (" +
                    "idClient" +
                    ",idLigneDeCommande" +
                    ",ISBN" +
                    ",noteAvis" +
                    ",commentaireAvis" +
                    ",statusDeValidationAvis" +
              //      ",dateAvis" +
                    ") VALUES (?,?,?,?,?,?)";
   
        PreparedStatement stm = null;           
            try {
                stm = cnt.prepareStatement(req);
            } catch (SQLException ex) {
                Logger.getLogger(avisDAO.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        try {
            stm.setInt(1,avs.getIdClient());
            stm.setInt(2,avs.getIdLigneDeCommande());
            stm.setString(3,avs.getISBN());
            stm.setInt(4,avs.getIdAvis());
            stm.setString(5,avs.getCommentaireAvis());
            stm.setInt(6,avs.getStatusDeValidationAvis());
            //stm.setDate(6,avs.getDateAvis());
        }  catch (SQLException ex) {
            Logger.getLogger(avisDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        try {
            stm.executeUpdate();           
            cnt.close();
        }  catch (SQLException ex) {
            Logger.getLogger(avisDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
 
    }
    
}
    




