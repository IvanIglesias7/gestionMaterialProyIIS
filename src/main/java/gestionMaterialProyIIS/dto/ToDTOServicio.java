package gestionMaterialProyIIS.dto;


import java.util.List;

import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;

/**
 * Interfaz que se encargara de convertir DAOs a DTOs
 * @author saigo
 *
 */
public interface ToDTOServicio {

	/**
	 * metodo que convierte un dao de alumno en un dto
	 * @param alumnoDAO
	 * @return
	 */
	public AlumnoDTO AlumnoToDTO(Alumno alumnoDAO);
	
	/**
	 * metodo que convierte un dao de portatil en un dto
	 * @param portatilDAO
	 * @return
	 */
	public PortatilDTO PortatilToDTO(Portatil portatilDAO);
	
	/**
	 * metodo que convierte una lista de daos de alumnos en lista de alumnos dtos
	 * @param listAlumnoDAO
	 * @return
	 */
	public List<AlumnoDTO> ListAlumnoToDTO(List<Alumno> listAlumnoDAO);
	
	/**
	 * metodo que convierte una lista de daos de portatiles en lista de portatiles dtos
	 * @param listPortatilDAO
	 * @return
	 */
	public List<PortatilDTO> ListPortatilToDTO(List<Portatil> listPortatilDAO);
	
}
