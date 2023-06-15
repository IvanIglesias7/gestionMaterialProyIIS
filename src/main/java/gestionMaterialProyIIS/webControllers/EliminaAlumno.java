package gestionMaterialProyIIS.webControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gestionMaterialProyIIS.consultas.ConsultasServicio;
import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dto.AlumnoDTO;
import gestionMaterialProyIIS.dto.ToDAOServicio;
import gestionMaterialProyIIS.dto.ToDAOServicioImpl;
import gestionMaterialProyIIS.dto.ToDTOServicio;
import gestionMaterialProyIIS.dto.ToDTOServicioImpl;


/**
 * Controlador de la pagina EliminaAlumno. Aqui eliminaremos a un alumno por su id.
 * @author saigo
 *
 */


@Controller
public class EliminaAlumno {

	@Autowired
	ConsultasServicio consulta;

	ToDAOServicio toDAO = new ToDAOServicioImpl();

	ToDTOServicio toDTO = new ToDTOServicioImpl();

	@RequestMapping(value = "/redirectEliminarAlumno")
	public ModelAndView gestionSolicitud() {

		try {

			List<Alumno> listAlumnoDAO = consulta.seleccionarTodosAlumnos();

			List<AlumnoDTO> listAlumnoDTO = toDTO.ListAlumnoToDTO(listAlumnoDAO);

			return new ModelAndView("eliminarAlumno", "listAlumnos", listAlumnoDTO);

		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error");
		}

	}

	@RequestMapping(value = "/eliminarAlumno")
	public ModelAndView procesarFormulario(@RequestParam Integer id) {

		try {

			System.out.println(id);

			consulta.eliminarAlumno(id);
			System.out.println("Alumno con el id: " + id + " eliminado.");
			ModelAndView model = new ModelAndView();
			model.setViewName("redirect:/redirectEliminarAlumno");
			return model;

		} catch (Exception e) {

			e.printStackTrace();
			ModelAndView model = new ModelAndView();
			model.setViewName("redirect:/redirectEliminarAlumno");
			return model;
		}

	}

}
