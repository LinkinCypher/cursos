package com.uisrael.cursos.servicios;

import java.util.List;

import com.uisrael.cursos.modelo.CursohasContenido;

public interface ICursoHasContenidoServicio 
{
	public void insertarCursoHasContenido(CursohasContenido nuevoCursoHasContenido);

	public void actualizarCursoHasContenido(CursohasContenido editarCursoHasContenido);

	public List<CursohasContenido> listarCursoHasContenido();
}
