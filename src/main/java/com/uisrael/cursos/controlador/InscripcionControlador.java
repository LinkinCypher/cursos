package com.uisrael.cursos.controlador;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.cursos.modelo.Curso;
import com.uisrael.cursos.modelo.Estudiante;
import com.uisrael.cursos.modelo.Inscripcion;
import com.uisrael.cursos.servicio.ICursoServicio;
import com.uisrael.cursos.servicio.IEstudianteServicio;
import com.uisrael.cursos.servicio.IInscripcionServicio;

@Controller
public class InscripcionControlador {

	@Autowired
	private IInscripcionServicio servicioInscripcion;

	@Autowired
	private ICursoServicio servicioCurso;

	@Autowired
	private IEstudianteServicio servicioEstudiante;
	List<Curso> listaCursos;
	List<Estudiante> listaEstudiantes;

	@GetMapping("/listainscripcion")
	public String listarInscripcion(Model model) {
		List<Inscripcion> lista = servicioInscripcion.listaInscripcion();
		model.addAttribute("lista", lista);
		return "/inscripcion/listar";
	}

	@GetMapping("/nuevoinscripcion") // url de llamada mapeo de url
	public String crearInscripcion(Model model) {
		listaCursos = servicioCurso.listarCursos();
		listaEstudiantes = servicioEstudiante.listarEstudiantes();
		model.addAttribute("nuevoInscripcion", new Inscripcion());
		model.addAttribute("listaCursos", listaCursos);
		model.addAttribute("listaEstudiantes", listaEstudiantes);
		return "/inscripcion/inscripcion"; // ruta fìsca de la pagina
	}

	// guardar
	@PostMapping("/insertarinscripcion")
	public String guardarInscripcion(@ModelAttribute("nuevoIncripcion") Inscripcion nuevoInscripcion) {
		nuevoInscripcion.setFechaInscripcion(new Date());
		servicioInscripcion.insertarInscripcion(nuevoInscripcion);
		return "redirect:/listainscripcion";

	}

	// editar
	@GetMapping("/editarinscripcion/{idInscripcion}")
	public String editarCurso(@PathVariable(value = "idInscripcion") int idInscripcion, Model model) {
		listaCursos = servicioCurso.listarCursos();
		listaEstudiantes = servicioEstudiante.listarEstudiantes();
		Inscripcion recuperado = servicioInscripcion.buscarId(idInscripcion);
		model.addAttribute("listaCursos", listaCursos);
		model.addAttribute("listaEstudiantes", listaEstudiantes);
		model.addAttribute("nuevoInscripcion", recuperado);
		return "/inscripcion/inscripcion";
	}

	// eliminar
	@GetMapping("/eliminarinscripcion/{idInscripcion}")
	public String eliminarCurso(@PathVariable(value = "idInscripcion") int idInscripcion, Model model) {
		servicioInscripcion.eliminarInscripcion(idInscripcion);
		return "redirect:/listar";
	}

}
