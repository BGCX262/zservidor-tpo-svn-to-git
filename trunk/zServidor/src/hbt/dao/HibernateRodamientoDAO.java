package hbt.dao;

import java.util.List;

import hbt.HibernateUtil;

import model.Cliente;
import model.Marca;
import model.Rodamiento;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateRodamientoDAO {
	
	private static HibernateRodamientoDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateRodamientoDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateRodamientoDAO();
		} 
		return instancia;
	}
	
	public Rodamiento guardar(Rodamiento rodamiento) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(rodamiento);
		session.flush();
		session.getTransaction().commit();
		session.close();		
		return rodamiento;
	}
	
	public List<Rodamiento> levantarRodamientos() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Rodamiento");
		List<Rodamiento> rodamiento= query.list();
		return rodamiento;
	}
}
