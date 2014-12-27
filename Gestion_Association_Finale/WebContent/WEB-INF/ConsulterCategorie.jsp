<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Index</title>
       <link type="text/css" rel="stylesheet" href="<c:url value="/assets/css/bootstrap.css"/>" />
       <link type="text/css" rel="stylesheet" href="<c:url value="/assets/css/bootstrap_badis.css"/>" />
        <link type="text/css" rel="stylesheet" href="<c:url value="/assets/css/bootstrap.min.css"/>" />
       <link type="text/css" rel="stylesheet" href="<c:url value="/assets/font-awesome/css/font-awesome.min.css"/>" />
       <link type="text/css" rel="stylesheet" href="<c:url value="/assets/js/bootstrap.js"/>" />
       <link type="text/css" rel="stylesheet" href="<c:url value="/assets/js/bootstrap.min.js"/>" />
        <link type="text/css" rel="stylesheet" href="<c:url value="/assets/js/jquery-1.10.2.min.js"/>" />
             <link type="text/css" rel="stylesheet" href="<c:url value="/assets/css/customize-template.css"/>" />
      
       
    </head>
    <body>
    
    <nav class="navbar navbar-inverse" role="navigation">

<h3><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gestion des Missions: <samp>  Page de consultation des Catégories</samp>
<a href="<c:url value="deconnexion"/>" class="btn btn-link" id="droite" >Deconnexion</a>

</strong> </h3>


</nav>
    
    <div class="container">
    
    
    
 <div class="row">

 <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
           
           
            <c:import url="/menu.jsp" />
           
        </div>
        <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6">
            <div class="listing listing-danger">
                <div class="shape">
                    <div class="shape-text">Infos</div>
                </div>
                <div class="listing-content">
                 <h3 id="tt">Votre Login: ${sessionScope.login}</h3>
                   
                    
                </div>
            </div>
        </div>
</div><!-- row -->

</br>
</br>



<div class="row">

<div class="col-md-2"></div>
  
         <div class="col-md-8">
         
          <div class="box pattern pattern-sandstone">
        
           <h5 id="titre3"><i class="icon-table">  Table des Catégories  </i></h5> 
           
                            <div class="box-content box-table">
                                <table id="sample-table" class="table table-hover table-bordered tablesorter">
                                    <thead>
                                        <tr>
                                            <th>ID Catégorie</th>
                                            <th>Nom Catégorie</th>
                                            <th>Description</th>
                                            <th>Action</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                       <c:forEach var="i" begin="0" end="${tableau.size()-1}">
                                        <tr>
                                           <td><c:out value="${tableau[i].idCategorie}"/></td>
                                            <td><c:out value="${tableau[i].nomCategorie}"/></td>
                                            <td><c:out value="${tableau[i].description}"/></td>
                                           
                                              <td class="td-actions">
                                              <div class="col-md-2"></div>      
                                             <div class="col-md-4"> 
                                              
                                              <form method="get" action="Servlet_modifier_categorie">
                                                   
                                                    <%--cette input est invisible grace a hidden pour monter l'id de produit a modofier --%>
                                                   <input type="hidden" name="id" value="${tableau[i].idCategorie}"/>
                                                   <input  type="submit" value="Modifier" class="btn btn-small btn-info"/>
                                                      
                                             </form>
                                              
                                             <!--    <a href="<c:url value="Servlet_modifier_categorie"/>"  type="button" class="btn btn-small btn-info">
                                                    <i><strong>M</strong></i>
                                                </a>-->
                                                 </div><!-- col-md-4 -->
                                               <div class="col-md-4">

                                               
                                                <form method="post" action="Servlet_supprimer_categorie">
                                                   
                                                    <%--cette input est invisible grace a hidden pour monter l'id de produit a supprimer --%>
                                                   <input type="hidden" name="id" value="${tableau[i].idCategorie}"/>
                                                   <input  type="submit" value="supprimer" class="btn btn-small btn-danger"/>
                                                      
                                                </form>

                                               <!--   <a href="<c:url value="Servlet_supprimer_categorie"/>" type="button" class="btn btn-small btn-danger">
                                                    <i class="btn-icon-only icon-remove"></i>
                                                </a>-->
                                                 </div><!-- col-md-4 -->
                                                 <div class="col-md-2"></div>
                                            </td>
                                           
                                        </tr>
                                       
                                       
                                       
                                    </tbody>
                                     </c:forEach>
                                </table>
             
                            </div>
                        </div>
                        
                        <a href="<c:url value="Servlet_ajouter_categorie"/>" class="btn btn-warning">Ajout Catégorie</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <a href="<c:url value="Servlet_affecter_categorie"/>" class="btn btn-warning">Affecter Cat/Miss</a>

                          <a href="<c:url value="ServletAdmin"/>" class="btn btn-warning" id="droite" >tableau de bord</a>
                                
         
         
         
         
         
         </div>

<div class="col-md-2"></div>
</div><!-- row -->



</div>

</br>
</br>

</body>
</html>