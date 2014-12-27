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

<h3><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gestion des Missions: <samp>  Page de consultation des Chef de Groupe</samp>
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

<div class="col-md-1"></div>
  
         <div class="col-md-10">
         
          <div class="box pattern pattern-sandstone">
        
           <h5 id="titre3"><i class="icon-table">  Table des Chefs de Groupe  </i></h5> 
           
                            <div class="box-content box-table">
                                <table id="sample-table" class="table table-hover table-bordered tablesorter">
                                    <thead>
                                        <tr>
                                            <th>ID Chef</th>
                                            <th>Nom Chef</th>
                                            <th>Prenom</th>
                                            <th>Age</th>
                                            <th>Mail</th>
                                            <th>Date</th>
                                             <th>Login</th>
                                             <th>Sexe</th>
                                             <th>Rue</th>
                                              <th>Numéro</th>
                                              <th>Code Postale</th>
                                            <th>Action</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                     <c:forEach var="i" begin="0" end="${tableau.size()-1}">
                                        <tr>
                                            <td><c:out value="${tableau[i].idChef}"/></td>
                                            <td><c:out value="${tableau[i].nom}"/></td>
                                            <td><c:out value="${tableau[i].prenom}"/></td>
                                            <td><c:out value="${tableau[i].age}"/></td>
                                            <td><c:out value="${tableau[i].mail}"/></td>
                                             <td><c:out value="${tableau[i].date_naissance}"/></td>
                                              <td><c:out value="${tableau[i].login}"/></td>
                                              <td><c:out value="${tableau[i].sexe}"/></td>
                                              <td><c:out value="${tableau[i].monAdresse.rue}"/></td>
                                              <td><c:out value="${tableau[i].monAdresse.numero}"/></td>
                                              <td><c:out value="${tableau[i].monAdresse.codePostal}"/></td>
                                              <td class="td-actions">
                                              <div class="col-md-2"></div>      
                                             <div class="col-md-4"> 
                                              <form method="get" action="Servlet_modifier_chef">
                                                   
                                                    <%--cette input est invisible grace a hidden pour monter l'id de produit a modofier --%>
                                                   <input type="hidden" name="id" value="${tableau[i].idChef}"/>
                                                   <input  type="submit" value="Modifier" class="btn btn-small btn-info"/>
                                                      
                                             </form>
                                              
                                                <!--   <a href="<c:url value="Servlet_modifier_chef"/>"  type="button" class="btn btn-small btn-info">
                                                    <i><strong>M</strong></i>
                                                </a>-->
                                              </div><!-- col-md-4 -->
                                              <div class="col-md-4">
                                             <form method="post" action="Servlet_supprimer_chef">
                                                   
                                                    <%--cette input est invisible grace a hidden pour monter l'id de produit a supprimer --%>
                                                   <input type="hidden" name="id" value="${tableau[i].idChef}"/>
                                                   <input  type="submit" value="supprimer" class="btn btn-small btn-danger"/>
                                                      
                                                </form>
                                            

                                              <!--    <a href="<c:url value="Servlet_supprimer_chef"/>" type="button" class="btn btn-small btn-danger">
                                                    <i class="btn-icon-only icon-remove"></i>
                                                </a>-->
                                                </div><!-- col-md-4 -->
                                                <div class="col-md-4"></div>
                                            </td>
                                           
                                        </tr>
                                       
                                      
                                       </c:forEach>
                                      
                                    </tbody>
                                </table>
             
                            </div>
                        </div>
                        
                                
         <a href="<c:url value="Servlet_ajouter_chef"/>" class="btn btn-warning">Ajout Chef</a>
          <a href="<c:url value="ServletAdmin"/>" class="btn btn-warning" id="droite" >tableau de bord</a>
         
         
         
         
         </div>

<div class="col-md-1"></div>
</div><!-- row -->



</div>


</body>
</html>