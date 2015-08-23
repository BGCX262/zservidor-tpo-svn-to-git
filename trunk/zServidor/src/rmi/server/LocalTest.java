/*package rmi.server;

import java.util.Date;
import java.util.List;

import beans.dtoCondicionDeVenta;
import beans.dtoItemListaDePrecios;
import beans.dtoListaDePrecios;
import beans.dtoProveedor;
import beans.BeanRodamiento;
import beans.DTOTipoRodamiento;

import model.CondicionDeVenta;
import model.ItemListaDePrecios;
import model.ListaDePrecios;
import model.Proveedor;
import model.ProveedorSRV;
import model.Rodamiento;
import model.RodamientoSRV;
import model.TipoRodamiento;


public class LocalTest {

	

	public static void runtTest(){
		dtoProveedor dtoProv = new dtoProveedor();
		dtoProv.setEmpresa("Rulemanes Tuerca Loca");
		dtoProv.setCuit("30-323232323-1");
		dtoProv.setPais("ARG");
		dtoProv.setDireccion("Av de los Palotes 123");
		dtoProv.setCiudad("Ciudad Autonoma de Bs As");
		dtoProv.setProvincia("Buenos Aires");
		dtoProv.setContacto("Carlos Alberto Kirchner");
		dtoProv.setTelefono1("011-5555-4444");
		dtoProv.setTelefono2("011-5555-4444");
		dtoProv.setFax("011-5555-4444");
		dtoProv.setObservaciones("Buen proveedor de rulemanes secos");
		
		Proveedor p = ProveedorSRV.getinstancia().fromDTO(dtoProv);
		p = ProveedorSRV.getinstancia().guardar(p);
		
		dtoCondicionDeVenta dcv = new dtoCondicionDeVenta();
		dcv.setId(0);
		dcv.setCantidad_de_dias_de_pago(30);
		dcv.setCantidad_de_unidades(100);
		dcv.setDescuento(0.02);
		dcv.setTipo_de_pago("Cheque");
		
		CondicionDeVenta cv = ProveedorSRV.getinstancia().fromDTO(dcv);
		cv = ProveedorSRV.getinstancia().guardar(cv);
		
		p.getCondiciones_de_venta().add(cv);
		
		p = ProveedorSRV.getinstancia().merge(p);
		
		
		
		dtoListaDePrecios lp = new dtoListaDePrecios();
		lp.setNombre("nombre!");
		lp.setFecha_fin("2010-01-01 00:00:00");
		lp.setFecha_ini("2010-01-01 00:00:00");
		lp.setProveedor(dtoProv);


		Creo el item de la lista de precios
		dtoItemListaDePrecios ildp = new dtoItemListaDePrecios();
		ildp.setPrecio(55.6);
		ildp.setStock(12);
		ildp.setRodamiento(dr);
		Agrego el item a la lista de precios			
		lp.addItem(ildp);

		dtoItemListaDePrecios ildp2 = new dtoItemListaDePrecios();
		ildp2.setPrecio(155.6);
		ildp2.setStock(121);
		ildp2.setRodamiento(dr);
		Agrego el item a la lista de precios			
		lp.addItem(ildp2);
		
		RodamientoSRV.getinstancia().guardar(RodamientoSRV.getinstancia().fromDTO(tr));
		RodamientoSRV.getinstancia().guardar(RodamientoSRV.getinstancia().fromDTO(dr));
		ProveedorSRV.getinstancia().guardar(ProveedorSRV.getinstancia().fromDTO(cv));
		ProveedorSRV.getinstancia().guardar(ProveedorSRV.getinstancia().fromDTO(dtoProv));
		dtoCondicionDeVenta dcv = ProveedorSRV.getinstancia().getdtoCondicionDeVenta(1);
		dtoProveedor dp = ProveedorSRV.getinstancia().getdtoProveedor(1);
		dp.getCondiciones_de_venta().add(dcv);
		ProveedorSRV.getinstancia().guardar(ProveedorSRV.getinstancia().fromDTO(dcv));
		ProveedorSRV.getinstancia().guardar(ProveedorSRV.getinstancia().fromDTO(dp));
		
		
		ProveedorSRV.getinstancia().guardar(ProveedorSRV.getinstancia().fromDTO(cv));
		ProveedorSRV.getinstancia().guardar(ProveedorSRV.getinstancia().fromDTO(lp));
		
		System.out.print("1");
		List<ListaDePrecios> llp = ProveedorSRV.getinstancia().listListasDePrecios();
		
		dtoListaDePrecios dlp = ProveedorSRV.getinstancia().getdtoListaDePrecios(1);
		List<dtoItemListaDePrecios> dildp = dlp.getItems();

		for (dtoItemListaDePrecios ildp1 : dildp){
			System.out.println(ildp1.getCodigo());
			System.out.println(ildp1.getPrecio());
			System.out.println(ildp1.getStock());
			System.out.println(ildp1.getRodamiento().getCaracteristica());
		}
		System.out.println("-----------------");
		llp = ProveedorSRV.getinstancia().listListasDePrecios();
		for (ListaDePrecios lps : llp){
			System.out.println(lps.getCodigo());
			System.out.println(lps.getItems().get(1).getCodigo());
		}
		
		Agregando un nuevo item.
		
		dtoItemListaDePrecios ildp3 = new dtoItemListaDePrecios();
		ildp3.setPrecio(155.6);
		ildp3.setStock(121);
		ildp3.setRodamiento(dr);
		Agrego el item a la lista de precios			
		lp.addItem(ildp3);

		ProveedorSRV.getinstancia().guardar(ProveedorSRV.getinstancia().fromDTO(lp));
		
		Imprime todo lo ultimo
		dlp = ProveedorSRV.getinstancia().getdtoListaDePrecios(1);
		dildp = dlp.getItems();

		for (dtoItemListaDePrecios ildp1 : dildp){
			System.out.println("ildp1.getCodigo()"+ildp1.getCodigo());
			System.out.println("ildp1.getPrecio()"+ildp1.getPrecio());
			System.out.println("ildp1.getStock()"+ildp1.getStock());
			System.out.println("ildp1.getRodamiento().getCaracteristica()"+ildp1.getRodamiento().getCaracteristica());
		}
		System.out.println("-----------------");
		llp = ProveedorSRV.getinstancia().listListasDePrecios();
		for (ListaDePrecios lps : llp){
			System.out.println(lps.getCodigo());
			System.out.println(lps.getItems().get(1).getCodigo());
		}
		
		
		System.out.print("Fin");
	}
	public static void main(String[] args) {
		LocalTest.runtTest();
	}

}*/
