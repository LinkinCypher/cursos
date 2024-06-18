package com.uisrael.cursos.servicios;

import java.util.List;

import com.uisrael.cursos.modelo.Inscripcion;

public interface IInscripcionServicio
{
	public void insertarInscripcion(Inscripcion nuevoInscripcion);

	public void actualizarInscripcion(Inscripcion editarInscripcion);

	public List<Inscripcion> listarInscripcion();
}
