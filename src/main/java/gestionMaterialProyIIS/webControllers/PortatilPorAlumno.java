package gestionMaterialProyIIS.webControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gestionMaterialProyIIS.consultas.ConsultasServicio;
import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;
import gestionMaterialProyIIS.dto.PortatilDTO;
import gestionMaterialProyIIS.dto.ToDTOServicio;
import gestionMaterialProyIIS.dto.ToDTOServicioImpl;

@Controller
public class PortatilPorAlumno {

	@Autowired
	ConsultasServicio consulta;
	
	ToDTOServicio toDTO = new ToDTOServicioImpl();
	
	@RequestMapping(value="/redirectPortatilPorAlumno")
	public ModelAndView gestionSolicitud() {

		return new ModelAndView("PortatilPorAlumno");
	}
	
	
	@RequestMapping(value="/PortatilPorAlumno")
    public ModelAndView procesarFormulario(@RequestParam Integer idAlumno, RedirectAttributes ra) {
        
		try { 	
			

			Alumno alumnoDAO = consulta.seleccionarAlumno(idAlumno);
			

			Portatil portatilDAO = consulta.seleccionarPortatil(alumnoDAO.getPortatil().getIdPortatil());
	        

			PortatilDTO portatilDTO = toDTO.PortatilToDTO(portatilDAO);
			

	        ra.addFlashAttribute("portatilDTO", portatilDTO);
	        

	        ModelAndView model = new ModelAndView();
	        model.setViewName("redirect:/redirectPortatilPorAlumno");
	        return model;
		    
		}catch (Exception e) {			
			// Agregamos un mensaje de error a los atributos de redirección
	        ra.addFlashAttribute("mensaje", "El alumno no existe");
	        
	        // Redirigimos al método gestionSolicitud()
	        ModelAndView model = new ModelAndView();
	        model.setViewName("redirect:/redirectPortatilPorAlumno");
	        return model;
		}
    	
	}
}
