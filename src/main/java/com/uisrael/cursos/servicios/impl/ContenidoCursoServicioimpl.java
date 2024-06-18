package com.uisrael.cursos.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.ContenidoCurso;
import com.uisrael.cursos.repositorio.IContenidoCursoRepositorio;
import com.uisrael.cursos.servicios.IContenidoCursoServicio;
@Service

public class ContenidoCursoServicioimpl implements IContenidoCursoServicio{

	@Autowired
	IContenidoCursoRepositorio contenidoCursoRepositorio;
	
	@Override
	public void insertarContenidoCurso(ContenidoCurso nuevoContenidoCurso) {
		try {
			contenidoCursoRepositorio.save(nuevoContenidoCurso);
		} catch (Exception e) {
			System.out.println("Error al insertar Conenido del curso");
		}
		
	}

	@Override
	public void actualizarContenidoCurso(ContenidoCurso editarContenidoCurso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ContenidoCurso> listarContenidoCurso() {
		try {
			return contenidoCursoRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error al listar Conenido del curso");
			return null;
		}	
	}

}
