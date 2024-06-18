package com.uisrael.cursos.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Curso;
import com.uisrael.cursos.repositorio.ICursoRepositorio;
import com.uisrael.cursos.servicios.ICursoServicio;

@Service
public class CursoServicioimpl implements ICursoServicio {
	@Autowired
	ICursoRepositorio cursoRepositorio;

	@Override
	public void insertarCurso(Curso nuevoCurso) {
		try {
			cursoRepositorio.save(nuevoCurso);
		} catch (Exception e) {
			System.out.println("Error al insertar curso..");
		}

	}

	@Override
	public void actualizarCurso(Curso editarCurso) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Curso> listarCursos() {
		try {
			return cursoRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error al listar el curso..");
			return null;
		}

	}

}
