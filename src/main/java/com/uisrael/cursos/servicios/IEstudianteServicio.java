package com.uisrael.cursos.servicios;

import java.util.List;

import com.uisrael.cursos.modelo.Estudiante;

public interface IEstudianteServicio 
{
	public void insertarEstudiante(Estudiante nuevoEstudiante);

	public List<Estudiante> listarEstudiantes();
	
	public Estudiante buscarEstudianteId(String cedula);

	public List<Estudiante> findByNombre(String nombre);
	
	public List<Estudiante> findByApellido(String apellido);
	
	public List<Estudiante> buscarPorFechas(int anioInicio, int anioFin);

}
