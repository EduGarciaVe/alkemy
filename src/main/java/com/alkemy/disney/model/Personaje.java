package com.alkemy.disney.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "personaje")
public class Personaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Lob
	@Column(name = "fileimage", columnDefinition = "BLOB")
	private byte[] fileImage;
	private String nombre;
	private int edad;
	private float peso;
	private String historia;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(
			name="personaje_peliculaoserie",
			joinColumns = @JoinColumn(name = "id_personaje"),
			inverseJoinColumns = @JoinColumn(name = "id_peliculaoserie")
	)
	private List<PeliculaOSerie> peliSerie = new ArrayList<PeliculaOSerie>();
}
