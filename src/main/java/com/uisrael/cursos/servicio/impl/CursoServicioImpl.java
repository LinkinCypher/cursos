package com.uisrael.cursos.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Curso;
import com.uisrael.cursos.repositorio.ICursoRepositorio;
import com.uisrael.cursos.servicio.ICursoServicio;

@Service
public class CursoServicioImpl implements ICursoServicio {

	@Autowired
	ICursoRepositorio cursoRepositorio;

	@Override
	public void insertarCurso(Curso nuevoCurso) {
		try {
			cursoRepositorio.save(nuevoCurso);

		} catch (Exception e) {
			System.out.println("Error al Insertar Curso");
		}

	}

	@Override
	public void actualizarCurso(Curso editarCurso) {
		try {
			cursoRepositorio.save(editarCurso);

		} catch (Exception e) {
			System.out.println("Error al Insertar Curso");
		}
	}

	@Override
	public List<Curso> listarCursos() {
		try {
			return cursoRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error al Insertar Curso");
			return null;
		}

	}
	
	@Override
	public void eliminarCurso(int idCurso) {
		try {
			cursoRepositorio.deleteById(idCurso);

		} catch (Exception e) {
			System.out.println("Error al Insertar Curso");
		}
	}

	@Override
	public Curso buscarCursoId(int idCurso) {
		try {
			 return cursoRepositorio.findById(idCurso).get();

		} catch (Exception e) {
			System.out.println("Error al Insertar Curso");
			return null;
		}
	}

}
