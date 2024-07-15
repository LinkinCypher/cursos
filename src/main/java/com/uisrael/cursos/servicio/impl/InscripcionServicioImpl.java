package com.uisrael.cursos.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.cursos.modelo.Inscripcion;
import com.uisrael.cursos.repositorio.IInscripcionRepositorio;
import com.uisrael.cursos.servicio.IInscripcionServicio;

@Service
@Component
public class InscripcionServicioImpl implements IInscripcionServicio {

	@Autowired
	private IInscripcionRepositorio repositorioInscripcion;

	@Override
	public void insertarInscripcion(Inscripcion nueva) {

		try {
			repositorioInscripcion.save(nueva);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public List<Inscripcion> listaInscripcion() {
		return repositorioInscripcion.findAll();
	}

	@Override
	public Inscripcion buscarId(int id) {
		// TODO Auto-generated method stub
		return repositorioInscripcion.findById(id).get();
	}

	@Override
	public void eliminarInscripcion(int id) {
		repositorioInscripcion.deleteById(id);
		
	}
	
	

}
