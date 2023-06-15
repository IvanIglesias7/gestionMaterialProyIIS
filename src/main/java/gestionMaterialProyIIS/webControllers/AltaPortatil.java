package gestionMaterialProyIIS.webControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import gestionMaterialProyIIS.consultas.ConsultasServicio;
import gestionMaterialProyIIS.dao.Portatil;
import gestionMaterialProyIIS.dto.PortatilDTO;
import gestionMaterialProyIIS.dto.ToDAOServicio;
import gestionMaterialProyIIS.dto.ToDAOServicioImpl;


/**
 * Controlador de la pagina, AltaPortatil. Aqui daremos de alta un portatil.
 */

@Controller
public class AltaPortatil {

	@Autowired
	ConsultasServicio consulta;
	
	ToDAOServicio toDAO = new ToDAOServicioImpl();
	
	
	@RequestMapping(value="/redirectAltaPortatil")
	public ModelAndView gestionSolicitud() {

		return new ModelAndView("altaPortatil");
	}
	
	
	@PostMapping("/altaPortatil")
    public ModelAndView procesarFormulario(@RequestParam String marca, @RequestParam String modelo) {
        
		try {
			//Creo el ModelAndViEW
	    	ModelAndView model = new ModelAndView();
	    	
	    	PortatilDTO portatilDTO = new PortatilDTO(modelo, marca);
		    	   
	    	Portatil portatil = toDAO.PortatilToDAO(portatilDTO);

	    	
		    consulta.insertarPortatil(portatil);
	    	
		    return new ModelAndView("altaPortatil", "mensaje", "Insertado correctamente");
		    
		}catch (Exception e) {
			return new ModelAndView("altaPortatil", "mensaje", "Error");
		}
}
}
