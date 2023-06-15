package gestionMaterialProyIIS.dto;

import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;

/**
 * Interfaz que se encarga de pasar de DTO a DAO
 * @author saigo
 *
 */
public interface ToDAOServicio {

	/**
	 * metodo que convierte un dto de alumno en un dao
	 * @param alumnoDTO
	 * @return
	 */
	public Alumno AlumnoToDAO(AlumnoDTO alumnoDTO);
	
	/**
	 * metodo que convierte un dto de portatil en un dao
	 * @param portatilDTO
	 * @return
	 */
	public Portatil PortatilToDAO(PortatilDTO portatilDTO);

}
