package com.uisrael.cursos.servicio;

import java.util.List;

import com.uisrael.cursos.modelo.Curso;

public interface ICursoServicio {

	public void insertarCurso(Curso nuevoCurso);

	public void actualizarCurso(Curso editarCurso);

	public List<Curso> listarCursos();

	public void eliminarCurso(int idCurso);
	
	public Curso buscarCursoId(int idCurso);
}
