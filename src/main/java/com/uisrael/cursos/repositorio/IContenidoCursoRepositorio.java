package com.uisrael.cursos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.cursos.modelo.ContenidoCurso;


public interface IContenidoCursoRepositorio extends JpaRepository<ContenidoCurso, Integer> {

}
