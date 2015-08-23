package model;

import hbt.dao.HibernateItemRodamientoDAO;

import java.util.List;

public class ItemRodamientoSRV {
	
	private static ItemRodamientoSRV instancia;

	public static ItemRodamientoSRV getinstancia(){
		if (instancia == null){
			instancia = new ItemRodamientoSRV();
		}
		return instancia;
	}
	
	public List<ItemRodamiento> levantarItemRodamientos() {
		return HibernateItemRodamientoDAO.getInstancia().levantarItemRodamientos();
	}
	
}
