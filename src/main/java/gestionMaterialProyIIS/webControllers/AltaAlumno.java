package gestionMaterialProyIIS.webControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import gestionMaterialProyIIS.consultas.ConsultasServicio;
import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;
import gestionMaterialProyIIS.dto.AlumnoDTO;
import gestionMaterialProyIIS.dto.ToDAOServicio;
import gestionMaterialProyIIS.dto.ToDAOServicioImpl;

/**
 * Controlador de la pagina "AltaAlumno", aqui daremos de alta a un alumno
 * @author saigo
 *
 */

@Controller
public class AltaAlumno {
	
	@Autowired
	ConsultasServicio consulta;
	
	ToDAOServicio toDAO = new ToDAOServicioImpl();
	
	@RequestMapping(value="/redirectMatriculaAlumno")
	public ModelAndView gestionSolicitud() {

    	List<Portatil> listIDsPortailesLibres = null;
		try {
			listIDsPortailesLibres = consulta.listarPortatiles();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	List<String> listNull = new ArrayList<String>();
    	listNull.add("No hay portatiles libres");
    	
    	if (listIDsPortailesLibres.isEmpty()) {
    		return new ModelAndView("matriculaAlumno", "listIDsPortailesLibres", listNull);
    	} else {
    		return new ModelAndView("matriculaAlumno", "listIDsPortailesLibres", listIDsPortailesLibres);
    	}
		
	}
	
	
	@PostMapping("/matriculaAlumno")
	public ModelAndView procesarFormulario(@RequestParam String nombre, @RequestParam String tlf,@RequestParam String portatil, @RequestParam Integer idPortatil, RedirectAttributes ra) {       
	        
	    try {
	        
	        Portatil portatilDAO = consulta.seleccionarPortatil(idPortatil);     
	        
	        
	        AlumnoDTO alumnoDTO = new AlumnoDTO();
	                
	        
	        Alumno alumno = toDAO.AlumnoToDAO(alumnoDTO);

	        
	        
	        consulta.insertarAlumno(alumno);
	        
	        
	        ra.addFlashAttribute("mensaje", "Registro insertado correctamente");
	        
	        
	        ModelAndView model = new ModelAndView();
	        model.setViewName("redirect:/redirectAltaAlumno");
	        return model;
	        
	    } catch (Exception e) {
	        
	        ra.addFlashAttribute("mensaje", "Ha ocurrido un error inesperado");
	        
	        
	        ModelAndView model = new ModelAndView();
	        model.setViewName("redirect:/redirectAltaAlumno");
	        return model;
	    }
	}

}
