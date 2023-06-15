package gestionMaterialProyIIS.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 * Hace un mapeo de la web, basicamente un archivo de configuracion de la web
 * @author saigo
 *
 */

@Configuration
@ComponentScan
@EnableWebMvc
public class WebConfiguracionContexto {

    @Bean
    public ViewResolver mapeo() {
        InternalResourceViewResolver irvr = new InternalResourceViewResolver();
        irvr.setPrefix("/vistas/"); //No hace falta especificar la ruta completa a la hora de poner el nombre
        irvr.setSuffix(".jsp"); //No hace falta especificar el sufijo, que es el tipo de archivo a la hora de poner el nombre
        return irvr;
    }
    
  
	
}
