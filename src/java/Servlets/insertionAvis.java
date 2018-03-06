
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import objet.Avis;
import accesBDD.avisDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;

public class insertionAvis extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //recuperation des valeurs du formulaire
        String lc = request.getParameter("ligneCommande");
        String ISBN = request.getParameter("ISBN");
        String idc = request.getParameter("idClient");
        String not = request.getParameter("note");
        String com = request.getParameter("commentaire");

        int intLigneCommande = Integer.parseInt(lc);
        int intClient = Integer.parseInt(idc);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>idclient: " + idc + "</h1>");
            out.println("<h1>ligne commande:" + lc + "</h1>");
            out.println("<h1>ISBN :" + ISBN + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        Avis avi;//creer un objet 
        avi = new Avis();
        avi.setIdLigneDeCommande(intLigneCommande);
        avi.setISBN(ISBN);
        avi.setIdClient(intClient);      
        avi.setCommentaireAvis(com);
        avi.setStatusDeValidationAvis(20);
        switch(not){
            case "TresSatisfait":
                avi.setNoteAvis(20);
                break;
            case "Satisfait":
                avi.setNoteAvis(15);
                break;
            case "PasMal":
                avi.setNoteAvis(12);
                break;
            case "moyen":
                avi.setNoteAvis(10);
                break;
            case "nul":
                avi.setNoteAvis(0);
                break;  
            default:
                avi.setNoteAvis(20);
        }
        //on insert dans la base avec objetDAO
        
        try{
            avisDAO avid = new avisDAO();        
            if (avid.insertAvis(avi)){
                System.out.println("Ok, ça marche");
            } else {
                System.out.println("raté");
            }
        }catch (SQLException ex) {
            System.out.println("2) erreur sur la connexion");
            ex.printStackTrace();
        } catch (NamingException ex) {
            Logger.getLogger(insertionAvis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
