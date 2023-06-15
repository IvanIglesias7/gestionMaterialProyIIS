package gestionMaterialProyIIS.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de alumno que hereda la clase CrudRepository para usar los metodos de crud.
 * @author saigo
 *
 */

public class AlumnoRepository {

	@Repository
	public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer> {

	}
}
