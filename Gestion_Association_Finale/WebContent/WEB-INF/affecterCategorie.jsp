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
      
       
        <!-- Les js et les css de formulaire  -->
       
       <link type="text/css" rel="stylesheet" media="screen" href="<c:url value="/assets/css/template.css"/>" />
       <link type="text/css" rel="stylesheet" media="screen" href="<c:url value="/assets/css/validationEngine.jquery.css"/>" />
  
      <script src="<c:url value="/assets/js/jquery.js"/>" type="text/javascript"></script>
       <script src="<c:url value="/assets/js/jquery.validationEngine-fr.js"/>" type="text/javascript"></script>
       <script src="<c:url value="/assets/js/jquery.validationEngine.js"/>" type="text/javascript"></script>
              
       
       
    </head>
    <body>
    
    <nav class="navbar navbar-inverse" role="navigation">

<h3><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Gestion des Missions: <samp>  Page d'affectation d'une Mission a une Catégorie</samp>
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
                    
                  
                          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                           <a href="<c:url value="ServletAdmin"/>" class="btn" ><i class="icon-list-alt icon-large"></i><br/>Index</a>&nbsp;&nbsp;&nbsp;&nbsp;
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
</br>


<div class="row">

<div class="col-md-3"></div>





  <div class="col-md-6">
  
                <div class="panel panel-default">
                      
                        <div class="panel-heading">
							<h4 id="titreformulaire"><strong>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Formulaire d'affectation d'une Mission a une Catégorie</strong> </h4>
						</div><!--panel-heading-->
						
						<!--Contenu-->
						<div class="panel-body">								 
						<!--Formulaire d'affectation d'une categorie**************************************************************************-->	 
															 
						<form method="post" action="Servlet_affecter_categorie">
							
							</br>
							</br>
							
						 <div class="row">
											<div class="form-group" id="formul1">
													<div class="col-md-1"></div><!--col-md-1-->	
													<div class="col-md-3">
													    
													    <label for="exampleInputCatégorie"><strong>Mission :</strong></label>
													
													</div><!--col-md-3-->	
													<div class="col-md-6">	
													        	
															<select id="disabledSelect" name="mission" class="form-control">
																<option selected>--une Mission--</option>	
																
																<c:forEach var="i" begin="0" end="${tableau.size()-1}">
																		<option name="mission" type="number" value="${tableau[i].idMission}"><c:out value="${tableau[i].nomMission}"/></option>
																	</c:forEach>
																												
															</select>								
																											
													</div><!--col-md-6-->
													<div class="col-md-2"></div><!--col-md-2-->
													</div><!--form-group-->
																		 
									</div><!--row-->	
							        
									
									</br>
									</br>
									
					<div class="row">
											<div class="form-group" id="formul1">
													<div class="col-md-1"></div><!--col-md-1-->	
													<div class="col-md-3">
													    
													    <label for="exampleInputCatégorie"><strong>Catégorie :</strong></label>
													
													</div><!--col-md-3-->	
													<div class="col-md-6">	
													        	
															<select id="disabledSelect" name="categorie" class="form-control">
																<option selected>--une catégorie--</option>	
																
																<c:forEach var="i" begin="0" end="${tableau2.size()-1}">
																		<option name="categorie" type="number" value="${tableau2[i].idCategorie}"><c:out value="${tableau2[i].nomCategorie}"/></option>
																	</c:forEach>
																												
															</select>								
																											
													</div><!--col-md-6-->
													<div class="col-md-2"></div><!--col-md-2-->
													</div><!--form-group-->
																		 
									</div><!--row-->	
						
									</br>
									</br>	
									
									
									<div class="row">
											<div class="col-md-4"></div><!--col-md-4-->	
												<div class="col-md-4">
																
																<input class="btn btn-warning" type="submit" value="Valider" />
																		   
													</div><!--col-md-4-->	
													<div class="col-md-4"></div><!--col-md-4-->		
																		
												</div><!--row-->	
							
							</form>
							
							
							<h6 id="astuce"><strong>Astuce:</strong>  Une affectation avec une tous les champs remplis 7 fois plus efficace ! .</h6>
							<h6 id="astuce"><strong>NB:</strong>  Tous les champs sont obligatoire ! .</h6>
                
                
                </div>
            
  
  
  
  
  
  
  
  </div>






  <div class="col-md-3"></div>
</div><!-- row -->


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    </div>
    
    
    

</body>
</html>