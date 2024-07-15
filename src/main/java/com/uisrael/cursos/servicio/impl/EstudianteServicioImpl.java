package com.uisrael.cursos.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Estudiante;
import com.uisrael.cursos.repositorio.IEstudianteRepositorio;
import com.uisrael.cursos.servicio.IEstudianteServicio;

@Service
@Component
public class EstudianteServicioImpl implements IEstudianteServicio {

	@Autowired
	private IEstudianteRepositorio repositorioEstudiante;
	
	@Override
	public void insertarEstudiante(Estudiante nuevoEstudiante) {
		repositorioEstudiante.save(nuevoEstudiante);
		
	}

	@Override
	public List<Estudiante> listarEstudiantes() {
		
		return repositorioEstudiante.findAll();
	}

	@Override
	public Estudiante buscarEstudianteId(String cedula) {
		try {
			return repositorioEstudiante.buscarEstudianteId(cedula);
			
		} catch (Exception e) {
			System.out.println("Error:");
			return null;
		}
		
		
	}

	@Override
	public List<Estudiante> findByNombre(String nombre) {
		try {
			return repositorioEstudiante.findByNombre(nombre);
			
		} catch (Exception e) {
			System.out.println("Error:");
			return null;
		}
	}

	@Override
	public List<Estudiante> findByApellido(String apellido) {
		try {
			return repositorioEstudiante.findByApellido(apellido);
			
		} catch (Exception e) {
			System.out.println("Error:");
			return null;
		}
	}

}
