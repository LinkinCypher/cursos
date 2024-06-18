package com.uisrael.cursos.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Horariocursos;
import com.uisrael.cursos.repositorio.IHorarioCursoRepositorio;
import com.uisrael.cursos.servicios.IHorarioCursoServicio;

@Service
public class HorarioCursosServicioimpl implements IHorarioCursoServicio{

	@Autowired
	IHorarioCursoRepositorio horarioCursoRepositorio;
	
	@Override
	public void insertarHorarioCurso(Horariocursos nuevoHorarioCursos) {
		try {
			horarioCursoRepositorio.save(nuevoHorarioCursos);
		} catch (Exception e) {
			System.out.println("Error al insertar Horario del curso");
		}
		
	}

	@Override
	public void actualizarHorarioCurso(Horariocursos editarHorariocursos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Horariocursos> listarHorariocursos() {
		try {
			return horarioCursoRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error al Listar Horario del curso");
			return null;
		}
	
	}

}
