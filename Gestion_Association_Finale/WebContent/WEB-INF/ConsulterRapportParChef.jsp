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

<h3><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gestion des Missions: <samp>  Page de consultation des Rapports</samp>
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
            <div class="span10">
                 <div class="panel panel-default">
                    <div class="panel-heading"> <h5>Shortcuts</h5>
                    </div>
                       
                       <div class="panel-body">   
                    
                   
                          
                        
                           <a href="<c:url value="Servlet_consulter_membre_par_chef"/>" class="btn" ><i class="icon-user icon-large"></i><br/>Membres</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            
                           <a href="<c:url value="Servlet_consulter_mission_par_chef"/>" class="btn" ><i class="icon-bar-chart icon-large"></i><br/>Missions</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="Servlet_consulter_chef_par_chef"/>" class="btn" ><i class="icon-user icon-large"></i><br/>Chefs</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="Servlet_consulter_rapport_par_chef"/>" class="btn" ><i class="icon-user icon-large"></i><br/>Rapports</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="Servlet_consulter_mem_miss_par_chef"/>" class="btn" ><i class="icon-bar-chart icon-large"></i><br/>Membre/Mission</a>&nbsp;&nbsp;&nbsp;&nbsp; 
                           <a href="<c:url value="Servlet_consulter_categorie_par_chef"/>" class="btn" ><i class="icon-list-alt icon-large"></i><br/>Catégories</a>
                     </div>
               </div>
            </div>
        </div>
         
          <div class="col-md-2"></div>
         
        </div><!-- row -->


</br>
</br>

<div class="row">


  
         <div class="col-md-12">
         
          <div class="box pattern pattern-sandstone">
        
           <h5 id="titre3"><i class="icon-table">  Table de Rapport  </i></h5> 
           
                            <div class="box-content box-table">
                                <table id="sample-table" class="table table-hover table-bordered tablesorter">
                                    <thead>
                                    
                                        <tr>
                                            <th>Id Rapport</th>
                                            <th>Description</th>
                                             <th>Lieu</th>
                                             <th>Date</th>
                                              <th>Durée</th>
                                             <th>Budget_Totale</th>
                                            <th>Budget_Héber</th>
                                            <th>Budget_Nouri</th>
                                            <th>Budget_Trans</th>
                                            <th>Dons</th>
                                            <th>Autre Dépense</th>
                                           
                                            <th>Action</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                     <c:forEach var="i" begin="0" end="${tableau.size()-1}">
                                        <tr>
                                            <td><c:out value="${tableau[i].idRapport}"/></td>
                                            <td><c:out value="${tableau[i].description}"/></td>
                                            <td><c:out value="${tableau[i].lieu_mission}"/></td>
                                            <td><c:out value="${tableau[i].date_mission}"/></td>
                                            <td><c:out value="${tableau[i].duree_mission}"/></td>
                                            <td><c:out value="${tableau[i].budget_totale}"/></td>
                                            <td><c:out value="${tableau[i].budget_hebergement}"/></td>
                                            <td><c:out value="${tableau[i].budget_nourriture}"/></td>
                                            <td><c:out value="${tableau[i].budget_transport}"/></td>
                                            <td><c:out value="${tableau[i].dons}"/></td>
                                            <td><c:out value="${tableau[i].autre_depence}"/></td>
                                           
                                           
                                            <td class="td-actions">
                                     <div class="row">       
                                             <div class="col-md-2"></div>
                                             <div class="col-md-4"> 
                                                 <form method="get" action="Servlet_modifier_rapport_par_chef">
                                                   
                                                    <%--cette input est invisible grace a hidden pour monter l'id de produit a supprimer --%>
                                                   <input type="hidden" name="id" value="${tableau[i].idRapport}"/>
                                                   <input  type="submit" value="M" class="btn btn-small btn-info"/>
                                                      
                                                </form>
                                                
                                                </div><!-- col-md-4 -->
                                                <div class="col-md-4">
                                                
                                                <form method="post" action="Servlet_supprimer_rapport_par_chef">
                                                   
                                                    <%--cette input est invisible grace a hidden pour monter l'id de produit a supprimer --%>
                                                   <input type="hidden" name="id" value="${tableau[i].idRapport}"/>
                                                   <input  type="submit" value="S" class="btn btn-small btn-danger"/>
                                                      
                                                </form>
                                              <!--    <a href="<c:url value="Servlet_supprimer_rapport"/>" type="button" class="btn btn-small btn-danger">
                                                    <i class="btn-icon-only icon-remove"></i>
                                               </a>-->
                                                </div><!-- col-md-4 -->
                                                <div class="col-md-2"></div>
                                                </div><!-- row -->
                                            </td>
                                           
                                        </tr>
                                        </c:forEach>
                                       
                                     
                                      
                                    </tbody>
                                </table>
             
                            </div>
                        </div>
                        
                        <a href="<c:url value="Servlet_consulter_mission_par_chef"/>" class="btn btn-warning">Consulter Mission</a>

                                
                           <a href="<c:url value="ServletChef"/>" class="btn btn-warning" id="droite">tableau de bord</a>
         
         
         
         
         </div>


</div><!-- row -->



</div>

</br>
</br>

</body>
</html>