package gestionMaterialProyIIS.dto;


import java.util.List;

import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;

//interfaz que se encargara de convertir DAOs a DTOs
public interface ToDTOServicio {

	//metodo que convierte un dao de alumno en un dto
	public AlumnoDTO AlumnoToDTO(Alumno alumnoDAO);
	
	//metodo que convierte un dao de portatil en un dto
	public PortatilDTO PortatilToDTO(Portatil portatilDAO);
	
	//metodo que convierte una lista de daos de alumnos en lista de alumnos dtos
	public List<AlumnoDTO> ListAlumnoToDTO(List<Alumno> listAlumnoDAO);
	
	//metodo que convierte una lista de daos de portatiles en lista de portatiles dtos
	public List<PortatilDTO> ListPortatilToDTO(List<Portatil> listPortatilDAO);
	
}
