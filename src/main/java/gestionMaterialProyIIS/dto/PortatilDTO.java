package gestionMaterialProyIIS.dto;

public class PortatilDTO {
	
	// ATRIBUTOS

		private int idPortatil;
		private String marca;
		private String modelo;

		
		

		//Getters and Setters
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

		//ToString
		@Override
		public String toString() {
			return "Portatil [idPortatil=" + idPortatil + ", marca=" + marca + ", modelo=" + modelo + "]";
		}

		public PortatilDTO(int idPortatil, String marca, String modelo) {
			super();
			this.idPortatil = idPortatil;
			this.marca = marca;
			this.modelo = modelo;
		}
		
		public PortatilDTO(String marca, String modelo) {
			super();
			this.marca = marca;
			this.modelo = modelo;
		}

		public PortatilDTO() {
			super();
		}
		
		
		
		
		
		
}
