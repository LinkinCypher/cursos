package com.uisrael.cursos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;


import com.uisrael.cursos.modelo.CursohasContenido;

public interface ICursoHasContenidoRepositorio extends JpaRepository<CursohasContenido, Integer> {

}
