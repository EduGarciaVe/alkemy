package com.alkemy.disney.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor

@Data

@Entity
public class PeliculaOSerie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Lob
	@Column(name="fileimage", columnDefinition = "BLOB")
	private byte[] fileImage;
	private String titulo;
	private LocalDate fechaCreacion;
	private int calificacion;
	
	@ManyToMany(mappedBy = "peliSerie")
	private List<Personaje> personaje = new ArrayList<Personaje>();
	
	@ManyToOne (cascade = CascadeType.PERSIST)
	@JoinColumn (name = "id_genero")
	private Genero genero;
}
