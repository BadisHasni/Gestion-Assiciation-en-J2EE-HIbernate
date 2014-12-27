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
              
              
               <!-- Les js et les css de formulaire  -->
       
       <link type="text/css" rel="stylesheet" media="screen" href="<c:url value="/assets/css/template.css"/>" />
       <link type="text/css" rel="stylesheet" media="screen" href="<c:url value="/assets/css/validationEngine.jquery.css"/>" />
  
      <script src="<c:url value="/assets/js/jquery.js"/>" type="text/javascript"></script>
       <script src="<c:url value="/assets/js/jquery.validationEngine-fr.js"/>" type="text/javascript"></script>
       <script src="<c:url value="/assets/js/jquery.validationEngine.js"/>" type="text/javascript"></script>
              
       
              
<style>       
       #container1 {
    background-color: #F5F5F6;
}

.centered-form {
    margin-top: 120px;
    margin-bottom: 120px;
}

.centered-form .panel {
    background: rgba(255, 255, 255, 0.8);
    box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
}
</style>       
       
    </head>
    <body>

<div class="container">
 <div class="container" id="container1">
        <div class="row centered-form">
            <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title text-center"><strong>Entrer votre Login et Mot de passe :</strong></h3>
                    </div>
                    <div class="panel-body">
                    
                    
                    
                       <form method="post" action="connexion">
                        
                        
                        
                        
                        
                         <div class="row">
                                <div class="col-xs-4 col-sm-4 col-md-4">
                                    <div class="form-group" id="formul1">
                                    <label class="control-label" for="exampleInputCatégorie"><h5><strong>Login :</strong></h5></label>
                    
                                    </div>
                                </div>
                                <div class="col-xs-8 col-sm-8 col-md-8">
                                    <div class="form-group">
                                      <input class="validate[required]" id="user" type="text"  name="login" value="<c:out value="${login}"/>" />
                                      
                                     <!--   <h6 id="astuce">${form.erreurs['email']}</h6>-->
                                    </div>
                                </div>
                            </div>
                        
                          
                           

                            <div class="row">
                                <div class="col-xs-4 col-sm-4 col-md-4">
                                    <div class="form-group" id="formul1">
                                       <label class="control-label" for="inputSuccess1"><h5><strong> Mot de passe:</strong></h5></label>
                                       
                                    </div>
                                </div>
                                <div class="col-xs-8 col-sm-8 col-md-8">
                                    <div class="form-group">
                                       
                                        <input class="validate[required,length[3,11]] text-input" id="password" type="password"  name="pwd" value=""  placeholder="Mot de passe" />
                                        
                                      <!--     <h6 id="astuce">${form.erreurs['motdepasse']}</h6>-->
                                    </div>
                                </div>
                            </div>
                            
                            
                           <div class="row">
                                 <div class="col-md-4"></div>
                                <div class="col-md-4">
                                    <div class="form-group" id="formul1">
                                                         <select name="adminmission" name="categorie" >
																<option  selected>--Choisir une Catégorie--</option>
																<option value="Administrateur">Administrateur</option>
																<option value="Chef de Groupe">Chef de Groupe</option>
																<option value="Membre">Membre</option>
														</select>		                                       
                                    </div>
                                </div>
                                <div class="col-md-4"></div>
                            </div>
                            
                            
                            </br>
                            </br>
                           

                            <input type="submit" value="Connexion" class="btn btn-primary btn-block">
                            
                            </br>
                            <!-- message d'erreur -->
                             
								<!-- 	<strong><span> <p class="${empty form.erreurs ? 'succes' : 'erreur'}">${form.resultat}</p></span></strong>  -->
							
									
									
                            
                        </form>
                        <hr>
                        <h6 id="astuce"><strong><span>NB:</span></strong> Tous les Champs sont obligatoires</h6>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>



</div>











</body>
</html>