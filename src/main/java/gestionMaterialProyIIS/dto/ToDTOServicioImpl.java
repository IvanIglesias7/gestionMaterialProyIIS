package gestionMaterialProyIIS.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;

public class ToDTOServicioImpl implements ToDTOServicio {

	@Override
	public AlumnoDTO AlumnoToDTO(Alumno alumnoDAO) {
		
		AlumnoDTO alumnoDTO = new AlumnoDTO();
		
		alumnoDTO.setIdAlumno(alumnoDAO.getIdAlumno());
		alumnoDTO.setNombre(alumnoDAO.getNombre());
		alumnoDTO.setPortatil(alumnoDAO.getPortatil());
		alumnoDTO.setTlf(alumnoDAO.getTlf());
		
		return alumnoDTO;
	}

	@Override
	public PortatilDTO PortatilToDTO(Portatil portatilDAO) {
		
		PortatilDTO portatilDTO = new PortatilDTO();
		
		portatilDTO.setIdPortatil(portatilDAO.getIdPortatil());
		portatilDTO.setMarca(portatilDAO.getMarca());
		portatilDTO.setModelo(portatilDAO.getModelo());
		
		return portatilDTO;
	}

	@Override
	public List<AlumnoDTO> ListAlumnoToDTO(List<Alumno> listAlumno) {
		
		List<AlumnoDTO> listAlumnoDTO = new ArrayList<AlumnoDTO>();

		listAlumnoDTO = listAlumno.stream()
				.map(alumno -> new AlumnoDTO(alumno.getIdAlumno(), alumno.getNombre(), alumno.getTlf(), alumno.getPortatil()))
				.collect(Collectors.toList());

		return listAlumnoDTO;
	}

	@Override
	public List<PortatilDTO> ListPortatilToDTO(List<Portatil> listPortatil) {
		List<PortatilDTO> listPortatilDTO = new ArrayList<PortatilDTO>();

		listPortatilDTO = listPortatil.stream()
				.map(portatil -> new PortatilDTO(portatil.getIdPortatil(),portatil.getMarca(), portatil.getModelo()))
				.collect(Collectors.toList());

		return listPortatilDTO;
	}

}
