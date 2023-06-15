package gestionMaterialProyIIS.webControllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import gestionMaterialProyIIS.consultas.ConsultasServicio;
import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;
import gestionMaterialProyIIS.dto.AlumnoDTO;
import gestionMaterialProyIIS.dto.PortatilDTO;
import gestionMaterialProyIIS.dto.ToDTOServicio;
import gestionMaterialProyIIS.dto.ToDTOServicioImpl;

/**
 * 
 * Haremos una seleccion de todos los alumnos y sus respectivos portatiles
 * @author saigo
 *
 */
@Controller
public class ListaDeTodo {
	
	@Autowired
	ConsultasServicio consulta;

	ToDTOServicio toDTO = new ToDTOServicioImpl();

	@RequestMapping(value = "/redirectListaDeTodo")
	public ModelAndView gestionSolicitud() {

		try {

			
			Map<String, Object> miModel = new HashMap<String, Object>();

			
			List<Alumno> listaAlumnosDAO = consulta.seleccionarTodosAlumnos();
			List<Portatil> listaPortatilesDAO = consulta.listarPortatiles();

			
			List<AlumnoDTO> listaAlumnosDTO = toDTO.ListAlumnoToDTO(listaAlumnosDAO);
			List<PortatilDTO> listaPortatilesDTO = toDTO.ListPortatilToDTO(listaPortatilesDAO);

			
			miModel.put("listaAlumnos", listaAlumnosDTO);
			miModel.put("listaPortatiles", listaPortatilesDTO);

			return new ModelAndView("ListaDeTodo", "miModel", miModel);
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error");
		}

	}

}
