package com.uisrael.cursos.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Inscripcion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInscripcion;
	private Date fechaInscripcion;
	private boolean estado;
	
	@ManyToOne
	@JoinColumn(name="id_Estudiante")
	private Estudiante fkEstudiante;

	@ManyToOne
	@JoinColumn(name="id_curso")
	private Curso FkCurso;
}
