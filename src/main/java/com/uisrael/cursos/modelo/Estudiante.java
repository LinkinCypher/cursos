package com.uisrael.cursos.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_estudiante")
public class Estudiante implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstudiante;
    private String nombre;
	private String apellido;
	@Column(name = "ci", length = 15)
	private String cedulaIdentidad;
	@Column(nullable = true)
	private String correo;
	private String direccion;
	
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	private boolean estado;

	@OneToMany(mappedBy = "fkEstudiante")
	private List<Inscripcion> listaInscripciones= new ArrayList<>();
	
}
