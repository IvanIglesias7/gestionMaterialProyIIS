package gestionMaterialProyIIS.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entidad de la tabla 'gestion_portatiles'
 */
@Entity
@Table(name = "gestion_portatiles", schema = "gestionMaterial")
public class Portatil {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_portatil", nullable = false)
	private int idPortatil;

	@Column(name = "marca_portatil", nullable = false)
	private String marca;

	@Column(name = "modelo_portatil", nullable = false)
	private String modelo;

	public int getIdPortatil() {
		return idPortatil;
	}

	public void setIdPortatil(int idPortatil) {
		this.idPortatil = idPortatil;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Portatil [idPortatil=" + idPortatil + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

}
