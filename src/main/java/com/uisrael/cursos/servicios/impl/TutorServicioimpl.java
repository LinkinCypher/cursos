package com.uisrael.cursos.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Tutor;
import com.uisrael.cursos.repositorio.ITutorRepositorio;
import com.uisrael.cursos.servicios.ITutorServicio;
@Service

public class TutorServicioimpl implements ITutorServicio{
	@Autowired
	ITutorRepositorio tutorRepositorio;
	
	@Override
	public void insertarTutor(Tutor nuevoTutor) {
		try {
			tutorRepositorio.save(nuevoTutor);
		} catch (Exception e) {
			System.out.println("Error al insertar Tutor del curso");
		}
		
	}

	@Override
	public void actualizarTutor(Tutor editarTutor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Tutor> listarTutor() {

		try {
			return tutorRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error al listar Tutores del curso");
			return null;
		}
		
	}

}
