package gestionMaterialProyIIS.dao;


/**
 * Repositorio de portatil que hereda los metodos de la clase crudRepository
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public class PortatilRepository {

	@Repository
	public interface PortatilRepositorio extends CrudRepository<Portatil, Integer> {

	}
}
