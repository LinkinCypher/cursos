package com.uisrael.cursos.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Inscripcion;
import com.uisrael.cursos.repositorio.IInscripcionRepositorio;
import com.uisrael.cursos.servicios.IInscripcionServicio;
@Service
public class InscripcionServicioimpl implements IInscripcionServicio{

	@Autowired
	IInscripcionRepositorio inscripcionRepositorio;
	
	@Override
	public void insertarInscripcion(Inscripcion nuevoInscripcion) {
		try {
			inscripcionRepositorio.save(nuevoInscripcion);
		} catch (Exception e) {
			System.out.println("Error en la inscripcion del curso");
		}
		
	}

	@Override
	public void actualizarInscripcion(Inscripcion editarInscripcion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Inscripcion> listarInscripcion() {
		try {
			return inscripcionRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error al listar inscripciones del curso");
			return null;
		}

	}

}
