package rmi.server;

import interfaz.TDAManejoDatos;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.List;

import model.ItemRodamiento;
import model.ItemRodamientoSRV;
import model.Marca;
import model.MarcaSRV;
import model.Rodamiento;
import model.RodamientoSRV;
import rmi.controller.RMIController;


public class Server {
    
	TDAManejoDatos objetoRemoto;
	
	public Server() {
		iniciar();
	}

	public static void main(String[] args)
	{
		/*TipoRodamiento tr = new TipoRodamiento();
		tr.setCodigo_skf("0101");
		DTOTipoRodamiento dtr = RodamientoSRV.getinstancia().toDTO(tr);
		RodamientoSRV.getinstancia().guardar(tr);
		
		Rodamiento r = new Rodamiento();
		r.setId(0);
		r.setCodigo("BDFL 020");
		r.setTiporodamiento(tr);
		r.setCaracteristica("1234");
		r.setOrigen("ARG");
		r.setMarca("marca");
		
		RodamientoSRV.getinstancia().guardar(r);
//		
		Rodamiento nr = new Rodamiento();
		nr.setId(0);
		nr.setCodigo("TPL 999");
		nr.setTiporodamiento(tr);
		nr.setCaracteristica("292921234");
		nr.setOrigen("ARG");
		nr.setMarca("Pirulo");
		RodamientoSRV.getinstancia().guardar(nr);
		

		OficinadeVenta oficina = new OficinadeVenta();
		oficina.setNombre("Caballito");
		OficinadeVenta oficina2 = new OficinadeVenta();
		oficina2.setNombre("Belgrano");
		OCSRV.getinstancia().guardaroficina(oficina);
		OCSRV.getinstancia().guardaroficina(oficina2);*/
		
//		LocalTest.runtTest();
		List<Marca> lm = MarcaSRV.getinstancia().levantarMarcas();
//		List<Rodamiento> lr = RodamientoSRV.getinstancia().levantarRodamientos();
//		List<ItemRodamiento> li = ItemRodamientoSRV.getinstancia().levantarItemRodamientos();
		
		
		new Server();
		
	}

	public void iniciar() {
    	try {
    		LocateRegistry.createRegistry(1099);	
    		TDAManejoDatos proveedores_controller = new RMIController();
            Naming.rebind ("//localhost/rmiController", proveedores_controller);
            System.out.println("Fijado en //localhost/rmiController");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
	

	
	
}
