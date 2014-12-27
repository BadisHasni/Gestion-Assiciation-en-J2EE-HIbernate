package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Adresse;
import beans.Chef_de_Groupe;

import Services.ChefService;


@WebServlet("/Servlet_modifier_chef")
public class Servlet_Modifier_Chef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    ChefService cs = new ChefService();
	
    public Servlet_Modifier_Chef() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("id", id);
 		this.getServletContext().getRequestDispatcher("/WEB-INF/ModifierChef.jsp").forward( request, response );

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		String nomchef = request.getParameter("nomchef");
		String prenomchef = request.getParameter("prenomchef");
		Integer agechef = (Integer.parseInt(request.getParameter("agechef")));
		String mailchef = request.getParameter("mailchef");
		String datechef = request.getParameter("datechef");
		String loginchef = request.getParameter("loginchef");
		String pwdchef = request.getParameter("pwdchef");
		String  civilité = request.getParameter("civilité");
		String ruechef = request.getParameter("ruechef");
		Integer numchef = (Integer.parseInt(request.getParameter("numchef")));
		Integer codechef = (Integer.parseInt(request.getParameter("codechef")));
		
		Chef_de_Groupe c=new Chef_de_Groupe();
		c.setNom(nomchef);
		c.setPrenom(prenomchef);
		c.setMail(mailchef);
		c.setAge(agechef);
		c.setLogin(loginchef);
		c.setMdp(pwdchef);
		c.setSexe(civilité);
		c.setDate_naissance(datechef);
		
		Adresse ad1= new Adresse();
		ad1.setRue(ruechef);
		ad1.setNumero(numchef);
		ad1.setCodePostal(codechef);
		
		c.setMonAdresse(ad1);
		 cs.modification(c, id);
		
		response.sendRedirect(request.getContextPath() +"/Servlet_consulter_chef");
	}

}
