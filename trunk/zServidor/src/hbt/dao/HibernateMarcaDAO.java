package hbt.dao;

import hbt.HibernateUtil;

import java.util.List;

import model.Marca;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateMarcaDAO {
	private static HibernateMarcaDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateMarcaDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateMarcaDAO();
		} 
		return instancia;
	}

	public List<Marca> levantarMarcas() {
		Session session = sf.openSession();
		Query query = session.createQuery("from Marca");
		List<Marca> marcas = query.list();
		return marcas;
	}
}
