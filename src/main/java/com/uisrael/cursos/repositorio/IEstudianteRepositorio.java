package com.uisrael.cursos.repositorio;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.cursos.modelo.Estudiante;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer> {

	@Query("Select e From Estudiante e where e.cedulaIdentidad =?1") //jpql
	public Estudiante buscarEstudianteId(String cedula);
	
	public List<Estudiante> findByNombre(String nombre);
	
	public List<Estudiante> findByApellido(String apellido);
	
	public List<Estudiante> findByFechaNacimiento(Date fechaNacimiento); 
	
	List<Estudiante> findByCorreo(String correo);
	
	
}
