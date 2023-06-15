package gestionMaterialProyIIS.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entidad de la tabla 'gestion_alumno'
 */

@Entity
@Table(name = "gestion_alumnos", schema = "gestionMaterial")
public class Alumno {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_alumno",nullable = false)
	private int idAlumno;

	@Column(name = "nombre_alumno", nullable = false)
	private String nombre;

	@Column(name = "tlf_alumno", nullable = false)
	private String tlf;

	@OneToOne
	@JoinColumn(name = "id_portatil")
	private Portatil portatil;

	// GET & SET

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public Portatil getPortatil() {
		return portatil;
	}

	public void setPortatil(Portatil portatil) {
		this.portatil = portatil;
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", tlf=" + tlf + ", portatil=" + portatil + "]";
	}

}
