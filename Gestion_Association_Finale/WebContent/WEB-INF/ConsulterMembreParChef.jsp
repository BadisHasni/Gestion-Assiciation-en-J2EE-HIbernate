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

<h3><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gestion des Missions: <samp>  Page de consultation des Membres</samp>
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



<div class="row">

<div class="col-md-2"></div>
  
         <div class="col-md-8">
         
          <div class="box pattern pattern-sandstone">
        
           <h5 id="titre3"><i class="icon-table">  Table des Membres  </i></h5> 
           
                            <div class="box-content box-table">
                                <table id="sample-table" class="table table-hover table-bordered tablesorter">
                                    <thead>
                                        <tr>
                                            <th>ID Membre</th>
                                            <th>Nom Membre</th>
                                            <th>Prenom</th>
                                            <th>Age</th>
                                            <th>Mail</th>
                                             <th>Date</th>
                                              <th>Login</th>
                                              <th>Sexe</th>
                                        
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                       <c:forEach var="i" begin="0" end="${tableau.size()-1}">
                                        <tr>
                                             <td><c:out value="${tableau[i].idMembre}"/></td>
                                            <td><c:out value="${tableau[i].nom}"/></td>
                                            <td><c:out value="${tableau[i].prenom}"/></td>
                                            <td><c:out value="${tableau[i].age}"/></td>
                                            <td><c:out value="${tableau[i].mail}"/></td>
                                            <td><c:out value="${tableau[i].date_naissance}"/></td>
                                            <td><c:out value="${tableau[i].login}"/></td>
                                             <td><c:out value="${tableau[i].sexe}"/></td>
                                           
                                           
                                        </tr>
                                        </c:forEach>
                                       
                                       
                                       
                                        
                                        
                                    </tbody>
                                </table>
             
                            </div>
                        </div>
                        
             <div class="row">
                  <div class="col-md-4"></div>
                     <div class="col-md-4">
                       <a href="<c:url value="ServletChef"/>" class="btn btn-warning">tableau de bord</a>
                     </div>
                  <div class="col-md-4"></div>
             </div><!-- row -->
         
         </br>
         </br>
         
         
         </div>

<div class="col-md-2"></div>
</div><!-- row -->



</div>


</body>
</html>