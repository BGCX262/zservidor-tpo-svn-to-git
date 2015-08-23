package model;

import hbt.dao.HibernateMarcaDAO;

import java.util.List;

public class MarcaSRV {
	private static MarcaSRV instancia;

	public static MarcaSRV getinstancia(){
		if (instancia == null){
			instancia = new MarcaSRV();
		}
		return instancia;
	}

	public List<Marca> levantarMarcas() {
		return HibernateMarcaDAO.getInstancia().levantarMarcas();
	}
	
}
