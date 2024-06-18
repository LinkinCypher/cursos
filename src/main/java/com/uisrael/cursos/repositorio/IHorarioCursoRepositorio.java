package com.uisrael.cursos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.cursos.modelo.Horariocursos;

public interface IHorarioCursoRepositorio extends JpaRepository<Horariocursos, Integer> {

}
