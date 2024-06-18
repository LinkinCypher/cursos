package com.uisrael.cursos.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Estudiante;
import com.uisrael.cursos.repositorio.IEstudianteRepositorio;
import com.uisrael.cursos.servicios.IEstudianteServicio;

@Service
@Component
public class EstudianteServicioimpl implements IEstudianteServicio{

	@Autowired
	IEstudianteRepositorio estudianteRepositorio;
	@Override
	public void insertarEstudiante(Estudiante nuevoEstudiante) {
		try {
			estudianteRepositorio.save(nuevoEstudiante);
		} catch (Exception e) {
			System.out.println("Error al insertar estudiante");
		}
		
	}

	@Override
	public List<Estudiante> listarEstudiantes() {
		try {
			return estudianteRepositorio.findAll();
		} catch (Exception e) {
			System.out.println("Error al listar estudiante");
			return null;
		}
	}

}
