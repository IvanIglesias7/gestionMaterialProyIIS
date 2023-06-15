package gestionMaterialProyIIS.dto;

import gestionMaterialProyIIS.dao.Portatil;

public class AlumnoDTO {
	// ATRIBUTOS

		private int idAlumno;
		private String nombre;
		private String tlf;
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
		
		//ToString
		@Override
		public String toString() {
			return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", tlf=" + tlf + ", portatil=" + portatil + "]";
		}

		//Constructores
		
		public AlumnoDTO(int idAlumno, String nombre, String tlf, Portatil portatil) {
			super();
			this.idAlumno = idAlumno;
			this.nombre = nombre;
			this.tlf = tlf;
			this.portatil = portatil;
		}

		public AlumnoDTO() {
			super();
		}

		public AlumnoDTO(String nombre, String tlf, Portatil portatil) {
			super();
			this.nombre = nombre;
			this.tlf = tlf;
			this.portatil = portatil;
		}
		
		
}
