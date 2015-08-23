package model;

import javax.persistence.*;

@Entity
@Table(name="rodamientos")
public class Rodamiento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String codigo;
	private String tipo;
	private float medida;
	private String caracteristicas;
	@ManyToOne
	@PrimaryKeyJoinColumn
	private Marca marca;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getMedida() {
		return medida;
	}
	public void setMedida(float medida) {
		this.medida = medida;
	}
	public String getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
