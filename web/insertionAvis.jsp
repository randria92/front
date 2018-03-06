<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Avis et Commentaire </title>
    </head>
    <body>
        <h1>Votre Avis !</h1>
        <form method="post" action="<c:url value="/insertionAvis"/>">
                                
            <label for="idClient">taper votre refference</label>
            <input type="text" name="idClient" id="idClient"/><br>
            <label for="ligneCommande">taper votre ligne de commande</label>
            <input type="text" name="ligneCommande"  id="ligneCommande"/><br>
            <label for="ISBN">taper réfference livre:</label>
            <input type="text"name="ISBN"  id="ISBN" /><br>                
            Cochez une note :<br>
            <label for="TresSatisfait">Tres Satisfait</label>
            <input type="radio" name="note" id="TresSatisfait" checked />
            <label for="Satisfait">Satisfait</label>
            <input type="radio" name="note" id="Satisfait" /> 
            <label for="PasMal">Pas mal</label>
            <input type="radio" name="note" id="PasMal" />
            <label for="Moyen">Moyen</label>
            <input type="radio" name="note" id="Moyen" /> 
            <label for="Nul">Nul</label>
            <input type="radio" name="note" id="Nul" />                
            <br>
        

                <textarea name="commentaire" rows="20" cols="50"> 
                </textarea><br>

                <input type ="reset" value ="Restaurer"/>  
                <input type ="submit" value ="Envoyer"/>

        </form>    
                  
    </body>
</html>
