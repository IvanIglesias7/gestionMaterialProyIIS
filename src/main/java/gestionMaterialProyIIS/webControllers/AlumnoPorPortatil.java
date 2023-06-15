package gestionMaterialProyIIS.webControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gestionMaterialProyIIS.consultas.ConsultasServicio;
import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dto.AlumnoDTO;
import gestionMaterialProyIIS.dto.ToDTOServicio;
import gestionMaterialProyIIS.dto.ToDTOServicioImpl;

/**
 * Controlador de la pagina AlumnoPorPortatil. Aqui buscaremos un alumon por el id del portatil.
 * @author saigo
 *
 */


@Controller
public class AlumnoPorPortatil {

	@Autowired
	ConsultasServicio consulta;

	ToDTOServicio toDTO = new ToDTOServicioImpl();

	@RequestMapping(value = "/redirectAlumnoPorPortatil")
	public ModelAndView gestionSolicitud() {

		return new ModelAndView("AlumnoPorPortatil");

	}

	@RequestMapping(value = "/AlumnoPorPortatil")
	public ModelAndView procesarFormulario(@RequestParam Integer idPortatil, RedirectAttributes ra) {

		try {
			
			Alumno alumno = consulta.seleccionarAlumno(idPortatil);

			if (alumno == null) {
				throw (new Exception("El portátil no está asignado a ningún alumno"));
			}

			AlumnoDTO alumnoDTO = toDTO.AlumnoToDTO(alumno);

			ra.addFlashAttribute("alumnoDTO", alumnoDTO);

			ModelAndView model = new ModelAndView();
			model.setViewName("redirect:/redirectAlumnoPorPortatil");
			return model;

		} catch (Exception e) {
			
			ra.addFlashAttribute("mensaje", "El portátil no está asignado a ningún alumno");

			ModelAndView model = new ModelAndView();
			model.setViewName("redirect:/redirectAlumnoPorPortatil");
			return model;
		}

	}
}
