package com.uisrael.cursos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.uisrael.cursos.modelo.Curso;
import com.uisrael.cursos.servicio.ICursoServicio;


@Controller
public class CursoControlador {
	
	@Autowired
	public ICursoServicio servicioCurso;

	//Nuevo
	@GetMapping("/nuevocurso")  //url de llamada mapeo de url
	public String crearCursos(Model model) {
		model.addAttribute("nuevoCurso", new Curso());
		return "/cursos/cursos"; //ruta fìsca de la pagina 
	}
	
	//Listar
	@GetMapping("/listarcursos")  
	public String listarCursos( Model model) {
		List<Curso> listaCursos= servicioCurso.listarCursos(); //recuperando informacion de la BD
		model.addAttribute("lista", listaCursos);
		return "/cursos/listacursos"; //ruta fìsca de la pagina 
	}
	
	//guardar
	@PostMapping("/insertarcurso")
	public String guardarCurso(@ModelAttribute("nuevoCurso") Curso nuevoCurso) {
		servicioCurso.insertarCurso(nuevoCurso);
		return "redirect:/listarcursos";
		
	}
	
	//editar
	@GetMapping("/editarcurso/{idcurso}")
	public String editarCurso(@PathVariable(value="idcurso") int idCurso, Model model) {
		Curso cursorecuperado= servicioCurso.buscarCursoId(idCurso);
		model.addAttribute("nuevoCurso", cursorecuperado);
		return "/cursos/cursos";
	}
	
	//eliminar
	@GetMapping("/eliminarcurso/{idcurso}")
	public String eliminarCurso(@PathVariable(value="idcurso") int idCurso, Model model) {
		servicioCurso.eliminarCurso(idCurso);
		return "redirect:/listarcursos";
	}
	
	
}
