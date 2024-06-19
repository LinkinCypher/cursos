package com.uisrael.cursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.cursos.modelo.Curso;
import com.uisrael.cursos.modelo.Estudiante;
import com.uisrael.cursos.modelo.Inscripcion;
import com.uisrael.cursos.servicios.ICursoServicio;
import com.uisrael.cursos.servicios.IEstudianteServicio;
import com.uisrael.cursos.servicios.IInscripcionServicio;

@SpringBootTest
class CursosApplicationTests {
	
	@Autowired
	ICursoServicio servicioCurso;
	@Autowired
	IEstudianteServicio servicioEstudiante;
	@Autowired
	IInscripcionServicio servicioInscripcion;
	
	@Test
	void contextLoads() {
		
		
		/*
		//CURSO
		Curso nuevoCurso = new Curso();
		nuevoCurso.setNombre("Programacion Java II");
		nuevoCurso.setFechaRegistro(new Date());
		nuevoCurso.setDescripcion("Desarrollo Web");
		nuevoCurso.setCosto(80);
		nuevoCurso.setEstado(true);
		servicioCurso.insertarCurso(nuevoCurso);
				
		
		
		
		//ESTUDIANTE
		Estudiante nuevoEstudiante = new Estudiante();
		//nuevoEstudiante.setIdEstudiante(1);
		nuevoEstudiante.setNombre("Cristhian");
		nuevoEstudiante.setApellido("Mora");
		nuevoEstudiante.setCedulaIdentidad("4567");
		nuevoEstudiante.setCorreo("cristhian@mail.com");
		nuevoEstudiante.setDireccion("Quito");
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date fechaNacimiento = dateFormat.parse("2004-04-24");
            nuevoEstudiante.setFechaNacimiento(fechaNacimiento);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
        }
		
		servicioEstudiante.insertarEstudiante(nuevoEstudiante);
		
		
		
		//INSCRIPCIÓN
		Inscripcion nuevaIscripcion = new Inscripcion();
		nuevaIscripcion.setFechainscripcion(new Date());
		nuevaIscripcion.setFkEstudiante(nuevoEstudiante);
		servicioInscripcion.insertarInscripcion(nuevaIscripcion);
		*/
		
		
		//LISTAR
		List<Curso> resultadoSelect = servicioCurso.listarCursos();
		
		List<Estudiante>lista=servicioEstudiante.listarEstudiantes();
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante.getIdEstudiante() + " " + estudiante.getApellido() + " " + estudiante.getNombre());
		}
		
		System.out.println("Buscar por Nombre");
		List<Estudiante>lista1=servicioEstudiante.findByNombre("Cristhian");
		for (Estudiante estudiante : lista1) {
			System.out.println(estudiante.getIdEstudiante() + " " + estudiante.getApellido() + " " + estudiante.getNombre());
		}
		
		System.out.println("Buscar por Apellido");
		List<Estudiante>lista2=servicioEstudiante.findByApellido("Mora");
		for (Estudiante estudiante : lista2) {
			System.out.println(estudiante.getIdEstudiante() + " " + estudiante.getApellido() + " " + estudiante.getNombre());
		}
		
		System.out.println("Buscar por Fechas");
		List<Estudiante>lista3=servicioEstudiante.buscarPorFechas(1994,2024);
		for (Estudiante estudiante : lista3) {
			System.out.println(estudiante.getIdEstudiante() + " " + estudiante.getApellido() + " " + estudiante.getNombre());
		}
		
		
		
		
	}

}
