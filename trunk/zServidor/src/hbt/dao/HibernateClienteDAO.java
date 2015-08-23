package hbt.dao;

import hbt.HibernateUtil;
import model.Cliente;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernateClienteDAO {
	private static HibernateClienteDAO instancia = null;
	private static SessionFactory sf = null;
	
	public static HibernateClienteDAO getInstancia(){
		if(instancia == null){
			sf = HibernateUtil.getSessionFactory();
			instancia = new HibernateClienteDAO();
		} 
		return instancia;
	}

	public Cliente guardarCliente(Cliente cliente) {
		Session session = sf.openSession();
		session.beginTransaction();
		session.persist(cliente);
		session.flush();
		session.getTransaction().commit();
		session.close();		
		return cliente;
	}
	
}
