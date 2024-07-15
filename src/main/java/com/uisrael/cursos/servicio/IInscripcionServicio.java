package com.uisrael.cursos.servicio;

import java.util.List;

import com.uisrael.cursos.modelo.Inscripcion;

public interface IInscripcionServicio {

	public void insertarInscripcion(Inscripcion nueva);

	public List<Inscripcion> listaInscripcion();
	
	public Inscripcion buscarId(int id);
	
	public void eliminarInscripcion(int id);
}
