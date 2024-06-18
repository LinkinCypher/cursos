package com.uisrael.cursos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursos.modelo.Estudiante;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer> {

}
