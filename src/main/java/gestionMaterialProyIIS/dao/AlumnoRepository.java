package gestionMaterialProyIIS.dao;

/*
 * Hereda los metodos de la clase CrudRepository
 *
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class AlumnoRepository {

	@Repository
	public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer> {

	}
}
