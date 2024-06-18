package com.uisrael.cursos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursos.modelo.Curso;


public interface ICursoRepositorio extends JpaRepository<Curso, Integer> {

}
