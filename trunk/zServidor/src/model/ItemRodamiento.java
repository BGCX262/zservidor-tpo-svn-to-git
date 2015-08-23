package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="itemRodamiento")
public class ItemRodamiento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@OneToOne
	private Rodamiento rodamiento;
	@ManyToMany
	private List<Proveedor> proveedores = new ArrayList<Proveedor>(); 
	private float precio;
	private int stock;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Rodamiento getRodamiento() {
		return rodamiento;
	}
	public void setRodamiento(Rodamiento rodamiento) {
		this.rodamiento = rodamiento;
	}
	public List<Proveedor> getProveedores() {
		return proveedores;
	}
	public void setProveedores(List<Proveedor> proveedores) {
		this.proveedores = proveedores;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
