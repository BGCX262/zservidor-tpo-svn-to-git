package rmi.controller;

import interfaz.TDAManejoDatos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import model.ClienteSRV;
import model.Marca;
import model.MarcaSRV;
import model.Rodamiento;
import model.RodamientoSRV;
import beans.BeanCliente;
import beans.BeanMarca;
import beans.BeanRodamiento;

public class RMIController extends UnicastRemoteObject implements TDAManejoDatos {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RMIController() throws RemoteException {
		super();
		
	}

	@Override
	public boolean setCliente(BeanCliente dtoCliente) throws RemoteException {
		System.out.println("Alta Cliente en Servidor!");
		Cliente c = ClienteSRV.getinstancia().fromDTO(dtoCliente);
		System.out.println(c.getCuit());
		ClienteSRV.getinstancia().guardar(c);
		return true;
	}
	
	
	
	/*
	public boolean setProveedor(DTOProveedor dtoProveedor)throws RemoteException{
		System.out.println("Alta proveedor en Servidor!");
		Proveedor proveedor = ProveedorSRV.getinstancia().fromDTO(proveedor);
		System.out.println(c.getCuit());
		ClienteSRV.getinstancia().guardar(c);
		return true;
	}
	
	
	public boolean setRodamiento(BeanRodamiento beanRodamiento) throws RemoteException{
		System.out.println("Alta Rodamiento en Servidor!");
		Rodamiento rodamiento= RodamientoSRV.getinstancia().fromDTO(beanRodamiento);
		System.out.println(c.getCuit());
		ClienteSRV.getinstancia().guardar(c);
		return true;
		
	}*/
	
	public List<BeanMarca> getListaMarcas()throws RemoteException{
		System.out.println("Levantar marcas desde Servidor!");
		List<BeanMarca> beanMarcas = new ArrayList<BeanMarca>(); 
		List<Marca> marcas = MarcaSRV.getinstancia().levantarMarcas();
		for(Marca marca: marcas ){
			BeanMarca beanMarca = new BeanMarca();
			beanMarca.setDescripcion(marca.getDescripcion());
			beanMarca.setId(marca.getId());
			beanMarca.setPais(marca.getPais());
			beanMarcas.add(beanMarca);
		}
		return beanMarcas;
	}

	@Override
	public boolean setRodamiento(BeanRodamiento beanRodamiento) throws RemoteException {
		System.out.println("Alta Rodamiento en Servidor!");
		Rodamiento rodamiento = RodamientoSRV.getinstancia().fromBean(beanRodamiento);
		RodamientoSRV.getinstancia().guardar(rodamiento);
		return true;
	}
	
	
}
