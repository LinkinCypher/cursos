package com.uisrael.cursos.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoControlador {

	@GetMapping("/nuevocurso")
	public String crearCursos() {
		return "/cursos/cursos";
	}
	
	@GetMapping("/listarcursos")
	public String listaCursos() {
	
		return "/cursos/listacursos";
	}
	
}
