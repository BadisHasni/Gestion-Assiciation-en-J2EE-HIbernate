package DAO;

import java.sql.Connection;
import java.util.List;

import javax.transaction.Transaction;

import org.apache.catalina.Session;
import org.hibernate.SessionFactory;

import beans.Mission;

public abstract class DAO<T> {

	protected SessionFactory sessionFactory = null;
	protected Transaction tx = null;
	protected Session session = null;
	
	
	public DAO(SessionFactory sessionFactory){
	       this.sessionFactory = sessionFactory;
	}
	
	public abstract void create(T obj);
	public abstract void delete(T obj , int id);
	public abstract void update(T obj , int id);
	public abstract T find(int id);
	
	public abstract void Affichage(T obj);
	
	public abstract T Charger(int id);
	
	public abstract List Afficher();
	
	public abstract void Ajout_Mis_TO_Cat (int idM , int idCA);
	
	public abstract void Ajout_Mem_TO_Miss (int idMem , int idMiss , String a);
	
	public abstract void Chef_Mission();
	
	public abstract void Budget_Rapport();
	
	public abstract void Admin_Mission();
	
	public abstract void Budget_Mission();
	
	public abstract void Budget_Mission2();
	
}
