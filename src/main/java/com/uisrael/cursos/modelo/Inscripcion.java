package com.uisrael.cursos.modelo;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_inscripcion")
public class Inscripcion implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInscripcion;
	private Date fechainscripcion;
	private boolean estado;

	@ManyToOne
	@JoinColumn(name = "id_Estudiante")
	private Estudiante fkEstudiante;
}
