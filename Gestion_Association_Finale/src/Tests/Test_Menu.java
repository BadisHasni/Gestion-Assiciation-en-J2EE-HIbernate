package Tests;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;



import persistance.HibernateUtil;
import beans.Administrateur;
import beans.Adresse;
import beans.Categorie;
import beans.Chef_de_Groupe;
import beans.Membre;
import beans.Mission;
import beans.Mission_Membre;
import beans.Rapport;
import beans.RapportInterAdmin;
import beans.RapportJustifier;
import DAO.AbstractDAOFactory;
import DAO.AdministrateurDAO;
import DAO.CategorieDAO;
import DAO.ChefDAO;
import DAO.DAO;
import DAO.MembreDAO;
import DAO.MissionDAO;
import DAO.Mission_MembreDAO;
import DAO.RapportDAO;

public class Test_Menu{

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
    SessionFactory sessionfactory =HibernateUtil.getSessionFactory();	
		
	AbstractDAOFactory abs = AbstractDAOFactory.getFactory(0);
		
	DAO<Administrateur> administrateurDao = abs.getAdministrateurDAO();
	DAO<Mission> missionDao = abs.getMissionDAO();
	DAO<Categorie> categorieDao = abs.getCategorieDAO();
	DAO<Chef_de_Groupe> chefDao =abs.getChefDAO();
	DAO<Membre> membreDao = abs.getMembreDAO();
	DAO<Mission_Membre> mission_membreDao = abs.getMission_Membre();
	DAO<Rapport> rapportDao = abs.getRapport();
	
		
		
		int number=0;
		int number2=0;
		String nomMission="";
		String descriptionMission="";
		String lieuMission="";
		String dateMission="";
		String budgetMission="";
		int chefMission=0;
		int AdminMission=0;
		int RapportMission=0;
		int missionsupp=0;
		int missioncherche=0;
		String nomAdministrateur="";
		String prenomAdministrateur="";
		String mailAdministrateur="";
		String dateAdministrateur="";
		String mdpAdministrateur="";
		String loginAdministrateur="";
		int administrateursupp=0;
		int administrateurcherche=0;
		String nomChef="";
		String prenomChef="";
		String mailChef="";
		int ageChef=0;
		String mdpChef="";
		String dateChef="";
		String loginChef="";
		String sexeChef="";
		String rueChef="";
		int numeroChef=0;
		int codeChef=0;
		int chefsupp=0;
		int chefcherche=0;
		String descriptionRapport="";
		String lieuRapport="";
		String dateRapport="";
		String durréeRapport="";
		int budgetTRapport=0;
		int budgetHRapport=0;
		int budgetNRapport=0;
		int budgetTRRapport=0;
		int donsRapport=0;
		int autreDRapport=0;
		int rapportsupp=0;
		int rapportcherche=0;
		String nomCat="";
		String descriptionCat="";
		int catsupp=0;
		int Catcherche=0;
		int missionaffecté=0;
		int Cataffecté=0;
		String nomMembre="";
		String prenomMembre="";
		int ageMembre=0;
		String mailMembre="";
		String dateMembre="";
		String mdpMembre="";
		String loginMembre="";
		String sexeMembre="";
		int memsupp=0;
		int Membrecherche=0;
		int Membreaffecté=0;
		int Missionaffecté=0;
		String durMission="";
		int CatModif=0;
		int chefModif=0; 
		int MembreModif=0;
		int rapportmodif=0;
		int missionmodif=0;
		String SupliRapport="";
		String reamrqueRapport="";
		int rapportmission=0;
		int idMembre=0;
		int idMission=0;
		
do{
		
		System.out.println("*****************************");
		System.out.println("Gestion d'une Mission:----------- 1");
		System.out.println("Gestion d'un Administrateur:----- 2");
		System.out.println("Gestion d'un Chef de groupe:----- 3");
		System.out.println("Gestion d'un Rapport:------------ 4");
		System.out.println("Gestion d'une Catégorie:--------- 5");
		System.out.println("Gestion d'un Membre:------------- 6");
		System.out.println("Des Statistiques:---------------- 7");
		System.out.println("Sortie:-------------------------- 8");
        System.out.println("******************************");
        
        
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Choisir un muméro parmi ce Menu:");
		number=Integer.parseInt(buffer.readLine());
		
		switch (number)
		{
		
		/*--------------------------------Début case 1 (Gestion Mission)---------------------------------*/

		  case 1:
				System.out.println("*************************************");
				System.out.println("*************************************");
			    System.out.println("Ajouter une Mission:--------------- 1");
				System.out.println("Supprimer une Mission:------------- 2");
				System.out.println("Consulter les Missions:------------ 3");
				System.out.println("Chercher une Mission selon id:----- 4");
				System.out.println("Modifier une Mission:-------------- 5");
		        System.out.println("*************************************");
		        
		        BufferedReader buffer2=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choisir un muméro parmi ce Menu:");
				number2=Integer.parseInt(buffer2.readLine());
		        
			
			switch (number2)
		        {
		          case 1:
		        	  
		        	    BufferedReader bufferM=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le nom de Mission:");
		      			nomMission=bufferM.readLine();
		      			
		      			BufferedReader bufferM1=new BufferedReader(new InputStreamReader(System.in));
		      			System.out.println("Saisie la description d'une mission:");
		      			descriptionMission=bufferM1.readLine();
		      				
		      			BufferedReader bufferM2=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le lieu de Mission:");
		      			lieuMission=bufferM2.readLine();
		      			
		      			BufferedReader bufferM3=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le date de Mission:");
		      			dateMission=bufferM3.readLine();
		      			
		      			BufferedReader bufferM4=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le budget de Mission:");
		      			budgetMission=bufferM4.readLine();
		      			
		      			
		      			

			        	  //affichage des Chef de groupe a partir de la liste
							System.out.println("Liste des Chef de groupe Dans notre Bases :");
							List<Chef_de_Groupe> c1 = chefDao.Afficher();
							
							int i22=0;
							for (Chef_de_Groupe chef : c1){
								
								
								System.out.println("* " + chef.getNom() + ":" +  chef.getIdChef() + " . ");
								
								i22++;
								
							}
		      		
		      			BufferedReader bufferM5=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id de chef affecter a cette mission:");
		      			chefMission=Integer.parseInt(bufferM5.readLine());
		      		
		      			
		      			 //affichage des Administrateur a partir de la liste
						System.out.println("Liste des Administrateur Dans notre Bases :");
						List<Administrateur> ad = administrateurDao.Afficher();
						
						int i=0;
						for (Administrateur admin : ad){
							
							
							System.out.println("* " + admin.getNom() + ":" +  admin.getIdAdministrateur() + "  --  ");
							
							i++;
							
						}
		        	  
						BufferedReader bufferM6=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id d'administrateur qui affecte cette mission:");
		      			AdminMission=Integer.parseInt(bufferM6.readLine());
		      			
		      			
		      			
		      			
		        		Session session1=sessionfactory.openSession();	
		        		Transaction tx=session1.beginTransaction();
		      		    Chef_de_Groupe c =(Chef_de_Groupe)session1.get(Chef_de_Groupe.class,chefMission);
	      		
			      		Session session3=sessionfactory.openSession();	
		        		Transaction tx3=session3.beginTransaction();
			      		//Session session3=sessionfactory.openSession();	
		        		//Transaction tx3=session3.beginTransaction();
			      		Administrateur a =(Administrateur)session3.get(Administrateur.class, AdminMission);
			      		
			      		
			      		
			      	
//			      	    tx2.commit();
//						session2.close();
//	      			
						tx.commit();
						session1.close();
//			      		
						tx3.commit();
						session3.close();
			
			      	    
		        	    Mission m =  new Mission();
			      		
			      		m.setnomMission(nomMission);
			      		m.setBudget(budgetMission);
			      		m.setlieuMission(lieuMission);
			      		m.setdescription(descriptionMission);
			      		m.setdateMission(dateMission);
			      		m.setAdministrateur(a);
			      		m.setChef(c);
			      		//c.getMission().add(m);
			      		//a.getMission().add(m);
			      	
			      	
			      		
			      		missionDao.create(m);
			      		
			      		
         
			      		break;
		          
		          
		          
		          case 2:
		        	  
		        	 
		        	    //affichage des Missions a partir de la liste
						System.out.println("Liste des Missions Dans notre Bases :");
                        List<Mission> mmm = missionDao.Afficher();
						
						int im=0;
						for (Mission missi : mmm){
							
							
							System.out.println("* " + missi.getnomMission() + ":" +  missi.getIdMission() + " .");
							
							im++;
							
						}
						
					
		      			
		      			BufferedReader bufferM8=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id de Mission supprimer:");
		      		    missionsupp=Integer.parseInt(bufferM8.readLine());
		      		    
		      		    
		      		    Mission m1= new Mission();
		      		    
		      		    missionDao.delete(m1,missionsupp);
		      			
		      			break;
		      			
		         case 3: 	
		        	 
		        	//affichage des Missions a partir de la liste
						System.out.println("Liste des Missions Dans notre Bases :");
                        List<Mission> mmm1 = missionDao.Afficher();
						
						int im1=0;
						for (Mission missi : mmm1){
							
							
							System.out.println("* " + missi.getIdMission() + ":" +  missi.getnomMission() + "--" +  missi.getdescription() +"--" +  missi.getlieuMission() +"--" +  missi.getdateMission() +"--" +  missi.getBudget()+" ***** affecté par l'admine  ****" +  missi.getAdministrateur().getIdAdministrateur()+":"+missi.getAdministrateur().getNom()+" **** et pour le chef **** "+missi.getChef().getIdChef()+":"+missi.getChef().getNom()+"." );
							
							im1++;
							
						}
						
						break;
		        	  
		         case 4:		
		        	 
		        	 
		        	//affichage des Chefs a partir de la liste
						System.out.println("Liste des Missions Dans notre Bases :");
						 List<Mission> mmm11 = missionDao.Afficher();
							
							int im11=0;
							for (Mission missi : mmm11){
								
								
								System.out.println("* " + missi.getnomMission() + ":" +  missi.getIdMission() + " .");
								
								im11++;
								
							}
		      			
		      			BufferedReader bufferM9=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id de Mission chercher:");
		      		    missioncherche=Integer.parseInt(bufferM9.readLine());

		        	    missionDao.find(missioncherche);
		        	   
		        	    break;
		         case 5: 
		        	 
                       System.out.println("Liste des Missions Dans notre Bases :");
                       List<Mission> mmm12 = missionDao.Afficher();
						
						int im12=0;
						for (Mission missi : mmm12){
							
							
							System.out.println("* " + missi.getIdMission() + ":" +  missi.getnomMission() + "--" +  missi.getdescription() +"--" +  missi.getlieuMission() +"--" +  missi.getdateMission() +"--" +  missi.getBudget()+" ***** affecté par l'admine  ****" +  missi.getAdministrateur().getIdAdministrateur()+":"+missi.getAdministrateur().getNom()+" **** et pour le chef **** "+missi.getChef().getIdChef()+":"+missi.getChef().getNom()+"." );
							
							im12++;
							
						}
		      			
						BufferedReader bufferM10=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id de Mission modifier:");
		      		    missionmodif=Integer.parseInt(bufferM10.readLine());
		      		    
		      		    //*****************************************************************
		      		    

		        	    BufferedReader bufferMM=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le nom de Mission:");
		      			nomMission=bufferMM.readLine();
		      			
		      			BufferedReader bufferMM1=new BufferedReader(new InputStreamReader(System.in));
		      			System.out.println("Saisie la description d'une mission:");
		      			descriptionMission=bufferMM1.readLine();
		      				
		      			BufferedReader bufferMM2=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le lieu de Mission:");
		      			lieuMission=bufferMM2.readLine();
		      			
		      			BufferedReader bufferMM3=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le date de Mission:");
		      			dateMission=bufferMM3.readLine();
		      			
		      			BufferedReader bufferMM4=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le budget de Mission:");
		      			budgetMission=bufferMM4.readLine();
		      			
		      		
						
			      		Mission m11 =  new Mission(); 
				      		
				      		m11.setnomMission(nomMission);
				      		m11.setBudget(budgetMission);
				      		m11.setlieuMission(lieuMission);
				      		m11.setdescription(descriptionMission);
				      		m11.setdateMission(dateMission);
			      		
				      
				      		
				      		missionDao.update(m11, missionmodif);
			      		
			      		
		        break;
		        }
			break;
			/*--------------------------------Fin case 1 (Gestion Mission)---------------------------------*/
			
			
			/*--------------------------------Début case 2 (Gestion Administrateur)---------------------------------*/
			
		  case 2:
			    System.out.println("********************************************");
				System.out.println("********************************************");
			    System.out.println("Ajouter un Administrateur:---------------- 1");
				System.out.println("Supprimer un Administrateur:-------------- 2");
				System.out.println("Consulter les Administrateur:------------- 3");
				System.out.println("Chercher un Administrateur selon id:------ 4");
				System.out.println("Modifier un Administrateur:--------------- 5");
		        System.out.println("********************************************");
		        
		        BufferedReader buffer9=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choisir un muméro parmi ce Menu:");
				number2=Integer.parseInt(buffer9.readLine());
		        
			
			switch (number2)
		        {
		          case 1:
		        	  
		        	    BufferedReader bufferA=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le nom d'un Administrateur:");
		      			nomAdministrateur=bufferA.readLine();
		      			
		      			BufferedReader bufferA1=new BufferedReader(new InputStreamReader(System.in));
		      			System.out.println("Saisie le prenom d'un Administrateur:");
		      			prenomAdministrateur=bufferA1.readLine();
		      				
		      			BufferedReader bufferA2=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le mail d'un Administrateur:");
		      			mailAdministrateur=bufferA2.readLine();
		      			
		      			BufferedReader bufferA3=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le date de naissance d'un Administrateur:");
		      			dateAdministrateur=bufferA3.readLine();
		      			
		      			BufferedReader bufferA4=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le Mot de passe d'un Administrateur:");
		      			mdpAdministrateur=bufferA4.readLine();
			  
		      			BufferedReader bufferA5=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie la login d'un administrateur:");
		      			loginAdministrateur=bufferA5.readLine();
		      			
		      			
		      			Administrateur adm=new Administrateur();
		      			adm.setNom(nomAdministrateur);
		      			adm.setPrenom(prenomAdministrateur);
		      			adm.setDate_naissance(dateAdministrateur);
		      			adm.setLogin(loginAdministrateur);
		      			adm.setMail(mailAdministrateur);
		      			adm.setMdp(mdpAdministrateur);
		      			
		      			administrateurDao.create(adm);
		      			
		      			break;
		      			
		          case 2:

		        	    //affichage des Administrateur a partir de la liste
						System.out.println("Liste des Administrateur Dans notre Bases :");
						List<Administrateur> ad = administrateurDao.Afficher();
						
						int i=0;
						for (Administrateur admin : ad){
							
							
							System.out.println("* " + admin.getNom() + ":" +  admin.getIdAdministrateur() + "  --  ");
							
							i++;
							
						}
		      			
		      			BufferedReader bufferA6=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id d'administrateur supprimer:");
		      		    administrateursupp=Integer.parseInt(bufferA6.readLine());
		      		    
		      		    
		      		    Administrateur a1 = new Administrateur();
		      		    
		      		    administrateurDao.delete(a1,administrateursupp);
		      			
		      			break;
		        	  
		          case 3: 
		        	  
		        	     System.out.println("Liste des Administrateur Dans notre Bases :"); 
			        	 List<Administrateur> ad1 = administrateurDao.Afficher();
								
			        	    int i1=0;
							for (Administrateur admin : ad1){
			        	 
								System.out.println("* " + admin.getIdAdministrateur() + ":" +  admin.getNom() + " -- "+admin.getPrenom() + " -- "+admin.getMail()+" -- "+admin.getDate_naissance()+" -- "+admin.getLogin()+" . ");
                                i1++;
								
							}
		        	  
		        	  
		        	        break;
		        	  
		          case 4:	  
		        	  
		        	  //affichage des Administrateur a partir de la liste
						System.out.println("Liste des Administrateur Dans notre Bases :");
						List<Administrateur> ad2 = administrateurDao.Afficher();
						
						int i2=0;
						for (Administrateur admin : ad2){
							
							
							System.out.println("* " + admin.getNom() + ":" +  admin.getIdAdministrateur() + "  --  ");
							
							i2++;
							
						}
		      			
		      			BufferedReader bufferA7=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id d'un administrateur chercher:");
		      		    administrateurcherche=Integer.parseInt(bufferA7.readLine());

		        	    administrateurDao.find(administrateurcherche);
		        	    
		        	    break;
		        	   
		          case 5:  
		        	  
		        	  //affichage des Administrateur a partir de la liste
						System.out.println("Liste des Administrateur Dans notre Bases :");
						List<Administrateur> ad21 = administrateurDao.Afficher();
						
						int i22=0;
						for (Administrateur admin : ad21){
							
							
							System.out.println("* " + admin.getNom() + ":" +  admin.getIdAdministrateur() + "  --  ");
							
							i22++;
							
						}
						
						
						BufferedReader bufferA77=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id d'un administrateur chercher:");
		      		    administrateurcherche=Integer.parseInt(bufferA77.readLine());
		      		    
		      		    Administrateur a11 = new Administrateur();
		      		    
		      		    
		      		    
		      		    
		      		    //****************************************************************************
		      		    
		      		  BufferedReader bufferAA=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le nom d'un Administrateur:");
		      			nomAdministrateur=bufferAA.readLine();
		      			
		      			BufferedReader bufferAA1=new BufferedReader(new InputStreamReader(System.in));
		      			System.out.println("Saisie le prenom d'un Administrateur:");
		      			prenomAdministrateur=bufferAA1.readLine();
		      				
		      			BufferedReader bufferAA2=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le mail d'un Administrateur:");
		      			mailAdministrateur=bufferAA2.readLine();
		      			
		      			BufferedReader bufferAA3=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le date de naissance d'un Administrateur:");
		      			dateAdministrateur=bufferAA3.readLine();
		      			
		      			BufferedReader bufferAA4=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le Mot de passe d'un Administrateur:");
		      			mdpAdministrateur=bufferAA4.readLine();
			  
		      			BufferedReader bufferAA5=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie la login d'un administrateur:");
		      			loginAdministrateur=bufferAA5.readLine();
		      		    
		      		    //****************************************************************************
		      		    
		      		    
		      		    
		      		    
                        a11.setNom(nomAdministrateur);
                        a11.setPrenom(prenomAdministrateur);
                        a11.setMail(mailAdministrateur);
                        a11.setDate_naissance(dateAdministrateur);
                        a11.setMdp(mdpAdministrateur);
                        a11.setLogin(loginAdministrateur);
      		    
		        	    administrateurDao.update(a11,administrateurcherche);

		        	  
		        	  break;
	
            }
			
			break;
		/*--------------------------------Fin case 2 (Gestion Administrateur)---------------------------------*/
  			
  			
		/*--------------------------------Début case 3 (Gestion Chef de groupe)---------------------------------*/
				  			
			
		  case 3:
			  
			  System.out.println("*****************************");
				System.out.println("*****************************");
			    System.out.println("Ajouter un Chef de groupe:----------------- 1");
				System.out.println("Supprimer un Chef de groupe:--------------- 2");
				System.out.println("Consulter les Chef de groupe:-------------- 3");
				System.out.println("Chercher un Chef de groupe selon id:------- 4");
				System.out.println("Modifier un Chef de groupe:---------------- 5");
		        System.out.println("******************************");
		        
		        BufferedReader buffer10=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Choisir un muméro parmi ce Menu:");
				number2=Integer.parseInt(buffer10.readLine());
		        
			
			switch (number2)
		        {
		          case 1:
		        	  
		        	    BufferedReader bufferC=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le nom d'un Chef de groupe:");
		      			nomChef=bufferC.readLine();
		      			
		      			BufferedReader bufferC1=new BufferedReader(new InputStreamReader(System.in));
		      			System.out.println("Saisie le prenom d'un Chef de groupe:");
		      			prenomChef=bufferC1.readLine();
		      				
		      			BufferedReader bufferC2=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le mail d'un Chef de groupe:");
		      			mailChef=bufferC2.readLine();
		      			
		      			BufferedReader bufferC3=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie l'age d'un Chef de groupe:");
		      			ageChef=Integer.parseInt(bufferC3.readLine());
		      			
		      			BufferedReader bufferC4=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le Mot de passe d'un Chef de groupe:");
		      			mdpChef=bufferC4.readLine();
			  
		      			BufferedReader bufferC5=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie la login d'un Chef de groupe:");
		      			loginChef=bufferC5.readLine();
		      			
		      			BufferedReader bufferC6=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le sexe d'un Chef de groupe:");
		      			sexeChef=bufferC6.readLine();
		      			
		      			BufferedReader bufferC7=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie la date de naissance d'un Chef de groupe:");
		      			dateChef=bufferC7.readLine();
		      			
		      			
		      			
		      			
		      			
		      			BufferedReader bufferC44=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le La rue d'un Chef de groupe:");
		      			rueChef=bufferC44.readLine();
			  
		      			BufferedReader bufferC55=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie le numéro d'un Chef de groupe:");
		      			numeroChef=Integer.parseInt(bufferC55.readLine());
		      			
		      			BufferedReader bufferC66=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Saisie l code postale d'un Chef de groupe:");
		      			codeChef=Integer.parseInt(bufferC66.readLine());
		      			
		      			
		      			
		      			Chef_de_Groupe c=new Chef_de_Groupe();
		      			c.setNom(nomChef);
		      			c.setPrenom(prenomChef);
		      			c.setMail(mailChef);
		      			c.setAge(ageChef);
		      			c.setLogin(loginChef);
		      			c.setMdp(mdpChef);
		      			c.setSexe(sexeChef);
		      			c.setDate_naissance(dateChef);
		      			
		      			Adresse ad1= new Adresse();
		      			ad1.setRue(rueChef);
		      			ad1.setNumero(numeroChef);
		      			ad1.setCodePostal(codeChef);
		      			
		      			
		      			c.setMonAdresse(ad1);
	             		chefDao.create(c);
		      			
		      			break;
		      			
		        	  
		        	  
		        	  
		          case 2:
		        	  
		        	  //affichage des Chef de groupe a partir de la liste
						System.out.println("Liste des Chef de groupe Dans notre Bases :");
						List<Chef_de_Groupe> c1 = chefDao.Afficher();
						
						int i22=0;
						for (Chef_de_Groupe chef : c1){
							
							
							System.out.println("* " + chef.getNom() + ":" +  chef.getIdChef() + " . ");
							
							i22++;
							
						}
						
						
		      			BufferedReader bufferC8=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id de chef de groupe de groupe a supprimer:");
		      		    chefsupp=Integer.parseInt(bufferC8.readLine());
		      		    
		      		    
		      		    Chef_de_Groupe cc = new Chef_de_Groupe();
		      		    
		      		    chefDao.delete(cc,chefsupp);
		      			
		      			break;
		        	  
		        	   
		          case 3:
		        	  
		        	     System.out.println("Liste des Chefs de groupe Dans notre Bases :"); 
		                 List<Chef_de_Groupe> c11 = chefDao.Afficher();
							
							int i221=0;
							for (Chef_de_Groupe chef : c11){
								
								
								System.out.println("* " + chef.getIdChef() + ":" +  chef.getNom() + " -- "+  chef.getPrenom() +" -- "+  chef.getMail() +" -- "+  chef.getAge() +" -- "+  chef.getDate_naissance() +" -- "+  chef.getLogin() +" -- "+  chef.getSexe() +" -- "+chef.getMonAdresse().getRue()+ " -- "+chef.getMonAdresse().getNumero()+" -- "+chef.getMonAdresse().getCodePostal()+" . ");
								
								i221++;
								
							}
			        	 
		
		        	        break;
		        	  
		          case 4:
		        	  
		        	    //affichage des Chef de groupe a partir de la liste
						System.out.println("Liste des Chef de groupe Dans notre Bases :");
                        List<Chef_de_Groupe> c121 = chefDao.Afficher();
						
						int i223=0;
						for (Chef_de_Groupe chef : c121){
							
							
							System.out.println("* " + chef.getNom() + ":" +  chef.getIdChef() + "  --  ");
							
							i223++;
							
						}
		      			
		      			BufferedReader bufferC9=new BufferedReader(new InputStreamReader(System.in));
		      		    System.out.println("Choisir l'id d'un chef de groupe chercher:");
		      		    chefcherche=Integer.parseInt(bufferC9.readLine());

		        	    chefDao.find(chefcherche);
		        	    
		        	    break;
		        	   

		        	    
		          case 5:
		        	  
		        	  System.out.println("Liste des Chefs de groupe Dans notre Bases :"); 
		        	  List<Chef_de_Groupe> cc11 = chefDao.Afficher();
						
						int i2211=0;
						for (Chef_de_Groupe chef : cc11){
							
							
							System.out.println("* " + chef.getIdChef() + ":" +  chef.getNom() + " -- "+  chef.getPrenom() +" -- "+  chef.getMail() +" -- "+  chef.getAge() +" -- "+  chef.getDate_naissance() +" -- "+  chef.getLogin() +" -- "+  chef.getSexe() +" -- "+ chef.getMonAdresse().getRue()+ " -- "+ chef.getMonAdresse().getNumero()+" -- "+chef.getMonAdresse().getCodePostal()+" . ");
							
							i2211++;
							
						}
							
							BufferedReader bufferC10=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Choisir l'id d'un chef de groupe modifier:");
			      		    chefModif=Integer.parseInt(bufferC10.readLine());
							
		        	  //****************************************************************************
			      		  BufferedReader bufferCC=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie le nom d'un Chef de groupe:");
			      			nomChef=bufferCC.readLine();
			      			
			      			BufferedReader bufferCC1=new BufferedReader(new InputStreamReader(System.in));
			      			System.out.println("Saisie le prenom d'un Chef de groupe:");
			      			prenomChef=bufferCC1.readLine();
			      				
			      			BufferedReader bufferCC2=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie le mail d'un Chef de groupe:");
			      			mailChef=bufferCC2.readLine();
			      			
			      			BufferedReader bufferCC3=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie l'age d'un Chef de groupe:");
			      			ageChef=Integer.parseInt(bufferCC3.readLine());
			      			
			      			BufferedReader bufferCC4=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie le Mot de passe d'un Chef de groupe:");
			      			mdpChef=bufferCC4.readLine();
				  
			      			BufferedReader bufferCC5=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie la login d'un Chef de groupe:");
			      			loginChef=bufferCC5.readLine();
			      			
			      			BufferedReader bufferCC6=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie le sexe d'un Chef de groupe:");
			      			sexeChef=bufferCC6.readLine();
			      			
			      			BufferedReader bufferCC7=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie la date de naissance d'un Chef de groupe:");
			      			dateChef=bufferCC7.readLine();
			      			
		
			      			
			      			BufferedReader bufferCC44=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie le La rue d'un Chef de groupe:");
			      			rueChef=bufferCC44.readLine();
			  
			      			BufferedReader bufferCC55=new BufferedReader(new InputStreamReader(System.in));
			      		    System.out.println("Saisie le numéro d'un Chef de groupe:");
			      			numeroChef=Integer.parseInt(bufferCC55.readLine());
			      			
			      			BufferedReader bufferCC66=new BufferedReader(new InputStreamReader(System.in));
		      		        System.out.println("Saisie le code postale d'un Chef de groupe:");
			      			codeChef=Integer.parseInt(bufferCC66.readLine());
			      			
			      			
			      			Chef_de_Groupe cchef = new Chef_de_Groupe();
			      			
			      			cchef.setNom(nomChef);
			      			cchef.setPrenom(prenomChef);
			      			cchef.setMail(mailChef);
			      			cchef.setMdp(mdpChef);
			      			cchef.setLogin(loginChef);
			      			cchef.setAge(ageChef);
			      			cchef.setDate_naissance(dateChef);
			      			cchef.setSexe(sexeChef);
			      			
			      			Adresse ad = new Adresse();
			      			ad.setRue(rueChef);
			      			ad.setNumero(numeroChef);
			      			ad.setCodePostal(codeChef);
			      			cchef.setMonAdresse(ad);
			      
			      			
			      			chefDao.update(cchef, chefModif);
			      			
			      		    
			      	//******************************************************************************
		        	  
		        	  break;
		        	  
		        } 	  
			break;
			
			/*--------------------------------Fin case 3 (Gestion Chef de groupe)---------------------------------*/
  			
  			
			/*--------------------------------Début case 4 (Gestion  d'un Rapport)---------------------------------*/	
			  
			
		 case 4:
					  
					    System.out.println("*****************************");
						System.out.println("*****************************");
					    System.out.println("Ajouter un Rapport qui a dépassé le budget initiale:-------------- 1");
					    System.out.println("Ajouter un Rapport par l'intervention d'un Administrateur:-------- 2");
						System.out.println("Supprimer un Rapport:--------------------------------------------- 3");
						System.out.println("Consulter les Rapports:------------------------------------------- 4");
						System.out.println("Chercher un Rapport selon id:------------------------------------- 5");
						System.out.println("Modifier un Rapport:---------------------------------------------- 6");
				        System.out.println("******************************");
				        
				        BufferedReader buffer11=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Choisir un muméro parmi ce Menu:");
						number2=Integer.parseInt(buffer11.readLine());
				        
					
					switch (number2)
				        {
				          case 1:

				        	    BufferedReader bufferR=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la description d'une mission:");
				      			descriptionRapport=bufferR.readLine();
				      			
				      			BufferedReader bufferR1=new BufferedReader(new InputStreamReader(System.in));
				      			System.out.println("Saisie le lieu d'une mission:");
				      			lieuRapport=bufferR1.readLine();
				      				
				      			BufferedReader bufferR2=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la date d'une mission:");
				      			dateRapport=bufferR2.readLine();
				      			
				      			BufferedReader bufferR3=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la durrée d'une mission:");
				      			durréeRapport=bufferR3.readLine();
				      			
				      			BufferedReader bufferR4=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget Totale affecté a cette mission:");
				      			budgetTRapport=Integer.parseInt(bufferR4.readLine());
					  
				      			BufferedReader bufferR5=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget d'hébergement affecté a cette mission:");
				      		    budgetHRapport=Integer.parseInt(bufferR5.readLine());
				      			
				      			BufferedReader bufferR6=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget de nourriture affecté a cette mission:");
				      		    budgetNRapport=Integer.parseInt(bufferR6.readLine());
				      			
				      			BufferedReader bufferR7=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget de transport affecté a cette mission:");
				      		    budgetTRRapport=Integer.parseInt(bufferR7.readLine());
			
				      			
				      			BufferedReader bufferR8=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le dons affecté a cette mission:");
				      		    donsRapport=Integer.parseInt(bufferR8.readLine());
					  
				      			
				      			BufferedReader bufferR9=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie d'autre dépense affecté a cette mission:");
				      		    autreDRapport=Integer.parseInt(bufferR9.readLine());
				      		    
				      		    BufferedReader bufferR10=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie une justification de cout supplémentaire:");
				      		    SupliRapport=bufferR10.readLine();
				      		    
				      		  //affichage des Missions a partir de la liste
								System.out.println("Liste des Missions Dans notre Bases :");
								 List<Mission> mmm = missionDao.Afficher();
									
									int im=0;
									for (Mission missi : mmm){
										
										
										System.out.println("* " + missi.getnomMission() + ":" +  missi.getIdMission() + " .");
										
										im++;
										
									}
				      			
				      			BufferedReader bufferM88=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Mission a affecté pour un rapport:");
				      		    rapportmission=Integer.parseInt(bufferM88.readLine());
				      		    
				      		    Session session7=sessionfactory.openSession();	
				        		Transaction tx7=session7.beginTransaction();
				      		    Mission cc =(Mission)session7.get(Mission.class,rapportmission);
				      		    
				      		    tx7.commit();
				      		    session7.close();
				      		    
				      			
					      		
				      		    RapportJustifier rj = new RapportJustifier();
				      		    rj.setDescription(descriptionRapport);
				      		    rj.setLieu_mission(lieuRapport);
				      		    rj.setDate_mission(dateRapport);
				      		    rj.setDuree_mission(durréeRapport);
					      		rj.setBudget_totale(budgetTRapport);
					      		rj.setBudget_hebergement(budgetHRapport);
					      		rj.setBudget_nourriture(budgetNRapport);
					      		rj.setBudget_transport(budgetTRRapport);
					      		rj.setDons(donsRapport);
					      		rj.setAutre_depence(autreDRapport);
					      		rj.setJustifier(SupliRapport);
					      		rj.setMission(cc);
					      	
				      		    
					      		rapportDao.create(rj);
					      		
					      		break;
				          case 2:
				        	  
				        	  BufferedReader bufferRI=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la description d'une mission:");
				      			descriptionRapport=bufferRI.readLine();
				      			
				      			BufferedReader bufferR1I=new BufferedReader(new InputStreamReader(System.in));
				      			System.out.println("Saisie le lieu d'une mission:");
				      			lieuRapport=bufferR1I.readLine();
				      				
				      			BufferedReader bufferR2I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la date d'une mission:");
				      			dateRapport=bufferR2I.readLine();
				      			
				      			BufferedReader bufferR3I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la durrée d'une mission:");
				      			durréeRapport=bufferR3I.readLine();
				      			
				      			BufferedReader bufferR4I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget Totale affecté a cette mission:");
				      			budgetTRapport=Integer.parseInt(bufferR4I.readLine());
					  
				      			BufferedReader bufferR5I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget d'hébergement affecté a cette mission:");
				      		    budgetHRapport=Integer.parseInt(bufferR5I.readLine());
				      			
				      			BufferedReader bufferR6I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget de nourriture affecté a cette mission:");
				      		    budgetNRapport=Integer.parseInt(bufferR6I.readLine());
				      			
				      			BufferedReader bufferR7I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le budget de transport affecté a cette mission:");
				      		    budgetTRRapport=Integer.parseInt(bufferR7I.readLine());
			
				      			
				      			BufferedReader bufferR8I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le dons affecté a cette mission:");
				      		    donsRapport=Integer.parseInt(bufferR8I.readLine());
					  
				      			
				      			BufferedReader bufferR9I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie d'autre dépense affecté a cette mission:");
				      		    autreDRapport=Integer.parseInt(bufferR9I.readLine());
				      		    
				      		    BufferedReader bufferR10I=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie les Remarques d'un Administrateur sur cette rapport:");
				      		    reamrqueRapport=bufferR10I.readLine();
				      			
				      		    
				      		   //affichage des Missions a partir de la liste
								System.out.println("Liste des Missions Dans notre Bases :");
								 List<Mission> mmmm = missionDao.Afficher();
									
									int imm=0;
									for (Mission missi : mmmm){
										
										
										System.out.println("* " + missi.getnomMission() + ":" +  missi.getIdMission() + " .");
										
										imm++;
										
									}
				      			
				      			BufferedReader bufferM8=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Mission a affecté pour un rapport:");
				      		    rapportmission=Integer.parseInt(bufferM8.readLine());
				      		    
				      		    Session session6=sessionfactory.openSession();	
				        		Transaction tx=session6.beginTransaction();
				      		    Mission c =(Mission)session6.get(Mission.class,rapportmission);
				      		    
				      		    tx.commit();
				      		    session6.close();
				        	     
				      		    RapportInterAdmin ri = new RapportInterAdmin();
				      		    ri.setDescription(descriptionRapport);
				      		    ri.setLieu_mission(lieuRapport);
				      		    ri.setDate_mission(dateRapport);
				      		    ri.setDuree_mission(durréeRapport);
					      		ri.setBudget_totale(budgetTRapport);
					      		ri.setBudget_hebergement(budgetHRapport);
					      		ri.setBudget_nourriture(budgetNRapport);
					      		ri.setBudget_transport(budgetTRRapport);
					      		ri.setDons(donsRapport);
					      		ri.setAutre_depence(autreDRapport);
					      		ri.setMission(c);
					      		ri.setRemarqueAdm(reamrqueRapport);
					      		
					      		rapportDao.create(ri);
					      		
				        	  
				        	  
				        	  break;
				          case 3:
				        	  
				        	//affichage des Rapports a partir de la liste
								System.out.println("Liste des Rapports Dans notre Bases :");
								List<Rapport> r1 = rapportDao.Afficher();
								
								int i22=0;
								for (Rapport rap : r1){
									
									
									System.out.println("* " + rap.getIdRapport() + "  --  ");
									
									i22++;
									
								}
								
								
				      			
				      			BufferedReader bufferR100=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Rapport a supprimer:");
				      		    rapportsupp=Integer.parseInt(bufferR100.readLine());
				      		    
				      		    
				      		    Rapport rr = new Rapport();
				      		    
				      		    rapportDao.delete(rr,rapportsupp);
				      			
				      			break;
				        	  
				          case 4:
				        	  
				        	    System.out.println("Liste des Rapports Dans notre Bases :"); 
                                List<Rapport> r11 = rapportDao.Afficher();
								
								int i222=0;
								for (Rapport rap : r11){
									
									
									System.out.println("* " + rap.getIdRapport() + " - " + rap.getDescription()+" - " + rap.getLieu_mission()+" - " + rap.getDate_mission()+" - " + rap.getDuree_mission()+" - " + rap.getBudget_totale()+" - " + rap.getBudget_hebergement()+" - " + rap.getBudget_nourriture()+" - " + rap.getBudget_transport()+" - " + rap.getDons()+" - " + rap.getAutre_depence()+ " . ");
									
									i222++;
									
								}
				
				        	        break;
				        	        
				         
				          case 5:
				        	  
				        	    //affichage des Chef de groupe a partir de la liste
									System.out.println("Liste des Rapports Dans notre Bases :");
									List<Rapport> r31 = rapportDao.Afficher();
									
									int i232=0;
									for (Rapport rap : r31){
										
										
										System.out.println("* " + rap.getIdRapport() + " . ");
										
										i232++;
										
									}
					      			
					      			BufferedReader bufferR11=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Choisir l'id de Rapport chercher:");
					      		    rapportcherche=Integer.parseInt(bufferR11.readLine());
	
					        	    rapportDao.find(rapportcherche);
					        	    
					        	    break;
				          case 6:
				        	  
				        	     System.out.println("Liste des Rapports Dans notre Bases :"); 
				        	     List<Rapport> r114 = rapportDao.Afficher();
									
									int i2224=0;
									for (Rapport rap : r114){
										
										
										System.out.println("* " + rap.getIdRapport() + " - " + rap.getDescription()+" . ");
										
										i2224++;
										
									}
									
									BufferedReader bufferR12=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Choisir l'id de Rapport modifier:");
					      		    rapportmodif=Integer.parseInt(bufferR12.readLine());
				        	  
					      		    //*****************************************************************
					      		     
					      		    BufferedReader bufferRR=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie la description d'une mission:");
					      			descriptionRapport=bufferRR.readLine();
					      			
					      			BufferedReader bufferRR1=new BufferedReader(new InputStreamReader(System.in));
					      			System.out.println("Saisie le lieu d'une mission:");
					      			lieuRapport=bufferRR1.readLine();
					      				
					      			BufferedReader bufferRR2=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie la date d'une mission:");
					      			dateRapport=bufferRR2.readLine();
					      			
					      			BufferedReader bufferRR3=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie la durrée d'une mission:");
					      			durréeRapport=bufferRR3.readLine();
					      			
					      			BufferedReader bufferRR4=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le budget Totale affecté a cette mission:");
					      			budgetTRapport=Integer.parseInt(bufferRR4.readLine());
						  
					      			BufferedReader bufferRR5=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le budget d'hébergement affecté a cette mission:");
					      		    budgetHRapport=Integer.parseInt(bufferRR5.readLine());
					      			
					      			BufferedReader bufferRR6=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le budget de nourriture affecté a cette mission:");
					      		    budgetNRapport=Integer.parseInt(bufferRR6.readLine());
					      			
					      			BufferedReader bufferRR7=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le budget de transport affecté a cette mission:");
					      		    budgetTRRapport=Integer.parseInt(bufferRR7.readLine());
				
					      			
					      			BufferedReader bufferRR8=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le dons affecté a cette mission:");
					      		    donsRapport=Integer.parseInt(bufferRR8.readLine());
						  
					      			
					      			BufferedReader bufferRR9=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie d'autre dépense affecté a cette mission:");
					      		    autreDRapport=Integer.parseInt(bufferRR9.readLine());


					      		    Rapport rr11 = new Rapport();
					      		    
					      		    rr11.setDescription(descriptionRapport);
					      		    rr11.setLieu_mission(lieuRapport);
					      		    rr11.setDate_mission(dateRapport);
					      		    rr11.setDuree_mission(durréeRapport);
					      		    rr11.setBudget_totale(budgetTRapport);
					      		    rr11.setBudget_hebergement(budgetHRapport);
					      		    rr11.setBudget_nourriture(budgetNRapport);
					      		    rr11.setBudget_transport(budgetTRRapport);
					      		    rr11.setDons(donsRapport);
					      		    rr11.setAutre_depence(autreDRapport);
					      		    
					      		    rapportDao.update(rr11, rapportmodif);
					      		    
					      		    //*****************************************************************
					      		    
				        	  
				        	  break;
				        }
					break;
		/*--------------------------------Fin case 4 (Gestion d'un rapport)---------------------------------*/
		  			
		  			
		/*--------------------------------Début case 5 (Gestion d'une Catégorie)---------------------------------*/	
					
				 case 5:
					  
					  System.out.println("*****************************");
						System.out.println("*****************************");
					    System.out.println("Ajouter une Catégorie:------------------------------- 1");
						System.out.println("Supprimer une Catégorie:----------------------------- 2");
						System.out.println("Consulter les Catégories:---------------------------- 3");
						System.out.println("Chercher une Catégorie selon id:--------------------- 4");
						System.out.println("Modifier une Catégorie:------------------------------ 5");
						System.out.println("Affectation d'une Mission a une Catégorie:----------- 6");
				        System.out.println("******************************");
				        
				        BufferedReader buffer12=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Choisir un muméro parmi ce Menu:");
						number2=Integer.parseInt(buffer12.readLine());
				        
					
					switch (number2)
				        {
				          case 1:	
				        	     
				        	    BufferedReader bufferT=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le nom d'une Catégorie:");
				      			nomCat=bufferT.readLine();
				      			
				      			BufferedReader bufferT1=new BufferedReader(new InputStreamReader(System.in));
				      			System.out.println("Saisie la description d'une Catégorie:");
				      			descriptionCat=bufferT1.readLine();
				      				
				      			Categorie c=new Categorie();
				      			c.setNomCategorie(nomCat);
				      			c.setDescription(descriptionCat);
				      				
				      			categorieDao.create(c);
				      			
				      			break;
				        	   
				          case 2:
				        	  
				        	   //affichage des Catégories a partir de la liste
								System.out.println("Liste des Catégories Dans notre Bases :");
								List<Categorie> cat = categorieDao.Afficher();
								
								int i7=0;
								for (Categorie cca : cat){
									
									
									System.out.println("* " + cca.getIdCategorie() + " : "+ cca.getNomCategorie() +" . ");
									
									i7++;
									
								}
		
				      			
				      			BufferedReader bufferT3=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Catégorie a supprimer:");
				      		    catsupp=Integer.parseInt(bufferT3.readLine());
				      		    
				      		    
				      		    Categorie cat1 = new Categorie();
				      		    
				      		    categorieDao.delete(cat1,catsupp);
				      			
				      			break;
				          case 3:
				        	  
				        	     System.out.println("Liste des Catégories Dans notre Bases :"); 
				        	     List<Categorie> cat11 = categorieDao.Afficher();
									
									int i77=0;
									for (Categorie cca : cat11){
										
										
										System.out.println("* " + cca.getIdCategorie() + " -- "+ cca.getNomCategorie() +" -- "+ cca.getDescription() +" . ");
										
										i77++;
										
									}
				        	        break;
				          case 4:
				        	    
				        	    //affichage des Catégories a partir de la liste
								System.out.println("Liste des Catégories Dans notre Bases :");
                                List<Categorie> cat117 = categorieDao.Afficher();
								
								int i71=0;
								for (Categorie cca : cat117){
									
									
									System.out.println("* " + cca.getIdCategorie() + " : "+ cca.getNomCategorie() +" . ");
									
									i71++;
									
								}
				      			
				      			BufferedReader bufferT4=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Catégorie chercher:");
				      		    Catcherche=Integer.parseInt(bufferT4.readLine());

				        	    categorieDao.find(Catcherche);
				        	    
				        	    break;
				        	  
				          case 5:
				        	  
				        	//affichage des Catégories a partir de la liste
								System.out.println("Liste des Catégories Dans notre Bases :");
								 List<Categorie> cat118 = categorieDao.Afficher();
									
									int i778=0;
									for (Categorie cca : cat118){
										
										
										System.out.println("* " + cca.getIdCategorie() + " -- "+ cca.getNomCategorie() +" -- "+ cca.getDescription() +" . ");
										
										i778++;
										
									}
				      			
				      			BufferedReader bufferT44=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Catégorie Modifier:");
				      		    CatModif=Integer.parseInt(bufferT44.readLine());
				        	  
				        	   
				      		    BufferedReader bufferT5=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le nom d'une Catégorie:");
				      			nomCat=bufferT5.readLine();
				      			
				      			BufferedReader bufferT6=new BufferedReader(new InputStreamReader(System.in));
				      			System.out.println("Saisie la description d'une Catégorie:");
				      			descriptionCat=bufferT6.readLine();
				      		    
				      		    
				      			Categorie ccc = new Categorie();
				      			
				      			ccc.setNomCategorie(nomCat);
				      			ccc.setDescription(descriptionCat);
				      			
				      			categorieDao.update(ccc,CatModif );
				        	  break;
				        	  
				        	  
				          case 6:
				        	  
				        	    //affichage des Missions a partir de la liste
								System.out.println("Liste des Missions Dans notre Bases :");
								 List<Mission> mmm = missionDao.Afficher();
									
									int im=0;
									for (Mission missi : mmm){
										
										
										System.out.println("* " + missi.getnomMission() + ":" +  missi.getIdMission() + " .");
										
										im++;
										
									}
				      			
				      			BufferedReader bufferAS=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Mission affecté:");
				      		    missionaffecté=Integer.parseInt(bufferAS.readLine());
				      		    
				      		    
				      		//affichage des Catégories a partir de la liste
								System.out.println("Liste des Catégories Dans notre Bases :");
                                 List<Categorie> catt117 = categorieDao.Afficher();
								
								int i771=0;
								for (Categorie cca : catt117){
									
									
									System.out.println("* " + cca.getIdCategorie() + " : "+ cca.getNomCategorie() +" . ");
									
									i771++;
									
								}
				      			
				      			BufferedReader bufferAS1=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Catégorie:");
				      		    Cataffecté=Integer.parseInt(bufferAS1.readLine());
				        	  
				        	    categorieDao.Ajout_Mis_TO_Cat(missionaffecté, Cataffecté);
				        	    
				        	    break;
				        }
					break;
					
		/*--------------------------------Fin case 5 (Gestion d'une Catégorie)---------------------------------*/
		  			
		/*--------------------------------Début case 6 (Gestion d'un Membre)---------------------------------*/	
				 case 6:
					  
					  System.out.println("*****************************");
						System.out.println("*****************************");
					    System.out.println("Ajouter un Membre:----------------------------------------------------------------- 1");
						System.out.println("Supprimer un Membre:--------------------------------------------------------------- 2");
						System.out.println("Consulter les Membres:------------------------------------------------------------- 3");
						System.out.println("Chercher un Membre selon id:------------------------------------------------------- 4");
						System.out.println("Modifier un Membre:---------------------------------------------------------------- 5");
						System.out.println("Affectation d'un membre a une Mission:--------------------------------------------- 6");
						System.out.println("Modification de l'attribut <durré> d'association entre Membre et Mission:---------- 7");
						System.out.println("Consultater les Associations des Membres aux Missions:----------------------------- 8");
				        System.out.println("******************************");
				        
				        BufferedReader buffer13=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Choisir un muméro parmi ce Menu:");
						number2=Integer.parseInt(buffer13.readLine());
				        
					
					switch (number2)
				        {
				          case 1:
				        	  
				        	    BufferedReader bufferE=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le nom d'un membre:");
				      			nomMembre=bufferE.readLine();
				      			
				      			BufferedReader bufferE1=new BufferedReader(new InputStreamReader(System.in));
				      			System.out.println("Saisie le prenom d'un membre:");
				      			prenomMembre=bufferE1.readLine();
				      				
				      			BufferedReader bufferE2=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie l'age de membre:");
				      		    ageMembre=Integer.parseInt(bufferE2.readLine());
				      			
				      			BufferedReader bufferE3=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le mail d'un membre:");
				      		    mailMembre=bufferE3.readLine();
				      			
				      			BufferedReader bufferE4=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la date de naissance d'un membre:");
				      		    dateMembre=bufferE4.readLine();
					  
				      			BufferedReader bufferE5=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le mot de passe d'un membre:");
				      		    mdpMembre=bufferE5.readLine();
				      			
				      			BufferedReader bufferE6=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la login d'un membre:");
				      		    loginMembre=bufferE6.readLine();
				      			
				      			BufferedReader bufferE7=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie le Sexe de membre:");
				      		    sexeMembre=bufferE7.readLine();
			
				      		    Membre mm = new Membre();
					      	    mm.setNom(nomMembre);
					      	    mm.setPrenom(prenomMembre);
					      	    mm.setAge(ageMembre);
					      	    mm.setMail(mailMembre);
					      	    mm.setDate_naissance(dateMembre);
					      	    mm.setMdp(mdpMembre);
					      	    mm.setLogin(loginMembre);
					      	    mm.setSexe(sexeMembre);
					      		
					      		
					      	    membreDao.create(mm);
					      	    
					      	    break;
				        	  
				          case 2:
				        	  
				        	    //affichage des Membres a partir de la liste
								System.out.println("Liste des Membres Dans notre Bases :");
								 List<Membre> mem = membreDao.Afficher();
									
					        	    int i1=0;
									for (Membre memm : mem){
					        	 
										System.out.println("* " + memm.getIdMembre() + ":" +  memm.getNom() + " . ");
		                                i1++;
										
									}
						
				      			BufferedReader bufferE8=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Membre a supprimer:");
				      		    memsupp=Integer.parseInt(bufferE8.readLine());
				      		    
				      		    
				      		    Membre mem1 = new Membre();
				      		    
				      		    membreDao.delete(mem1,memsupp);
				      			
				      			break;
				          case 3:
				        	  
				        	    System.out.println("Liste des Membres Dans notre Bases :"); 
				        	    List<Membre> mem13 = membreDao.Afficher();
								
				        	    int i13=0;
								for (Membre memm : mem13){
				        	 
									System.out.println("* " + memm.getIdMembre() + ":" +  memm.getNom() +" - " +  memm.getPrenom() + " - " +  memm.getAge() + " - " +  memm.getMail() + " - " +  memm.getDate_naissance() +  " - "+  memm.getMdp() +" - "+  memm.getLogin() +" - "+  memm.getSexe() +" . ");
	                                i13++;
									
								}
				
				        	        break;
				        	        
				          case 4:
				        	  

				        	    //affichage des Membres a partir de la liste
								System.out.println("Liste des Membres Dans notre Bases :");
								 List<Membre> mem7 = membreDao.Afficher();
									
					        	    int i17=0;
									for (Membre memm : mem7){
					        	 
										System.out.println("* " + memm.getIdMembre() + ":" +  memm.getNom() + " . ");
		                                i17++;
										
									}
				      			
				      			BufferedReader bufferE9=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Membre chercher:");
				      		    Membrecherche=Integer.parseInt(bufferE9.readLine());

				        	    membreDao.find(Membrecherche);
				        	    
				        	    break;
				          case 5:
				        	  
				        	  System.out.println("Liste des Membres Dans notre Bases :"); 
				        	  List<Membre> mem133 = membreDao.Afficher();
								
				        	    int i133=0;
								for (Membre memm : mem133){
				        	 
									System.out.println("* " + memm.getIdMembre() + ":" +  memm.getNom() +" - " +  memm.getPrenom() + " - " +  memm.getAge() + " - " +  memm.getMail() + " - " +  memm.getDate_naissance() +  " - "+  memm.getMdp() +" - "+  memm.getLogin() +" - "+  memm.getSexe() +" . ");
	                                i133++;
									
								}
									
									BufferedReader bufferE20=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Choisir l'id de Membre modifier:");
					      		    MembreModif=Integer.parseInt(bufferE20.readLine());
				
				        	  
					      		    //********************************************************************
					      		    

					        	    BufferedReader bufferEE=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le nom d'un membre:");
					      			nomMembre=bufferEE.readLine();
					      			
					      			BufferedReader bufferEE1=new BufferedReader(new InputStreamReader(System.in));
					      			System.out.println("Saisie le prenom d'un membre:");
					      			prenomMembre=bufferEE1.readLine();
					      				
					      			BufferedReader bufferEE2=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie l'age de membre:");
					      		    ageMembre=Integer.parseInt(bufferEE2.readLine());
					      			
					      			BufferedReader bufferEE3=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le mail d'un membre:");
					      		    mailMembre=bufferEE3.readLine();
					      			
					      			BufferedReader bufferEE4=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie la date de naissance d'un membre:");
					      		    dateMembre=bufferEE4.readLine();
						  
					      			BufferedReader bufferEE5=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le mot de passe d'un membre:");
					      		    mdpMembre=bufferEE5.readLine();
					      			
					      			BufferedReader bufferEE6=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie la login d'un membre:");
					      		    loginMembre=bufferEE6.readLine();
					      			
					      			BufferedReader bufferEE7=new BufferedReader(new InputStreamReader(System.in));
					      		    System.out.println("Saisie le Sexe de membre:");
					      		    sexeMembre=bufferEE7.readLine();
					      		    
					      		    //**********************************************************************
					      		    
					      		    
					      		    Membre memb = new Membre();
					      		    
					      		    memb.setNom(nomMembre);
					      		    memb.setPrenom(prenomMembre);
					      		    memb.setMail(mailMembre);
					      		    memb.setMdp(mdpMembre);
					      		    memb.setLogin(loginMembre);
					      		    memb.setDate_naissance(dateMembre);
					      		    memb.setSexe(sexeMembre);
					      		    memb.setAge(ageMembre);
					      		    
					      		   membreDao.update(memb, MembreModif);
				        	  
				        	  break;
				        	  
				          case 6:
				        	 
				        	    //affichage des Membres a partir de la liste
								System.out.println("Liste des Membres Dans notre Bases :");
								List<Membre> mem77 = membreDao.Afficher();
								
				        	    int i177=0;
								for (Membre memm : mem77){
				        	 
									System.out.println("* " + memm.getIdMembre() + ":" +  memm.getNom() + " . ");
	                                i177++;
									
								}
				      			
				      			BufferedReader bufferE10=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Membre affecté:");
				      		    Membreaffecté=Integer.parseInt(bufferE10.readLine());
				      		    
				      		    
				      		    
				      		  //affichage des Missions a partir de la liste
								System.out.println("Liste des Missions Dans notre Bases :");
								 List<Mission> mmm = missionDao.Afficher();
									
									int im=0;
									for (Mission missi : mmm){
										
										
										System.out.println("* " + missi.getnomMission() + ":" +  missi.getIdMission() + " .");
										
										im++;
										
									}
								
								
								BufferedReader bufferE11=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Choisir l'id de Mission affecté:");
				      		    Missionaffecté=Integer.parseInt(bufferE11.readLine());
				      		    
				      		    
				      		    
				      		    
				      			
				      			BufferedReader bufferE12=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la durrée de cette mission");
				      		    durMission=bufferE12.readLine();
				        	    
				      		
				      		     mission_membreDao.Ajout_Mem_TO_Miss(Membreaffecté,Missionaffecté , durMission);
					
				      		     break;
				      		     
				          case 7:
				        	  //affichage des Associations entre les Membres et les Mission a partir de la liste
								System.out.println("Liste des Associations entre les Membres et les Mission Dans notre Bases :");
								List<Mission_Membre> mem777 = mission_membreDao.Afficher();
								
				        	    int i1771=0;
				        	    System.out.println("[Membre:Mission]");
								for (Mission_Membre memm : mem777){
				        	 
									System.out.println("[" + memm.getMembre().getIdMembre() + ":" +  memm.getMission().getIdMission() + "]");
	                                i1771++;
									
								}
				      			

				      			BufferedReader bufferE13=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie l'id de Membre ");
				      		    idMembre=Integer.parseInt(bufferE13.readLine());
				      		    

				      			BufferedReader bufferE134=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie l'id de Mission");
				      		    idMission=Integer.parseInt(bufferE134.readLine());
																

				      			BufferedReader bufferE135=new BufferedReader(new InputStreamReader(System.in));
				      		    System.out.println("Saisie la durrée de cette mission");
				      		    durMission=bufferE135.readLine();
				      		    
				      		    Mission_Membre m = new Mission_Membre();
				      		    m.getId().setIdMembre(idMembre);
				      		    m.getId().setIdMission(idMission);
				      		    
				      		    m.setDurree(durMission);
				      		    
				      		    mission_membreDao.update(m, 0);
				      		    
				        	  
				        	  break;
				        	  
				          case 8: 
				        	  //affichage des Associations entre les Membres et les Mission a partir de la liste
								System.out.println("Liste des Associations entre les Membres et les Mission Dans notre Bases :");
								List<Mission_Membre> mem757 = mission_membreDao.Afficher();
								
				        	    int i17711=0;
				        	    System.out.println("[Membre:Mission]");
								for (Mission_Membre memm : mem757){
				        	 
									System.out.println("[" + memm.getMembre().getIdMembre() + ":" +  memm.getMission().getIdMission() + "]");
	                                i17711++;
									
								}
				        	  break;
				        }
					
					
					
					break;
		/*--------------------------------Fin case 6 (Gestion d'un Membre)---------------------------------*/
		  			
		/*--------------------------------Début case 7 (Des Statistiques concernant notre application)---------------------------------*/				
				 case 7:
					  
					  System.out.println("***************************************************************************");
						System.out.println("***************************************************************************");
					    System.out.println("*/ Liste des Rapports qui ont un budget Totale entre 50 et 500 dinars:---- 1");
						System.out.println("*/ Les Chefs de chaque Mission qui a un budget > 20 dinars:--------------- 2");
						System.out.println("*/ L'administrateur de chaque Mission :---------------------------------- 3");
						System.out.println("*/ Les Missions qui ont dépassé leurs budget initiale:------------------- 4");
						System.out.println("*/ Les Missions qui ne dépassent pas leurs budget initiale:-------------- 5");
				        System.out.println("**************************************************************************");
				        
				        BufferedReader buffer14=new BufferedReader(new InputStreamReader(System.in));
						System.out.println("Choisir un muméro parmi ce Menu:");
						number2=Integer.parseInt(buffer14.readLine());
				        
					
					switch (number2)
				        {
				          case 1:
				        	  
				        	missionDao.Budget_Rapport();
				        	 
				        	  
				        	  
				        	   break;
				          case 2:
				        	  
				        	  missionDao.Chef_Mission();
			        	  
				        	  
				        	  
				        	  break;
				        	  
				        	 
				          case 3:
				        	  
				        	  missionDao.Admin_Mission();
				        	  break;
				        	  
				         case 4:
				        	 
				        	 missionDao.Budget_Mission();
				        	 break;
                         case 5:
				        	 
				        	 missionDao.Budget_Mission2();
				        	 break;
				        	 
				        	 
				        }
					
				 case 8: 
					 
		
				
				
					
					break;
					
		/*--------------------------------Fin case 7 (Des Statistiques)---------------------------------*/
		  			
					
					
		
		}//fin le grand switch
}while(number!=8);
	
	}//fin main	
}//fin classe Test
