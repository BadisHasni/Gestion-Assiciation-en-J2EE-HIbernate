package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Services.MissionService;
import beans.Chef_de_Groupe;
import beans.Mission;


@WebServlet("/ServletAdmin")
public class ServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletAdmin() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/indexAdmin.jsp").forward( request, response );
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
