package gestionMaterialProyIIS.consultas;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import gestionMaterialProyIIS.dao.Alumno;
import gestionMaterialProyIIS.dao.AlumnoRepository.AlumnoRepositorio;
import gestionMaterialProyIIS.dao.Portatil;
import gestionMaterialProyIIS.dao.PortatilRepository.PortatilRepositorio;

public class ConsultasServicioImpl implements ConsultasServicio {

	@Autowired
	private AlumnoRepositorio psi1;

	@Autowired
	private PortatilRepositorio psi2;

	public void insertarAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		try {
			psi1.save(alumno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Alumno seleccionarAlumno(int idAlumno) {
		// TODO Auto-generated method stub
		try {
			Optional<Alumno> alumn = psi1.findById(idAlumno);
			Alumno alumn1 = new Alumno();
			alumn1.setNombre(alumn.get().getNombre());
			alumn1.setIdAlumno(alumn.get().getIdAlumno());
			alumn1.setTlf(alumn.get().getTlf());
			alumn1.setPortatil(alumn.get().getPortatil());

			return alumn1;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public List<Alumno> seleccionarTodosAlumnos() {
		try {
			Iterable<Alumno> iterable = psi1.findAll();
			List<Alumno> listAlumnos = new ArrayList<>();
			for (Alumno alumno : iterable) {
				listAlumnos.add(alumno);
			}
			return listAlumnos;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public void eliminarAlumno(int idAlumno) {

		Optional<Alumno> alumn = psi1.findById(idAlumno);
		Alumno alumn1 = new Alumno();
		alumn1.setNombre(alumn.get().getNombre());
		alumn1.setIdAlumno(alumn.get().getIdAlumno());
		alumn1.setTlf(alumn.get().getTlf());
		alumn1.setPortatil(alumn.get().getPortatil());
		psi1.delete(alumn1);

	}

	public int insertarPortatil(Portatil portatil) {
		try {
			psi2.save(portatil);
			return portatil.getIdPortatil();
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public List<Portatil> listarPortatiles() {
		return (List<Portatil>) psi2.findAll();
	}

	public Portatil seleccionarPortatil(int idPortatil) {

		try {
			Optional<Alumno> alumno = psi1.findById(idPortatil);
			return alumno.get().getPortatil();

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

}
