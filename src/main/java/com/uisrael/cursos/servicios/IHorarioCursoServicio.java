package com.uisrael.cursos.servicios;

import java.util.List;

import com.uisrael.cursos.modelo.Horariocursos;

public interface IHorarioCursoServicio
{
	public void insertarHorarioCurso(Horariocursos nuevoHorariocursos);

	public void actualizarHorarioCurso(Horariocursos editarHorariocursos);

	public List<Horariocursos> listarHorariocursos();	
}
