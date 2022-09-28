package com.alkemy.disney.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

@Data

@Entity
public class Genero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Lob
	@Column(name = "fileimage", columnDefinition = "BLOB")
	private byte[] fileImage;
	
	@OneToMany(mappedBy = "genero")
	private List<PeliculaOSerie> peliOSerie = new ArrayList<PeliculaOSerie>();
	
	
}
