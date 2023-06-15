package gestionMaterialProyIIS.dto;

import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;

//inferfaz que se encargara de convertir DTOs a DAOs
public interface ToDAOServicio {

	//metodo que convierte un dto de alumno en un dao
	public Alumno AlumnoToDAO(AlumnoDTO alumnoDTO);
	
	//metodo que convierte un dto de portatil en un dao
	public Portatil PortatilToDAO(PortatilDTO portatilDTO);

}
