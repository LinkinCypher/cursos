package com.uisrael.cursos.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;
	private String nombre;
	private String descripcion;
	private double costo;
	private Date fechaRegistro;
	private boolean estado;
	@OneToMany(mappedBy = "FkCurso")
	private List<Inscripcion> listaInscripcion= new ArrayList<>();
	
	

}
