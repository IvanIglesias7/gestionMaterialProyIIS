package gestionMaterialProyIIS.consultas;

import java.util.List;

import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.Portatil;

/**
 * Interfaz que implementa consultas en base de datos en la clase ConsultasServicioImpl.
 * @author saigo
 *
 */
public interface ConsultasServicio {

	/**
	 * Inserta un alumno en la bd
	 * @param alumno
	 */
	public void insertarAlumno(Alumno alumno);

	/**
	 *  Selecciona un alumno
	 * @param idAlumno
	 * @return
	 */
	public Alumno seleccionarAlumno(int idAlumno);

	/**
	 *  Selecciona todos los alumnos
	 * @return
	 */
	public List<Alumno> seleccionarTodosAlumnos();

	/**
	 *  Elimina un alumno por su id
	 * @param idAlumno
	 */
	public void eliminarAlumno(int idAlumno);

	/**
	 *  Inserta un portatil en la bd
	 * @param portatil
	 * @return
	 */
	public int insertarPortatil(Portatil portatil);

	/**
	 *  Lista los portatiles
	 * @return
	 */
	public List<Portatil> listarPortatiles();

	/**
	 *  Selecciona un portatil
	 * @param idPortatil
	 * @return
	 */
	public Portatil seleccionarPortatil(int idPortatil);

}
