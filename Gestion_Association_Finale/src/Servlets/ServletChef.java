package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import persistance.HibernateUtil;

import Services.AdministrateurService;
import Services.MissionService;
import Services.RapportService;
import beans.Administrateur;
import beans.Mission;


@WebServlet("/ServletChef")
public class ServletChef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    
    public ServletChef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/indexChef.jsp").forward( request, response );
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		
		
	}

}
