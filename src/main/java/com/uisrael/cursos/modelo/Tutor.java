package com.uisrael.cursos.modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_tutor")
public class Tutor implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTutor;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String correo;
    @Column(name = "telf", length = 10)
    private int telefono;
    private boolean estado;
}
