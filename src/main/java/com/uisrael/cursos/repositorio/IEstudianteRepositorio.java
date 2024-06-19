package com.uisrael.cursos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uisrael.cursos.modelo.Estudiante;

import java.util.Date;
import java.util.List;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer> {
	
	@Query("Select e From Estudiante e where e.cedulaIdentidad=?1") //JPQL
	public Estudiante buscarEstudianteId(String cedula);
	
	public List<Estudiante> findByNombre(String nombre);
	
	public List<Estudiante> findByApellido(String apellido);
	
	public List<Estudiante> findByFechaNacimiento(Date fechaNacimiento);
	
	public List<Estudiante> findByCorreo(String correo);
	
	@Query("SELECT e FROM Estudiante e WHERE YEAR(e.fechaNacimiento) BETWEEN :anioInicio AND :anioFin")
	public List<Estudiante> buscarPorFechas(int anioInicio, int anioFin);
}
