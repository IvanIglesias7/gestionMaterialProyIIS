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

	// Inserta un alumno en la bd
	public void insertarAlumno(Alumno alumno);

	// Selecciona un alumno
	public Alumno seleccionarAlumno(int idAlumno);

	// Selecciona todos los alumnos
	public List<Alumno> seleccionarTodosAlumnos();

	// Elimina un alumno por su id
	public void eliminarAlumno(int idAlumno);

	// Inserta un portatil en la bd
	public int insertarPortatil(Portatil portatil);

	// Lista los portatiles
	public List<Portatil> listarPortatiles();

	// Selecciona un portatil
	public Portatil seleccionarPortatil(int idPortatil);

}
