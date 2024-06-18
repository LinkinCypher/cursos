package com.uisrael.cursos;

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
		
		Curso nuevoCurso = new Curso();
		nuevoCurso.setNombre("Programacion Java II");
		nuevoCurso.setFechaRegistro(new Date());
		nuevoCurso.setDescripcion("Desarrollo Web");
		nuevoCurso.setCosto(80);
		nuevoCurso.setEstado(true);
		servicioCurso.insertarCurso(nuevoCurso);
		List<Curso> resultadoSelect = servicioCurso.listarCursos();			
		
		Estudiante nuevoEstudiante = new Estudiante();
		//nuevoEstudiante.setIdEstudiante(1);
		nuevoEstudiante.setNombre("Cristhian");
		nuevoEstudiante.setApellido("Mora");
		nuevoEstudiante.setCedulaIdentidad("1234567890");
		nuevoEstudiante.setCorreo("cristhian@mail.com");
		nuevoEstudiante.setDireccion("Quito");
		nuevoEstudiante.setFechaNacimiento(null);
		servicioEstudiante.insertarEstudiante(nuevoEstudiante);
		
		Inscripcion nuevaIscripcion = new Inscripcion();
		nuevaIscripcion.setFechainscripcion(new Date());
		nuevaIscripcion.setFkEstudiante(nuevoEstudiante);
		servicioInscripcion.insertarInscripcion(nuevaIscripcion);
		
	}

}
