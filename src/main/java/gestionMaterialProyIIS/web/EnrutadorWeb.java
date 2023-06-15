package gestionMaterialProyIIS.web;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import gestionMaterialProyIIS.app.AppConfiguracion;

/**
 * Configura que clases son la configuracion de la aplicacion y de la web.
 * @author saigo
 *
 */
public class EnrutadorWeb extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { AppConfiguracion.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfiguracionContexto.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
