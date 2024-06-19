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

	@Override
	public Estudiante buscarEstudianteId(String cedula) {
		try {
            return estudianteRepositorio.buscarEstudianteId(cedula);
        } catch (Exception e) {
            System.out.println("Error al buscar el estudiante por cédula");
            return null;
        }
	}

	@Override
	public List<Estudiante> findByNombre(String nombre) {
		try {
            return estudianteRepositorio.findByNombre(nombre);
        } catch (Exception e) {
            System.out.println("Error al buscar el estudiante por nombre");
            return null;
        }
	}

	@Override
	public List<Estudiante> findByApellido(String apellido) {
		try {
            return estudianteRepositorio.findByApellido(apellido);
        } catch (Exception e) {
            System.out.println("Error al buscar el estudiante por apellido");
            return null;
        }
	}

	@Override
	public List<Estudiante> buscarPorFechas(int anioInicio, int anioFin) {
		try {
            return estudianteRepositorio.buscarPorFechas(anioInicio,anioFin);
        } catch (Exception e) {
            System.out.println("Error al buscar el estudiante por fecha");
            return null;
        }
	}

}
