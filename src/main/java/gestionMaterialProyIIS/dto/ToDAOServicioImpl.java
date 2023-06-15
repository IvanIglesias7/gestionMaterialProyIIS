package gestionMaterialProyIIS.dto;

import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;

/**
 * Implementacion del servicio ToDAOServicio
 * @author saigo
 *
 */
public class ToDAOServicioImpl implements ToDAOServicio {

	@Override
	public Alumno AlumnoToDAO(AlumnoDTO alumnoDTO) {
		
		Alumno alumn = new Alumno();
		
		alumn.setIdAlumno(alumnoDTO.getIdAlumno());
		alumn.setNombre(alumnoDTO.getNombre());
		alumn.setPortatil(alumnoDTO.getPortatil());
		alumn.setTlf(alumnoDTO.getTlf());
		
		return alumn;
	}

	@Override
	public Portatil PortatilToDAO(PortatilDTO portatilDTO) {
		
		Portatil portatil = new Portatil();
		
		portatil.setIdPortatil(portatilDTO.getIdPortatil());
		portatil.setMarca(portatilDTO.getMarca());
		portatil.setModelo(portatilDTO.getModelo());
		
		return portatil;
	}

}
