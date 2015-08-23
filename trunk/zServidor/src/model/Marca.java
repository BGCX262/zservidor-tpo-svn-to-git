package model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table (name = "marcas")
public class Marca implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 716011125681681386L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String descripcion;
	private String pais;
	
	public Integer getId() {
		return id;
	}	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Marca [descripcion=" + descripcion + ", pais=" + pais + "]";
	}
	
	
}
