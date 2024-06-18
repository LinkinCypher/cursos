package com.uisrael.cursos.servicios;

import java.util.List;

import com.uisrael.cursos.modelo.Estudiante;

public interface IEstudianteServicio 
{
	public void insertarEstudiante(Estudiante nuevoEstudiante);

	public List<Estudiante> listarEstudiantes();

}
