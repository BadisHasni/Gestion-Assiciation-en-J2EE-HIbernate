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

<h3><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Tableau de Bord : <samp>  Des statistiques de notre application</samp>


        
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
                    <div class="shape-text">Info</div>
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
                    
                   
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="Servlet_consulter_administrateur"/>" class="btn" ><i class="icon-user icon-large"></i><br/>Admin</a>&nbsp;&nbsp;&nbsp;&nbsp;
                          <a href="<c:url value="Servlet_consulter_membre"/>" class="btn" ><i class="icon-user icon-large"></i><br/>Membres</a>&nbsp;&nbsp;&nbsp;&nbsp;            
                           <a href="<c:url value="Servlet_consulter_mission"/>" class="btn" ><i class="icon-bar-chart icon-large"></i><br/>Missions</a>&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="Servlet_consulter_chef"/>" class="btn" ><i class="icon-user icon-large"></i><br/>Chefs</a>&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="Servlet_consulter_mem_miss"/>" class="btn" ><i class="icon-bar-chart icon-large"></i><br/>Membre/Mission</a>&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="Servlet_consulter_categorie"/>" class="btn" ><i class="icon-list-alt icon-large"></i><br/>Catégories</a>
                     </div>
               </div>
            </div>
        </div>
         
          <div class="col-md-2"></div>
         
        </div><!-- row -->



 </br>
     <h3 id="titre2"><strong>Des Statistiques</strong></h3>
     </br>
 
 <div class="row">
  <div class="col-md-6">
  

     
     <div class="span8">
     
        <div class="box pattern pattern-sandstone">
        
           <h5 id="titre3"><i class="icon-table">  Table des missions qu'ils dépassent le budget </i></h5> 
           
                            <div class="box-content box-table">
                                <table id="sample-table" class="table table-hover table-bordered tablesorter">
                                    <thead>
                                        <tr>
                                            <th>Nom Mission</th>
                                            <th>Budget initiale</th>
                                            <th>Budget Finale</th>
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                             <td></td>
                                           
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                             <td></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                             <td></td>
                                        </tr>
                                        <tr>
                                            <td></td>
                                          <td></td>
                                           <td></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    
            </div><!-- col-md-6 -->        
     
 <div class="col-md-6">
  

     
     <div class="span8">
    
        <div class="box pattern pattern-sandstone">
           
          
                               <h5 id="titre3"><i class="icon-table">  Table des Chef de chaque Mission</i></h5> 
                               
                          
           
                            <div class="box-content box-table">
    
                                <table id="sample-table" class="table table-hover table-bordered tablesorter">
                                    <thead>
                                        <tr>
                                            <th>Nom du Chef</th>
                                            <th>Nom Mission</th>
                                            
                                           
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                           
                                           
                                        </tr>
                                        
                                
                                  
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                    
            </div><!-- col-md-6 -->  
     
     </div><!-- row -->
     
     
     
  <div class="row">
  <div class="col-md-4"></div>
  
 <div class="col-md-4">
     
     <div class="span8">
        <div class="box pattern pattern-sandstone">
           
          
                               <h5 id="titre3"><i class="icon-table">  Table des Chef de chaque Mission</i></h5> 
                               
                          
           
                            <div class="box-content box-table">
    
                                <table id="sample-table" class="table table-hover table-bordered tablesorter">
                                    <thead>
                                        <tr>
                                            <th>Nom d'administrateur</th>
                                            <th>Nom Mission</th>
                                           
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                           
                                           
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                          
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                         
                                        </tr>
                                        <tr>
                                            <td></td>
                                            <td></td>
                                           
                                        </tr>
                                        <tr>
                                            <td></td>
                                          <td></td>
                                         
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                            </div>
                            </div>
                            </div>
                            </div>
                            
  
  <div class="col-md-4"></div>    
     
     </br>
     <h3 id="titre2"><strong>Les descriptions et les liens de chaque gestion pour un Administrateur</strong></h3>
     </br>
     
     
<div class="row">
  <div class="col-md-4"> 
         <div class="panel panel-success">
             <div class="panel-heading"><strong>Gestion de Mission</strong></div>
			  <div class="panel-body">
			    Panel de gestion d'une mission : ajout , consultation , modification et suppression des missions
			    </br>
			     </br>
			      </br>
			     
			       <a href="<c:url value="Servlet_ajouter_mission"/>" class="btn btn-success">Ajout Mission</a>
			        <a href="<c:url value="Servlet_consulter_mission"/>" class="btn btn-success" id="droite">Consulter liste</a>
			        
			   
               </div>
         
         </div>
  </div>
  
  <div class="col-md-4">
      <div class="panel panel-info">
      
          <div class="panel-heading"><strong>Gestion de Chef de groupe</strong></div>
			  <div class="panel-body">
			    Panel de gestion d'un chef de groupe : ajout , consultation , modification et suppression des chefs

			    </br>
			     </br>
			      </br>
			      <a href="<c:url value="Servlet_ajouter_chef"/>" class="btn btn-info">Ajout Chef</a>
			   <a href="<c:url value="Servlet_consulter_chef"/>" class="btn btn-info" id="droite">Consulter liste</a>
			    
		  </div>
      </div>
  </div>
  <div class="col-md-4">
      <div class="panel panel-warning">
      
       <div class="panel-heading"><strong>Gestion des Membres</strong></div>
		  <div class="panel-body">
		   Panel de gestion d'un membre : ajout , consultation , modification et suppression des membres

			    </br>
			     </br>
			      </br>
			      <a href="<c:url value="Servlet_ajouter_membre"/>" class="btn btn-warning">Ajouter</a>&nbsp;&nbsp;&nbsp;
			      <a href="<c:url value="Servlet_affecter_membre"/>" class="btn btn-warning">Affecter Mem/Miss</a>
			   <a href="<c:url value="Servlet_consulter_membre"/>" class="btn btn-warning" id="droite">Consulter</a>
			    
	    </div>
      
      </div>
  </div>
 
</div> <!-- row -->
    
 <div class="row">    
      <div class="col-md-4">
            <div class="panel panel-danger">
            
             <div class="panel-heading"><strong>Gestion des Catégories</strong></div>
				  <div class="panel-body">
				  Panel de gestion d'une Catégorie : ajout , consultation , modification et suppression des catégories

			    </br>
			     </br>
			      </br>
			      &nbsp;
			      <a href="<c:url value="Servlet_ajouter_categorie"/>" class="btn btn-danger">Ajouter</a>&nbsp;
			      <a href="<c:url value="Servlet_affecter_categorie"/>" class="btn btn-danger">Affecter Cat/Miss</a>&nbsp;
			      <a href="<c:url value="Servlet_consulter_categorie"/>" class="btn btn-danger">Consulter</a>
			      
			 
		     </div>
            
            </div>
       </div>
       
       <div class="col-md-4"></div>
       
       <div class="col-md-4">
            <div class="panel panel-primary">
            
             <div class="panel-heading"><strong>Gestion Administrateur</strong></div>
				  <div class="panel-body">
				  Panel de gestion d'un Administrateur : ajout , consultation , modification et suppression des administrateurs

			    </br>
			     </br>
			      </br>
			      <a href="<c:url value="Servlet_ajouter_administrateur"/>" class="btn btn-info">Ajout Administrateur</a>
			      <a href="<c:url value="Servlet_consulter_administrateur"/>" class="btn btn-info" id="droite">Consulter liste</a>
			    
			</div>
            
            </div>
       </div>
</div><!-- row -->

</br>
</br>
</br>
     
     
     
     
     
     
     

</div><!-- conteneur -->










</body>
</html>