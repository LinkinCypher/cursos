package com.uisrael.cursos.servicios;

import java.util.List;

import com.uisrael.cursos.modelo.ContenidoCurso;

public interface IContenidoCursoServicio 
{
	public void insertarContenidoCurso(ContenidoCurso nuevoContenidoCurso);

	public void actualizarContenidoCurso(ContenidoCurso editarContenidoCurso);

	public List<ContenidoCurso> listarContenidoCurso();
}
