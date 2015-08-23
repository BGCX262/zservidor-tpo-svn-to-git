package model;

import java.util.List;

import hbt.dao.HibernateClienteDAO;
import hbt.dao.HibernateMarcaDAO;
import hbt.dao.HibernateRodamientoDAO;
import beans.BeanCliente;
import beans.BeanRodamiento;

public class RodamientoSRV {

	private static RodamientoSRV instancia;

	public static RodamientoSRV getinstancia(){
		if (instancia == null){
			instancia = new RodamientoSRV();
		}
		return instancia;
	}

	public void guardar(Rodamiento rodamiento) {
		HibernateRodamientoDAO.getInstancia().guardar(rodamiento);
	}

	public Rodamiento fromBean(BeanRodamiento beanRodamiento) {
		Rodamiento rodamiento = new Rodamiento();
		rodamiento.setCodigo(beanRodamiento.getCodigo());
		Marca marca = new Marca();
		marca.setDescripcion(beanRodamiento.getBeanMarca().getDescripcion());
		marca.setPais(beanRodamiento.getBeanMarca().getPais());
		marca.setId(beanRodamiento.getBeanMarca().getId());
		rodamiento.setMarca(marca);
		rodamiento.setTipo(beanRodamiento.getTipo());
		rodamiento.setCaracteristicas(beanRodamiento.getCaracteristicas());
		rodamiento.setMedida(beanRodamiento.getMedida());
		return rodamiento;
	}
	
	public List<Rodamiento> levantarRodamientos() {
		return HibernateRodamientoDAO.getInstancia().levantarRodamientos();
	}
	

	

}
