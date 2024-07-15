package com.uisrael.cursos;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.cursos.modelo.Curso;
import com.uisrael.cursos.modelo.Estudiante;
import com.uisrael.cursos.modelo.Inscripcion;
import com.uisrael.cursos.servicio.ICursoServicio;
import com.uisrael.cursos.servicio.IEstudianteServicio;
import com.uisrael.cursos.servicio.IInscripcionServicio;

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
		
	 /* Curso nuevo= new Curso();
	  nuevo.setNombre("Programación Java II");
	  nuevo.setFechaRegistro(new Date());
	  nuevo.setDescripcion("Desarrollo web");
	  nuevo.setCosto(80);
	  nuevo.setEstado(true);
	  //servicioCurso.insertarCurso(nuevo);
	  //List<Curso> resultadoSelect= servicioCurso.listarCursos();*/
	  
	  Estudiante nuevoEstudiante= new Estudiante();
	  //nuevoEstudiante.setIdEstudiante(1);
	  nuevoEstudiante.setNombre("Carlos");
	  nuevoEstudiante.setApellido("Monje");
	  nuevoEstudiante.setCedulaIdentidad("1723256879");
	  //servicioEstudiante.insertarEstudiante(nuevoEstudiante);
	  
	  Inscripcion nuevaInscripcion= new Inscripcion();
	  nuevaInscripcion.setFechaInscripcion(new Date());
	  nuevaInscripcion.setFkEstudiante(nuevoEstudiante);
	  //servicioInscripcion.insertarInscripcion(nuevaInscripcion);*/
		
		List<Estudiante> lista= servicioEstudiante.listarEstudiantes();
		for (Estudiante estudiante : lista) {
			System.out.println(estudiante.getIdEstudiante() + " " + estudiante.getApellido()+ " "+estudiante.getNombre());
		}
	  
		System.out.println("Buscar por ID");
		nuevoEstudiante= servicioEstudiante.buscarEstudianteId("1723256555");
		System.out.println(nuevoEstudiante.getIdEstudiante() + " " + nuevoEstudiante.getApellido()+ " " + nuevoEstudiante.getNombre());
	  
		System.out.println("Buscar por nombre");
		List<Estudiante> lista1= servicioEstudiante.findByNombre("Carlos");
		for (Estudiante estudiante : lista1) {
			System.out.println(estudiante.getIdEstudiante() + " " + estudiante.getApellido()+" "+ estudiante.getNombre());
		}
	}

}
