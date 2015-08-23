package model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	private int cuit;
	private String contacto;
	private String descuentoAsociado;
	//private List<CotizacionRodamiento> cotizaciones = new ArrayList<CotizacionRodamiento>();
	private PorcentajeDesc porcentajeDesc;
	
	public Cliente() {
		super();
	}
	public Cliente(int cuit, String nombre, String dni,
			String descuentoAsociado, List<CotizacionRodamiento> cotizaciones,
			PorcentajeDesc porcentajeDesc) {
		super();
		this.cuit = cuit;
		this.contacto = contacto;
		this.descuentoAsociado = descuentoAsociado;
		//this.cotizaciones = cotizaciones;
		//this.porcentajeDesc = porcentajeDesc;
	}
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public String getContacto() {
		return contacto;
	}
	public void setNombre(String contacto) {
		this.contacto = contacto;
	}
	public String getDescuentoAsociado() {
		return descuentoAsociado;
	}
	public void setDescuentoAsociado(String descuentoAsociado) {
		this.descuentoAsociado = descuentoAsociado;
	}
	/*public List<CotizacionRodamiento> getCotizaciones() {
		return cotizaciones;
	}
	public void setCotizaciones(List<CotizacionRodamiento> cotizaciones) {
	
	public PorcentajeDesc getPorcentajeDesc() {
		return porcentajeDesc;
	}
	public void setPorcentajeDesc(PorcentajeDesc porcentajeDesc) {
		this.porcentajeDesc = porcentajeDesc;
	}*/

	
	
}
