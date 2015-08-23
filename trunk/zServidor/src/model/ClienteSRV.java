package model;

import hbt.dao.*;
import beans.BeanCliente;

public class ClienteSRV {
	
	private static ClienteSRV instancia;

	public static ClienteSRV getinstancia(){
		if (instancia == null){
			instancia = new ClienteSRV();
		}
		return instancia;
	}

	public Cliente fromDTO(BeanCliente dtoCliente) {
		Cliente cliente = new Cliente();
		cliente.setCuit(dtoCliente.getCuit());
		cliente.setDescuentoAsociado(dtoCliente.getDescuentoAsociado());
		cliente.setNombre(dtoCliente.getNombre());
		return cliente;
	}

	public void guardar(Cliente c) {
		HibernateClienteDAO.getInstancia().guardarCliente(c);
	}
	
}
