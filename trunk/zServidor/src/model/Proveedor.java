package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "proveedores")
public class Proveedor {

	private String razonSocial;
	@Id
	private String cuit;
	private String direccion;
	private String telefono;
	@OneToMany
	@PrimaryKeyJoinColumn
//	@JoinTable(name = "proveedor_listaPrecios", joinColumns = { @JoinColumn(name = "cuit") }, inverseJoinColumns = { @JoinColumn(name = "listasPrecios_id") })
	private List<ListaPrecios> listasPrecios = new ArrayList<ListaPrecios>();
	@OneToMany
	@PrimaryKeyJoinColumn
//	@JoinTable(name = "proveedor_listaOfertas", joinColumns = { @JoinColumn(name = "cuit") }, inverseJoinColumns = { @JoinColumn(name = "listasOfertas_id") })
	private List<ListaOfertas> listasOfertas = new ArrayList<ListaOfertas>();
	
	public Proveedor() {
		super();
	}
	
	
	
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<ListaPrecios> getListasPrecios() {
		return listasPrecios;
	}
	public void setListasPrecios(List<ListaPrecios> listasPrecios) {
		this.listasPrecios = listasPrecios;
	}
	public List<ListaOfertas> getListasOfertas() {
		return listasOfertas;
	}
	public void setListasOfertas(List<ListaOfertas> listasOfertas) {
		this.listasOfertas = listasOfertas;
	}
	
	
	
}